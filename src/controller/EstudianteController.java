package controller;

import dao.EstudianteDao;
import model.Estudiante;
import java.time.LocalDate;
import java.util.List;

public class EstudianteController {

    private final EstudianteDao estudianteDao = new EstudianteDao();

    //Obtener la lista de todos los estudiantes
    public List<Estudiante> obtenerEstudiantes() {
        return estudianteDao.obtenerTodos();
    }

    //Buscar un estudiante por su número de carnet
    public Estudiante obtenerEstudiantePorCarnet(String carnet) {
        return estudianteDao.obtenerPorCarnet(carnet);
    }

    //Registrar un nuevo estudiante
    public boolean agregarEstudiante(String carnet, String nombre, String apellido, int edad, LocalDate fechaNacimiento, String genero,
            String correo, String telefono, String dpi) {

        Estudiante est = new Estudiante(carnet, nombre, apellido, edad, fechaNacimiento, genero, correo, telefono, dpi);
        return estudianteDao.guardar(est);
    }

    //Actualizar los datos de un estudiante existente
    public boolean actualizarEstudiante(int id, String carnet, String nombre, String apellido, int edad, LocalDate fechaNacimiento, String genero,
            String correo, String telefono, String dpi) {
        Estudiante est = new Estudiante(id, carnet, nombre, apellido, edad, fechaNacimiento, genero, correo, telefono, dpi);
        return estudianteDao.actualizar(est);
    }

    //Eliminar un estudiante utilizando su número de carnet
    public boolean eliminarEstudiantePorCarnet(String carnet) {
        return estudianteDao.eliminarPorCarnet(carnet);
    }
}
