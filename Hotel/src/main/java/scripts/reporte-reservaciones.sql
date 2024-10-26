SELECT
    r.id_reservacion "ID Reservación",
    c.nombre "Nombre Cliente",
    h.numero_habitacion "Número de Habitación",
    r.fecha_reserva "Fecha de Reserva",
    r.fecha_entrada "Fecha de Entrada",
    r.fecha_salida "Fecha de Salida",
    r.numero_huespedes "Número de Huéspedes",
    r.estado_reserva "Estado de Reserva"
FROM reservaciones r
JOIN cliente c ON c.id_cliente = r.id_cliente
JOIN habitaciones h ON h.id_habitacion = r.id_habitacion
ORDER BY r.id_reservacion ASC