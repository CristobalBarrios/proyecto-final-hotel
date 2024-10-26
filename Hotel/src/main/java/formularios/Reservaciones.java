/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import conexion.Conexion;
import reportes.ExportarReporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import utils.Utils;

/**
 *
 * @author hecto
 */
public class Reservaciones extends javax.swing.JInternalFrame {

    Connection conn = null;
    Conexion Conect = new Conexion();
    String qry = "";
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Reservaciones() {
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
        jLabel6 = new javax.swing.JLabel();
        txtfechaReserva = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtidReservacion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtidCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtidHabitacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtfechaEntrada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfechaSalida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbnoHuesped = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbestadoReserva = new javax.swing.JComboBox<>();
        btcExportarReporte = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setTitle("Reservaciones");
        setPreferredSize(new java.awt.Dimension(750, 550));

        jLabel6.setText("Fecha Reserva");

        txtfechaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaReservaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Reservaciones");

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

        jLabel12.setText(" ID Reservacion");

        jLabel13.setText("ID Cliente");

        jLabel14.setText("ID Habitaciones");

        jLabel1.setText("Fecha de Entrada");

        jLabel2.setText("Fecha de Salida");

        jLabel3.setText("Numero Huespedes");

        cbnoHuesped.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 1", " 2", " 3", " 4", "5" }));
        cbnoHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnoHuespedActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado Reserva");

        cbestadoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        cbestadoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbestadoReservaActionPerformed(evt);
            }
        });

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
                        .addGap(241, 241, 241)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btcExportarReporte))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnGuardar)
                                .addGap(39, 39, 39)
                                .addComponent(BtnModificar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbnoHuesped, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtidReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtfechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtfechaSalida, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfechaReserva, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbestadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(BtnEliminar)
                                .addGap(49, 49, 49)
                                .addComponent(BtnConsultar)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtidReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtfechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbnoHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtfechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbestadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConsultar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnGuardar))
                .addGap(40, 40, 40)
                .addComponent(btcExportarReporte)
                .addGap(35, 35, 35))
        );

        setBounds(0, 0, 750, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfechaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaReservaActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        try {
            conn = Conect.getConnection();

            if (conn != null) {
                // Obtener y validar los IDs del cliente y de la habitación
                int idCliente = Integer.parseInt(txtidCliente.getText().trim());
                int idHabitacion = Integer.parseInt(txtidHabitacion.getText().trim());
                java.sql.Date fechaEntrada = java.sql.Date.valueOf(txtfechaEntrada.getText().trim());  // Fecha de entrada
                java.sql.Date fechaSalida = java.sql.Date.valueOf(txtfechaSalida.getText().trim());  // Fecha de salida

                // Verificar el estado de la habitación (cambiar estado_disponible por estado_habitacion)
                String checkEstadoQuery = "SELECT estado_habitacion FROM habitaciones WHERE ID_habitacion = ?";
                pst = conn.prepareStatement(checkEstadoQuery);
                pst.setInt(1, idHabitacion);  // Corregir el índice de 0 a 1

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    int estadoDisponible = rs.getInt("estado_habitacion");
                    if (estadoDisponible == 0) {  // Verificar si está ocupada
                        JOptionPane.showMessageDialog(null, "La habitación está ocupada y no se puede reservar.", "Error de reservación", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La habitación no existe.", "Error de reservación", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Consulta para verificar si la habitación ya está reservada en ese rango de fechas
                String checkQuery = "SELECT COUNT(*) FROM reservaciones WHERE ID_habitacion = ? "
                        + "AND (fecha_entrada < ? AND fecha_salida > ?)";
                pst = conn.prepareStatement(checkQuery);
                pst.setInt(1, idHabitacion);
                pst.setDate(2, fechaSalida);  // La nueva fecha de salida
                pst.setDate(3, fechaEntrada);  // La nueva fecha de entrada

                rs = pst.executeQuery();
                rs.next();
                int count = rs.getInt(1);

                if (count > 0) {
                    JOptionPane.showMessageDialog(null, "La habitación ya está reservada en ese rango de fechas.", "Error de reservación", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Si la habitación está disponible, insertamos la nueva reservación
                String qry = "INSERT INTO reservaciones (id_cliente, ID_habitacion, fecha_reserva, fecha_entrada, fecha_salida, numero_huespedes, estado_reserva) VALUES (?,?,?,?,?,?,?)";
                pst = conn.prepareStatement(qry);

                // Asignamos los valores a la consulta
                pst.setInt(1, idCliente);
                pst.setInt(2, idHabitacion);
                pst.setDate(3, java.sql.Date.valueOf(txtfechaReserva.getText().trim()));  // Fecha de la reserva
                pst.setDate(4, fechaEntrada);  // Fecha de entrada
                pst.setDate(5, fechaSalida);  // Fecha de salida
                pst.setInt(6, Integer.parseInt(cbnoHuesped.getSelectedItem().toString().trim()));  // Número de huéspedes
                pst.setInt(7, Integer.parseInt(cbestadoReserva.getSelectedItem().toString()));  // Estado de la reservación (1 para activo)

                // Ejecutamos la inserción
                int rowsAffected = pst.executeUpdate();

                // Verificamos si la inserción fue exitosa
                if (rowsAffected > 0) {
                    // Actualizar el estado de la habitación a no disponible (0)
                    String updateHabitacionQuery = "UPDATE habitaciones SET estado_habitacion = 0 WHERE ID_habitacion = ?";
                    pst = conn.prepareStatement(updateHabitacionQuery);
                    pst.setInt(1, idHabitacion);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "La reservación ha sido registrada exitosamente.");

                    // Limpiamos los campos del formulario
                    txtidCliente.setText("");
                    txtidHabitacion.setText("");
                    txtfechaReserva.setText("");
                    txtfechaEntrada.setText("");
                    txtfechaSalida.setText("");
                    cbnoHuesped.setSelectedIndex(0);
                    cbestadoReserva.setSelectedIndex(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.", "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error al guardar la reservación: " + sqle.getMessage(), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use el formato YYYY-MM-DD.", "Error de formato", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (pst != null) {
                    pst.close();  // Cerramos el PreparedStatement
                }
                if (conn != null) {
                    conn.close();  // Cerramos la conexión
                }
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + sqle.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here: modificar
        try {
            conn = Conect.getConnection();  // Establecemos la conexión

            // Verificamos que la conexión sea válida
            if (conn != null) {
                // Consulta SQL para actualizar una reservación existente
                qry = "UPDATE reservaciones SET ID_cliente=?, ID_habitacion=?, fecha_reserva=?, fecha_entrada=?, fecha_salida=?, numero_huespedes=?, estado_reserva=? WHERE ID_reservacion=?";
                PreparedStatement pr = conn.prepareStatement(qry);

                // Asignamos los valores actualizados a la consulta
                pr.setInt(1, Integer.parseInt(txtidCliente.getText()));  // Relación con el cliente (FK)
                pr.setInt(2, Integer.parseInt(txtidHabitacion.getText()));  // Relación con la habitación (FK)
                pr.setString(3, txtfechaReserva.getText());  // Fecha de la reserva
                pr.setString(4, txtfechaEntrada.getText());  // Fecha de entrada
                pr.setString(5, txtfechaSalida.getText());  // Fecha de salida
                pr.setInt(6, Integer.parseInt(cbnoHuesped.getSelectedItem().toString()));  // Número de huéspedes
                pr.setString(7, cbestadoReserva.getSelectedItem().toString());  // Estado de la reservación

                // Asignamos el ID de la reservación que estamos modificando
                pr.setInt(8, Integer.parseInt(txtidReservacion.getText()));  // ID de la reservación (PK)

                // Ejecutamos la actualización
                int rowsAffected = pr.executeUpdate();

                // Verificamos si la actualización fue exitosa
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "La reservación ha sido actualizada exitosamente.");

                    // Limpiamos los campos del formulario
                    // Limpiamos los campos del formulario
                    txtidCliente.setText("");
                    txtidHabitacion.setText("");
                    txtfechaReserva.setText("");
                    txtfechaEntrada.setText("");
                    txtfechaSalida.setText("");
                    cbnoHuesped.setSelectedIndex(0);
                    cbestadoReserva.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ninguna reservación con el ID proporcionado.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.", "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos para el ID del cliente, ID de la habitación y número de huéspedes.", "Error de formato", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error al modificar la reservación: " + sqle.getMessage(), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerramos la conexión en el bloque 'finally'
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + sqle.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here: eliminiar
        try {
            conn = Conect.getConnection();  // Establecemos la conexión
            if (conn != null) {
                String codValue = txtidReservacion.getText();  // Se obtiene el ID de la reservación

                if (codValue != null && !codValue.trim().isEmpty()) {
                    // Consulta SQL para eliminar la reservación
                    qry = "DELETE FROM reservaciones WHERE ID_reservacion=?";

                    PreparedStatement pr = conn.prepareStatement(qry);

                    // Establece el ID de la reservación que se debe eliminar
                    pr.setInt(1, Integer.parseInt(codValue));

                    // Ejecuta la eliminación
                    int rowsDeleted = pr.executeUpdate();

                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(null, "La reservación ha sido eliminada de manera satisfactoria.");

                        // Limpiar los campos de texto después de eliminar
                        txtidCliente.setText("");
                        txtidHabitacion.setText("");
                        txtfechaReserva.setText("");
                        txtfechaEntrada.setText("");
                        txtfechaSalida.setText("");
                        cbnoHuesped.setSelectedIndex(0);
                        cbestadoReserva.setSelectedIndex(0);
                        txtidReservacion.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ninguna reservación con el ID proporcionado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido para eliminar.");
                }
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la reservación: " + sqle.getMessage(), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "El ID debe ser un valor numérico válido.", "Error de formato", JOptionPane.WARNING_MESSAGE);
        } finally {
            // Cerramos la conexión en el bloque 'finally'
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + sqle.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        // TODO add your handling code here:consultar
        try {
            conn = Conect.getConnection();
            String codValue = txtidReservacion.getText();

            if (codValue != null && !codValue.trim().isEmpty()) {  // Verificamos que el ID no esté vacío
                // Consulta SQL para obtener los datos de la reservación
                String qry = "SELECT * FROM reservaciones WHERE ID_reservacion=?";
                pst = conn.prepareStatement(qry);

                // Asignamos el valor del ID de la reservación que se debe consultar
                pst.setInt(1, Integer.parseInt(codValue));

                // Ejecutamos la consulta
                rs = pst.executeQuery();

                // Verificamos si se encontraron datos
                if (rs.next()) {
                    // Asignamos los valores recuperados a los campos de texto
                    txtidCliente.setText(rs.getString("ID_cliente"));
                    txtidHabitacion.setText(rs.getString("ID_habitacion"));
                    txtfechaReserva.setText(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("fecha_reserva")));
                    txtfechaEntrada.setText(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("fecha_entrada")));
                    txtfechaSalida.setText(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("fecha_salida")));
                    cbnoHuesped.setSelectedItem(rs.getString("numero_huespedes"));
                    cbestadoReserva.setSelectedItem(rs.getString("estado_reserva"));

                    JOptionPane.showMessageDialog(null, "Datos de la reservación recuperados exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ninguna reservación con el ID especificado.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar los datos.", "Error de SQL", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión.", "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cbestadoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbestadoReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbestadoReservaActionPerformed

    private void cbnoHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnoHuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnoHuespedActionPerformed

    //Exporta la información de las reservaciones a un archivo PDF, utilizando la librería itextpdf
    private void btcExportarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcExportarReporteActionPerformed
        ExportarReporte exportar = new ExportarReporte();
        String qry = Utils.leerQueryDesdeArchivo("reporte-reservaciones.sql");
        exportar.exportarPdfComoTabla(qry, "Reporte Reservacioens.pdf", "Reservaciones: ");
    }//GEN-LAST:event_btcExportarReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton btcExportarReporte;
    private javax.swing.JComboBox<String> cbestadoReserva;
    private javax.swing.JComboBox<String> cbnoHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txtfechaEntrada;
    private javax.swing.JTextField txtfechaReserva;
    private javax.swing.JTextField txtfechaSalida;
    private javax.swing.JTextField txtidCliente;
    private javax.swing.JTextField txtidHabitacion;
    private javax.swing.JTextField txtidReservacion;
    // End of variables declaration//GEN-END:variables
}
