SELECT
    f.id_factura "ID Factura",
    f.id_reservacion "ID Reservación",
    c.nombre "Nombre Cliente",
    c.nit "NIT",
    f.monto_total "Monto Total",
    f.fecha_emision "Fecha de Emisión",
    f.detalles_factura "Detalles"
FROM
    facturas f
JOIN cliente c ON c.id_cliente = f.id_cliente
ORDER BY f.id_factura ASC