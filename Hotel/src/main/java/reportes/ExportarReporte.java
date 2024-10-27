/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

import conexion.Conexion;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utils.Utils;

/**
 *
 * @author Cristobal Barrios
 */
public class ExportarReporte {

    Connection conn = null;
    Conexion connect = new Conexion();
    ResultSet rs = null;
    PreparedStatement pst = null;
    String carpetaReportes = "reportes\\";

    public void exportarPdfComoTabla(String qry, String nombreArchivoPdf, String titulo) {
        try {
            conn = connect.getConnection();

            if (conn != null) {
                //Crea un nuevo documento de itextpdf
                Document documento = new Document();

                try {
                    PdfWriter.getInstance(documento, new FileOutputStream(carpetaReportes + nombreArchivoPdf));
                    documento.open();
                    documento.add(new Paragraph(titulo + "\n\n"));

                    // Crea la onsulta SQL para obtener los datos
                    pst = conn.prepareStatement(qry);

                    //Ejecuta la consulta
                    ResultSet rs = pst.executeQuery();
                    ResultSetMetaData metaData = rs.getMetaData();
                    int numeroDeColumnas = metaData.getColumnCount();

                    // Crear tabla con una cantidad de columnas dinámica
                    PdfPTable table = new PdfPTable(numeroDeColumnas);
                    table.setWidthPercentage(100);
                    Font fuenteEncabezado = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);

                    // Agrega encabezados dinámicamente según los metadatos del ResultSet
                    for (int i = 1; i <= numeroDeColumnas; i++) {
                        PdfPCell celdaEncabezado = new PdfPCell();
                        celdaEncabezado.setPhrase(new com.itextpdf.text.Phrase(metaData.getColumnLabel(i), fuenteEncabezado));
                        celdaEncabezado.setHorizontalAlignment(Element.ALIGN_CENTER); // Alinear el encabezado al centro
                        table.addCell(celdaEncabezado);
                    }

                    Font fuenteDatos = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);

                    // Agrega filas dinámicamente según los metadatos del ResultSet
                    while (rs.next()) {
                        for (int i = 1; i <= numeroDeColumnas; i++) {
                            PdfPCell celdaDato = new PdfPCell();
                            celdaDato.setPhrase(new com.itextpdf.text.Phrase(rs.getString(i), fuenteDatos));
                            table.addCell(celdaDato);
                        }
                    }

                    // Agrega la tabla al documento
                    documento.add(table);
                    JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Información exportada al archivo PDF correctamente"));
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error exportando la información al PDF: " + e.getMessage()));
                } finally {
                    documento.close();
                    try {
                        conn.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error al cerrar la conexión: " + sqle.getMessage()), "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }
}
