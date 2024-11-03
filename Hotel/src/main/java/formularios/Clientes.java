/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import reportes.ExportarReporte;
import utils.Utils;

/**
 *
 * @author hecto
 */
public class Clientes extends javax.swing.JInternalFrame {

    Connection conn = null;
    Conexion Conect = new Conexion();
    String qry = "";
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Clientes() {
        initComponents();
        setFrameIcon(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtFechaRegistro = new javax.swing.JTextField();
        txtidCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        btcExportarReporte = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 575));

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar ");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        jLabel6.setText("Correo Electrónico:");

        jLabel1.setText("Nombres :");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("                   Clientes");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellidos :");

        jLabel3.setText("Ciudad :");

        jLabel7.setText("Fecha de Registro");

        jLabel9.setText("ID Cliente");

        jLabel4.setText("Dirección:");

        txtidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Teléfono:");

        jLabel8.setText("NIT");

        btcExportarReporte.setText("Generar Reporte");
        btcExportarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcExportarReporteActionPerformed(evt);
            }
        });

        jMenuBar1.setMaximumSize(new java.awt.Dimension(300, 800));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(300, 800));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtidCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnit)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtciudad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(BtnGuardar)
                                .addGap(55, 55, 55)
                                .addComponent(BtnModificar)
                                .addGap(65, 65, 65)
                                .addComponent(BtnEliminar)
                                .addGap(81, 81, 81)
                                .addComponent(BtnConsultar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btcExportarReporte)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtidCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnConsultar))
                .addGap(39, 39, 39)
                .addComponent(btcExportarReporte)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidClienteActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here: guardar de
        try {
            conn = Conect.getConnection();
            if (conn != null) {
                // Consulta SQL ajustada para incluir el campo 'codigo'
                qry = "INSERT INTO cliente(nombre, apellido, ciudad, direccion, correo, telefono,nit, fecha_registro) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement pr = conn.prepareStatement(qry);

                // Asigna los valores
                pr.setString(1, txtnombre.getText());
                pr.setString(2, txtapellido.getText());
                pr.setString(3, txtciudad.getText());
                pr.setString(4, txtdireccion.getText());
                pr.setString(5, txtcorreo.getText());
                pr.setString(6, txttelefono.getText());
                pr.setString(7, txtnit.getText());
                pr.setDate(8, java.sql.Date.valueOf(txtFechaRegistro.getText()));

                pr.executeUpdate();
                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Los datos del cliente han sido guardados exitosamente."));

                //Limpiar campos
                txtnombre.setText("");
                txtapellido.setText("");
                txtciudad.setText("");
                txtdireccion.setText("");
                txtcorreo.setText("");
                txttelefono.setText("");
                txtnit.setText("");
                txtFechaRegistro.setText("");
            } else {
                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error al conectar con la base de datos."), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error al guardar los datos: " + sqle.getMessage()), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error en el formato de los datos: Verifique los valores ingresados."), "Error de formato", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error al cerrar la conexión: " + sqle.getMessage()), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here: modificar
        try {
            conn = Conect.getConnection();
            String codValue = txtidCliente.getText();

            // Verificamos que la conexión y el valor del código sean válidos
            if (conn != null && !codValue.isEmpty()) {
                // Query para actualizar los datos en la tabla 'cliente'
                qry = "UPDATE cliente SET nombre=?, apellido=?, ciudad=?, direccion=?, correo=?, telefono=?, nit=?, fecha_registro=? WHERE id_cliente=?";

                PreparedStatement pr = conn.prepareStatement(qry);

                // Asignamos los valores actualizados
                pr.setString(1, txtnombre.getText());
                pr.setString(2, txtapellido.getText());
                pr.setString(3, txtciudad.getText());
                pr.setString(4, txtdireccion.getText());
                pr.setString(5, txtcorreo.getText());
                pr.setString(6, txttelefono.getText());
                pr.setString(7, txtnit.getText());
                pr.setDate(8, java.sql.Date.valueOf(txtFechaRegistro.getText()));
                pr.setInt(9, Integer.parseInt(codValue));

                // Ejecutamos la actualización
                pr.executeUpdate();

                // Mostramos un mensaje de confirmación
                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Los datos del cliente han sido actualizados exitosamente."));

                // Limpiar todos los campos después de la modificación
                txtnombre.setText("");
                txtapellido.setText("");
                txtciudad.setText("");
                txtdireccion.setText("");
                txtcorreo.setText("");
                txttelefono.setText("");
                txtnit.setText("");
                txtFechaRegistro.setText("");
                txtidCliente.setText("");
            } else {
                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Por favor, ingrese un id válido para actualizar."));
            }
        } catch (SQLException sqle) {
            // Manejamos cualquier error en SQL
            System.out.println(sqle.getMessage());
        } finally {
            // Cerramos la conexión en el bloque 'finally'
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                System.out.println(sqle.getMessage());
            }
        }

    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here: eliminiar 
        try {
            conn = Conect.getConnection();
            String codValue = txtidCliente.getText();

            // Verificar la conexion
            if (conn != null && !codValue.isEmpty()) {
                // Verificamos si el ID es numérico
                try {
                    int idCliente = Integer.parseInt(codValue);

                    // Query para eliminar el registro en la tabla 'cliente'
                    qry = "DELETE FROM cliente WHERE id_cliente=?";

                    PreparedStatement pr = conn.prepareStatement(qry);

                    // Asignamos el valor del ID que se debe eliminar
                    pr.setInt(1, idCliente);

                    // Ejecutamos la eliminación
                    int rowsAffected = pr.executeUpdate();

                    // Verificamos si se eliminó algún registro
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("El cliente ha sido eliminado exitosamente."));

                        txtidCliente.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("No se encontró ningún cliente con el ID proporcionado."));
                    }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("El ID debe ser un valor numérico válido."), "Error de formato", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Por favor, ingrese un ID válido para eliminar."), "Error de validación", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error al eliminar los datos: " + sqle.getMessage()), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error al cerrar la conexión: " + sqle.getMessage()), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        // TODO add your handling code here:consultar
        try {
            conn = Conect.getConnection();
            String sql = "SELECT * FROM cliente WHERE id_cliente=?";

            // Preparamos el query
            PreparedStatement pst = conn.prepareStatement(sql);

            // ID a consultar
            pst.setInt(1, Integer.parseInt(txtidCliente.getText()));

            ResultSet rs = pst.executeQuery();

            // Verificamos si se encontraron datos
            if (rs.next()) {
                // Asignamos los valores recuperados a los campos de texto
                txtnombre.setText(rs.getString("nombre"));
                txtapellido.setText(rs.getString("apellido"));
                txtciudad.setText(rs.getString("ciudad"));
                txtdireccion.setText(rs.getString("direccion"));
                txtcorreo.setText(rs.getString("correo"));  // 
                txttelefono.setText(rs.getString("telefono"));
                txtnit.setText(rs.getString("nit"));  // 
                txtFechaRegistro.setText(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("fecha_registro")));

                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Datos del cliente recuperados exitosamente."));
            } else {
                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("No se encontraron datos para el ID especificado."));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Por favor, ingrese un ID numérico válido."), "Error de formato", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error al consultar los datos: " + e.getMessage()), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, Utils.convertirMensajeHtml("Error al cerrar la conexión: " + ex.getMessage()), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btcExportarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcExportarReporteActionPerformed
        ExportarReporte exportar = new ExportarReporte();
        String qry = Utils.leerQueryDesdeArchivo("reporte-clientes.sql");
        exportar.exportarPdfComoTabla(qry, "Reporte Clientes.pdf", "Clientes: ");
    }//GEN-LAST:event_btcExportarReporteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton btcExportarReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txtFechaRegistro;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidCliente;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
