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
                    int columnCount = metaData.getColumnCount();

                    // Crear tabla con una cantidad de columnas dinámica
                    PdfPTable table = new PdfPTable(columnCount);

                    // Agrega encabezados dinámicamente según los metadatos del ResultSet
                    for (int i = 1; i <= columnCount; i++) {
                        table.addCell(metaData.getColumnLabel(i));
                    }

                    // Agrega filas dinámicamente según los metadatos del ResultSet
                    while (rs.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            String cellValue = rs.getString(i);
                            table.addCell(cellValue != null ? cellValue : ""); // Maneja valores nulos
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
