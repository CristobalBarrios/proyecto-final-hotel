/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import conexion.Conexion;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import reportes.ExportarReporte;
import utils.Utils;

/**
 *
 * @author hecto
 */
public class Habitaciones extends javax.swing.JInternalFrame {

    Connection conn = null;
    Conexion Conect = new Conexion();
    String qry = "";
    ResultSet rs = null;
    PreparedStatement pr = null;

    public Habitaciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        txtDescripcion = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtidHabitacion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNumeroHabitacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPrecioNoche = new javax.swing.JLabel();
        txtprecioNoche = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbEstadoHabitacion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        cbTipoHabitacion = new javax.swing.JComboBox<>();
        btcExportarReporte = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setPreferredSize(new java.awt.Dimension(750, 550));

        txtDescripcion.setText("Descripción");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Habitaciones");

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

        jLabel12.setText(" ID Habitación");

        jLabel13.setText("Numero Habitación");

        jLabel14.setText("Tipo Habitación");

        txtPrecioNoche.setText("Precio Por Noche");

        jLabel3.setText("Capacidad");

        jLabel2.setText("Estado");

        cbEstadoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        cbTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Doble", "Suite", " " }));

        btcExportarReporte.setText("Generar Reporte");
        btcExportarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcExportarReporteActionPerformed(evt);
            }
        });

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
                        .addGap(213, 213, 213)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstadoHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCapacidad))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(cbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtprecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(BtnGuardar)
                        .addGap(49, 49, 49)
                        .addComponent(BtnModificar)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEliminar)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnConsultar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(btcExportarReporte)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(cbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcion)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioNoche)
                            .addComponent(txtprecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbEstadoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnConsultar))
                .addGap(46, 46, 46)
                .addComponent(btcExportarReporte)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here: guardar de
        try {
            conn = Conect.getConnection();

            if (conn != null) {
                String qry = "INSERT INTO habitaciones (numero_habitacion, tipo_habitacion, descripcion, precio_noche, capacidad, estado_habitacion) VALUES (?,?,?,?,?,?)";
                PreparedStatement pr = conn.prepareStatement(qry);

                // Asigna los valores
                pr.setString(1, txtNumeroHabitacion.getText());
                pr.setString(2, cbTipoHabitacion.getSelectedItem().toString());
                pr.setString(3, txtdescripcion.getText());

                // Manejo del precio con BigDecimal, con un catch para evitar errores de formato
                try {
                    pr.setBigDecimal(4, new BigDecimal(txtprecioNoche.getText().replace(",", ".")));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Por favor, ingresa un valor válido para el precio."), "Error de formato", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                pr.setInt(5, Integer.parseInt(txtCapacidad.getText())); // Convertir a entero

                // Convertir el estado de la habitación a entero (0 o 1)
                pr.setInt(6, Integer.parseInt(cbEstadoHabitacion.getSelectedItem().toString()));

                int rowsAffected = pr.executeUpdate();

                // Verificación para saber si la habitación fue guardada
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("La habitación ha sido registrada exitosamente."));

                    // Limpiar campos del formulario
                    txtNumeroHabitacion.setText("");
                    cbTipoHabitacion.setSelectedIndex(0);
                    txtdescripcion.setText("");
                    txtprecioNoche.setText("");
                    txtCapacidad.setText("");
                    cbEstadoHabitacion.setSelectedIndex(0);
                }
            } else {
                JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Error al conectar con la base de datos."), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Error al guardar los datos: " + e.getMessage()), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Error al cerrar la conexión: " + e.getMessage()), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here: modificar
        try {
            conn = Conect.getConnection();

            if (conn != null) {
                // Consulta SQL para actualizar una habitación existente
                String qry = "UPDATE habitaciones SET numero_habitacion=?, tipo_habitacion=?, descripcion=?, precio_noche=?, capacidad=?, estado_habitacion=? WHERE ID_habitacion=?";
                pr = conn.prepareStatement(qry);

                // Asignamos los valores actualizados a la consulta
                pr.setString(1, txtNumeroHabitacion.getText());
                pr.setString(2, cbTipoHabitacion.getSelectedItem().toString());
                pr.setString(3, txtDescripcion.getText());
                pr.setBigDecimal(4, new BigDecimal(txtprecioNoche.getText()));
                pr.setInt(5, Integer.parseInt(txtCapacidad.getText()));
                pr.setString(6, cbEstadoHabitacion.getSelectedItem().toString());

                // ID de la habitación a modificar
                pr.setInt(7, Integer.parseInt(txtidHabitacion.getText()));

                // para ejecutar la modificacion
                int rowsAffected = pr.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("La habitación ha sido actualizada exitosamente."));
                    // Limpiar campos
                    txtidHabitacion.setText("");
                    txtNumeroHabitacion.setText("");
                    cbTipoHabitacion.setSelectedIndex(0);
                    txtDescripcion.setText("");
                    txtprecioNoche.setText("");
                    txtCapacidad.setText("");
                    cbEstadoHabitacion.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("No se encontró ninguna habitación con el ID proporcionado."));
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Por favor, ingrese valores válidos."), "Error de formato", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Error al modificar la habitación: " + e.getMessage()), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pr != null) {
                    pr.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Error al cerrar la conexión: " + e.getMessage()), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here: eliminiar
        try {
            conn = Conect.getConnection();

            if (conn != null) {
                String codValue = txtidHabitacion.getText();

                if (codValue != null && !codValue.trim().isEmpty()) {
                    // Consulta SQL para eliminar una habitación
                    String qry = "DELETE FROM habitaciones WHERE ID_habitacion=?";
                    pr = conn.prepareStatement(qry);
                    pr.setInt(1, Integer.parseInt(codValue));

                    // Ejecutamos la eliminación
                    int rowsDeleted = pr.executeUpdate();

                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("La habitación ha sido eliminada exitosamente."));
                        // Limpiar campos
                        txtidHabitacion.setText("");
                        txtNumeroHabitacion.setText("");
                        cbTipoHabitacion.setSelectedIndex(0);
                        txtDescripcion.setText("");
                        txtprecioNoche.setText("");
                        txtCapacidad.setText("");
                        cbEstadoHabitacion.setSelectedIndex(0);
                    } else {
                        JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("No se encontró ninguna habitación con el ID proporcionado."));
                    }
                } else {
                    JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Por favor, ingrese un ID válido."));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Error al eliminar la habitación: " + e.getMessage()), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pr != null) {
                    pr.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Error al cerrar la conexión: " + e.getMessage()), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        // TODO add your handling code here:consultar
        try {
            conn = Conect.getConnection();

            if (conn != null) {
                String codValue = txtidHabitacion.getText();  // ID de la habitación a consultar

                if (codValue != null && !codValue.trim().isEmpty()) {
                    // Consulta SQL para obtener los datos de una habitación
                    String qry = "SELECT * FROM habitaciones WHERE ID_habitacion=?";
                    pr = conn.prepareStatement(qry);
                    pr.setInt(1, Integer.parseInt(codValue));

                    // Ejecutamos la consulta
                    rs = pr.executeQuery();

                    if (rs.next()) {
                        // Asignamos los valores a los campos
                        txtNumeroHabitacion.setText(rs.getString("numero_habitacion"));
                        cbTipoHabitacion.setSelectedItem(rs.getString("tipo_habitacion"));
                        txtDescripcion.setText(rs.getString("descripcion"));
                        txtprecioNoche.setText(rs.getString("precio_noche"));
                        txtCapacidad.setText(rs.getString("capacidad"));
                        cbEstadoHabitacion.setSelectedItem(rs.getString("estado_habitacion"));

                        JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Datos de la habitación recuperados exitosamente."));
                    } else {
                        JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("No se encontró ninguna habitación con el ID proporcionado."));
                    }
                } else {
                    JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Por favor, ingrese un ID válido."));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Error al consultar los datos: " + e.getMessage()), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pr != null) {
                    pr.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,  Utils.convertirMensajeHtml("Error al cerrar la conexión."), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btcExportarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcExportarReporteActionPerformed
        ExportarReporte exportar = new ExportarReporte();
        String qry = Utils.leerQueryDesdeArchivo("reporte-habitaciones.sql");
        exportar.exportarPdfComoTabla(qry, "Reporte Habitaciones.pdf", "Habitaciones: ");
    }//GEN-LAST:event_btcExportarReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton btcExportarReporte;
    private javax.swing.JComboBox<String> cbEstadoHabitacion;
    private javax.swing.JComboBox<String> cbTipoHabitacion;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JTextField txtNumeroHabitacion;
    private javax.swing.JLabel txtPrecioNoche;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtidHabitacion;
    private javax.swing.JTextField txtprecioNoche;
    // End of variables declaration//GEN-END:variables
}
