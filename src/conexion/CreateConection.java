package conexion;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CreateConection {
    static Properties config = new Properties();
    String hostname, port, database, username, password;

    public CreateConection() {
        try {
            // Carga el archivo properties desde el mismo paquete de manera segura
            config.load(CreateConection.class.getResourceAsStream("db_config.properties"));
        } catch (IOException ex) {
            System.out.println("Error al cargar el archivo de configuración: " + ex.getMessage());
        }
        loadProperties();
    }
    public Connection getConnection() {
        try {
            String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + port + "/" + database;

            // Pasamos el usuario y la contraseña como argumentos en DriverManager
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

            System.out.println("Conectado exitosamente!");
            return conn;
        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex.getMessage());
        }
        return null;
    }
    public void loadProperties() {
        this.hostname = config.getProperty("hostname");
        this.port = config.getProperty("port");
        this.database = config.getProperty("database");
        this.username = config.getProperty("username");
        this.password = config.getProperty("password");
    }
}
