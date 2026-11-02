package conexion;
public class mainPrueba {
    public static void main(String[] args) {
        System.out.println("Iniciando prueba de conexion...");
        
        CreateConection conn = new CreateConection();
        
        if (conn.getConnection() != null) {
            System.out.println("La base de datos esta conectada correctamente");
        } else {
            System.out.println("Fallo en la conexion. Revisa los detalles arriba.");
        }
    }
}
