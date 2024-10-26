/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;
import Conexion.Conexion;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author hecto
 */
public class Factura extends javax.swing.JInternalFrame {
Connection conn = null;
    Conexion Conect = new Conexion();
    String qry = "";
    ResultSet rs = null;
    PreparedStatement pr = null;
    
    public Factura() {
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

        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtidCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtidReservacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtidFactura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtmontoTotal = new javax.swing.JTextField();
        txtfechaEmision = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdetalleFactura = new javax.swing.JTextArea();
        btnEmitirFactura = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 550));

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

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Facturacion");

        jLabel7.setText("Fecha de Emision");

        jLabel9.setText("ID Cliente");

        txtidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidClienteActionPerformed(evt);
            }
        });

        jLabel11.setText("ID Reservacion");

        jLabel12.setText("ID Factura");

        jLabel1.setText("Monto Total Q");

        jLabel2.setText("Detalle Factura");

        txtdetalleFactura.setColumns(20);
        txtdetalleFactura.setRows(5);
        jScrollPane1.setViewportView(txtdetalleFactura);

        btnEmitirFactura.setText("Emitir Factura");
        btnEmitirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirFacturaActionPerformed(evt);
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
                        .addGap(275, 275, 275)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtidReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(txtmontoTotal)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtfechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(212, 212, 212)))))))
                        .addGap(46, 46, 46)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(BtnGuardar)
                .addGap(18, 18, 18)
                .addComponent(BtnModificar)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar)
                .addGap(26, 26, 26)
                .addComponent(BtnConsultar)
                .addGap(18, 18, 18)
                .addComponent(btnEmitirFactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnConsultar, BtnEliminar, BtnGuardar, BtnModificar, btnEmitirFactura});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtidFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtidReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtmontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnConsultar)
                    .addComponent(btnEmitirFactura))
                .addGap(80, 80, 80))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnConsultar, BtnEliminar, BtnGuardar, BtnModificar, btnEmitirFactura});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidClienteActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here: guardar de
      try {
        conn = Conect.getConnection();
        if (conn != null) {
            // Consulta SQL para insertar una nueva factura
            String qry = "INSERT INTO facturas (ID_reservacion, ID_cliente, monto_total, detalles_factura) VALUES (?,?,?,?)";
            pr = conn.prepareStatement(qry);
            
            // Asigna los valores
            pr.setInt(1, Integer.parseInt(txtidReservacion.getText()));  
            pr.setInt(2, Integer.parseInt(txtidCliente.getText()));     
            pr.setBigDecimal(3, new BigDecimal(txtmontoTotal.getText()));
            pr.setString(4, txtdetalleFactura.getText());                
            pr.executeUpdate();
            JOptionPane.showMessageDialog(null, "La factura ha sido guardada exitosamente.");
            
            // Limpiar campos del formulario
            txtidReservacion.setText("");
            txtidCliente.setText("");
            txtmontoTotal.setText("");
            txtdetalleFactura.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException sqle) {
        JOptionPane.showMessageDialog(null, "Error al guardar la factura: " + sqle.getMessage(), "Error de SQL", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(null, "Error en el formato de los datos: Verifique los valores ingresados.", "Error de formato", JOptionPane.WARNING_MESSAGE);
    } finally {
        try {
            if (conn != null) conn.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + sqle.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here: modificar
         try {
        conn = Conect.getConnection();  

        String idFactura = txtidFactura.getText();  

        if (idFactura != null && !idFactura.trim().isEmpty()) {
            // Consulta SQL para actualizar la factura
            String qry = "UPDATE facturas SET ID_reservacion=?, ID_cliente=?, monto_total=?, fecha_emision=?, detalles_factura=? WHERE ID_factura=?";
            pr = conn.prepareStatement(qry);

            // Asignar los valores actualizados
            pr.setInt(1, Integer.parseInt(txtidReservacion.getText()));  
            pr.setInt(2, Integer.parseInt(txtidCliente.getText()));  
            pr.setDouble(3, Double.parseDouble(txtmontoTotal.getText()));  
            pr.setString(4, txtfechaEmision.getText()); 
            pr.setString(5, txtdetalleFactura.getText());  
            pr.setInt(6, Integer.parseInt(idFactura)); 

            int rowsAffected = pr.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Factura modificada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna factura con ese ID.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID de factura válido.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (pr != null) pr.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión.", "Error", JOptionPane.ERROR_MESSAGE);
        }
}

    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here: eliminiar 
          try {
        conn = Conect.getConnection();  

        String idFactura = txtidFactura.getText();  

        if (idFactura != null && !idFactura.trim().isEmpty()) {
            // Consulta SQL para eliminar la factura
            String qry = "DELETE FROM facturas WHERE ID_factura=?";
            pr = conn.prepareStatement(qry);
            pr.setInt(1, Integer.parseInt(idFactura));

            int rowsAffected = pr.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Factura eliminada exitosamente.");
                // Limpiar los campos después de la eliminación
                txtidReservacion.setText("");
                txtidCliente.setText("");
                txtmontoTotal.setText("");
                txtfechaEmision.setText("");
                txtdetalleFactura.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna factura con ese ID.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID de factura válido.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (pr != null) pr.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión.", "Error", JOptionPane.ERROR_MESSAGE);
        }
 
         }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        // TODO add your handling code here:consultar
        try {
        conn = Conect.getConnection();  

        String idFactura = txtidFactura.getText();  

        if (idFactura != null && !idFactura.trim().isEmpty()) {
            // Consulta para obtener los datos de la factura
            String qry = "SELECT * FROM facturas WHERE ID_factura=?";
            pr = conn.prepareStatement(qry);
            pr.setInt(1, Integer.parseInt(idFactura));

            rs = pr.executeQuery();

            if (rs.next()) {
                // Mostrar los datos de la factura
                txtidReservacion.setText(rs.getString("ID_reservacion"));
                txtidCliente.setText(rs.getString("ID_cliente"));
                txtmontoTotal.setText(rs.getString("monto_total"));
                txtfechaEmision.setText(rs.getString("fecha_emision"));
                txtdetalleFactura.setText(rs.getString("detalles_factura"));
                
                JOptionPane.showMessageDialog(null, "Factura encontrada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna factura con ese ID.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID de factura válido.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rs != null) rs.close();
            if (pr != null) pr.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión.", "Error", JOptionPane.ERROR_MESSAGE);
        }
}

        
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnEmitirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirFacturaActionPerformed
        // TODO add your handling code here:
        try {
        conn = Conect.getConnection(); 

        String idFactura = txtidFactura.getText();  

        if (idFactura != null && !idFactura.trim().isEmpty()) {
            // Consulta para obtener los datos de la factura y el cliente
            String qry = "SELECT f.ID_factura, f.monto_total, f.fecha_emision, f.detalles_factura, "
                       + "c.nombre, c.apellido, c.NIT, c.direccion, c.telefono "
                       + "FROM facturas f "
                       + "JOIN cliente c ON f.ID_cliente = c.ID_cliente "
                       + "WHERE f.ID_factura = ?";
            
            pr = conn.prepareStatement(qry);
            pr.setInt(1, Integer.parseInt(idFactura));

            rs = pr.executeQuery();

            if (rs.next()) {
                // Obtener los datos de la factura y el cliente
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String nit = rs.getString("NIT");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String detallesFactura = rs.getString("detalles_factura");
                double montoTotal = rs.getDouble("monto_total");
                String fechaEmision = rs.getString("fecha_emision");

                // Mostrar los datos de la factura en un cuadro de diálogo
                JOptionPane.showMessageDialog(null, 
                    "Factura emitida:\n" +
                    "Cliente: " + nombre + " " + apellido + "\n" +
                    "NIT: " + nit + "\n" +
                    "Dirección: " + direccion + "\n" +
                    "Teléfono: " + telefono + "\n" +
                    "Detalles: " + detallesFactura + "\n" +
                    "Monto Total: Q" + montoTotal + "\n" +
                    "Fecha de Emisión: " + fechaEmision,
                    "Factura Emitida",
                    JOptionPane.INFORMATION_MESSAGE
                );

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna factura con ese ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID de factura válido.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rs != null) rs.close();
            if (pr != null) pr.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_btnEmitirFacturaActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton btnEmitirFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtdetalleFactura;
    private javax.swing.JTextField txtfechaEmision;
    private javax.swing.JTextField txtidCliente;
    private javax.swing.JTextField txtidFactura;
    private javax.swing.JTextField txtidReservacion;
    private javax.swing.JTextField txtmontoTotal;
    // End of variables declaration//GEN-END:variables
}