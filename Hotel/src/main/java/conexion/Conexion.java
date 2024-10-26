/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

/**
 *
 * @author hecto
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems; // para establecer la coneccion
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    private Connection conn;
    private String hostname, port, database, username, password, driver, connectionString;

    // Constructor que carga los datos de la conexión desde el archivo properties
    public Conexion() {
        try (InputStream in = Files.newInputStream(FileSystems.getDefault().getPath("src\\main\\java\\properties\\BD.properties"))) {
            Properties props = new Properties();
            props.load(in);
            
            // Cargar los valores del archivo properties
            hostname = props.getProperty("hostname");
            port = props.getProperty("port");
            database = props.getProperty("database");
            username = props.getProperty("username");
            password = props.getProperty("password");
            driver = props.getProperty("driver");

            // Cargar el driver JDBC para ORACLE
            Class.forName(driver);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la conexión a ORACLE
    public Connection getConnection() throws SQLException {
     
        connectionString = "jdbc:oracle:thin:@" + hostname + ":" + port + "/" + database; 
        conn = DriverManager.getConnection(connectionString, username, password);
        return conn;
    }

    // Método para cerrar la conexión
    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}