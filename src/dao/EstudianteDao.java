package dao;

import conexion.CreateConection;
import model.Estudiante;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDao {

    private final CreateConection connFactory = new CreateConection();

    public boolean guardar(Estudiante est) {
        String sql = "INSERT INTO tb_estudiante (no_carnet_estudiante, nombre_estudiante, apellido_estudiante, edad_estudiante, fecha_nacimiento_estudiante, "
                + "genero_estudiante, correo_electronico_estudiante, telefono_estudiante, no_dpi_estudiante) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = connFactory.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, est.getNoCarnetEstudiante());
            ps.setString(2, est.getNombreEstudiante());
            ps.setString(3, est.getApellidoEstudiante());
            ps.setInt(4, est.getEdadEstudiante());
            ps.setObject(5, est.getFechaNacimientoEstudiante());
            ps.setString(6, est.getGeneroEstudiante());
            ps.setString(7, est.getCorreoElectronicoEstudiante());
            ps.setString(8, est.getTelefonoEstudiante());
            ps.setString(9, est.getNoDpiEstudiante());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Estudiante> obtenerTodos() {
        List<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM tb_estudiante";

        try (Connection conn = connFactory.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Estudiante est = new Estudiante(
                        rs.getInt("id_estudiante"),
                        rs.getString("no_carnet_estudiante"),
                        rs.getString("nombre_estudiante"),
                        rs.getString("apellido_estudiante"),
                        rs.getInt("edad_estudiante"),
                        rs.getObject("fecha_nacimiento_estudiante", LocalDate.class),
                        rs.getString("genero_estudiante"),
                        rs.getString("correo_electronico_estudiante"),
                        rs.getString("telefono_estudiante"),
                        rs.getString("no_dpi_estudiante"));

                lista.add(est);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public Estudiante obtenerPorCarnet(String carnet) {
        Estudiante est = null;
        String sql = "SELECT * FROM tb_estudiante WHERE no_carnet_estudiante = ?";

        try (Connection conn = connFactory.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, carnet);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    est = new Estudiante(
                            rs.getInt("id_estudiante"),
                            rs.getString("no_carnet_estudiante"),
                            rs.getString("nombre_estudiante"),
                            rs.getString("apellido_estudiante"),
                            rs.getInt("edad_estudiante"),
                            rs.getObject("fecha_nacimiento_estudiante", LocalDate.class),
                            rs.getString("genero_estudiante"),
                            rs.getString("correo_electronico_estudiante"),
                            rs.getString("telefono_estudiante"),
                            rs.getString("no_dpi_estudiante"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return est;
    }

    public boolean actualizar(Estudiante est) {
        String sql = "UPDATE tb_estudiante SET no_carnet_estudiante = ?, nombre_estudiante = ?, apellido_estudiante = ?, edad_estudiante = ?, "
                + "fecha_nacimiento_estudiante = ?, genero_estudiante = ?, correo_electronico_estudiante = ?, telefono_estudiante = ?, no_dpi_estudiante = ? "
                + "WHERE id_estudiante = ?";
        try (Connection conn = connFactory.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, est.getNoCarnetEstudiante());
            ps.setString(2, est.getNombreEstudiante());
            ps.setString(3, est.getApellidoEstudiante());
            ps.setInt(4, est.getEdadEstudiante());
            ps.setObject(5, est.getFechaNacimientoEstudiante());
            ps.setString(6, est.getGeneroEstudiante());
            ps.setString(7, est.getCorreoElectronicoEstudiante());
            ps.setString(8, est.getTelefonoEstudiante());
            ps.setString(9, est.getNoDpiEstudiante());
            ps.setInt(10, est.getIdEstudiante());

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean eliminarPorCarnet(String carnet) {
        String sql = "DELETE FROM tb_estudiante WHERE no_carnet_estudiante = ?";

        try (Connection conn = connFactory.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, carnet);

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0; // Devuelve true si encontró el carnet y lo borró con éxito

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
