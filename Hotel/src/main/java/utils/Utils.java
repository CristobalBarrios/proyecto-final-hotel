/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.nio.file.*;

/**
 *
 * @author Cristobal Barrios
 */
public class Utils {

    public static String leerQueryDesdeArchivo(String nombreArchivo) {
        String query = "";
        String ruta = "src\\main\\java\\scripts\\" + nombreArchivo;
        try {
            query = new String(Files.readAllBytes(Paths.get(ruta)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return query;
    }

    public static String convertirMensajeHtml(String mensaje) {
        mensaje = "<html><p>"
                + mensaje
                + "</p></html>";
        return mensaje;
    }
}
