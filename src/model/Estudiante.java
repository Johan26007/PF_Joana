package model;

import java.time.LocalDate;

public class Estudiante {

    private int idEstudiante;
    private String noCarnetEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private int edadEstudiante;
    private LocalDate fechaNacimientoEstudiante;
    private String generoEstudiante;
    private String correoElectronicoEstudiante;
    private String telefonoEstudiante;
    private String noDpiEstudiante;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String noCarnetEstudiante, String nombreEstudiante, String apellidoEstudiante, int edadEstudiante, LocalDate fechaNacimientoEstudiante, String generoEstudiante, String correoElectronicoEstudiante, String telefonoEstudiante, String noDpiEstudiante) {
        this.idEstudiante = idEstudiante;
        this.noCarnetEstudiante = noCarnetEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.edadEstudiante = edadEstudiante;
        this.fechaNacimientoEstudiante = fechaNacimientoEstudiante;
        this.generoEstudiante = generoEstudiante;
        this.correoElectronicoEstudiante = correoElectronicoEstudiante;
        this.telefonoEstudiante = telefonoEstudiante;
        this.noDpiEstudiante = noDpiEstudiante;
    }
    
    //Constructor sin id_estudiante
    public Estudiante(String noCarnetEstudiante, String nombreEstudiante, String apellidoEstudiante, int edadEstudiante, LocalDate fechaNacimientoEstudiante, String generoEstudiante, String correoElectronicoEstudiante, String telefonoEstudiante, String noDpiEstudiante) {
        this.noCarnetEstudiante = noCarnetEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.edadEstudiante = edadEstudiante;
        this.fechaNacimientoEstudiante = fechaNacimientoEstudiante;
        this.generoEstudiante = generoEstudiante;
        this.correoElectronicoEstudiante = correoElectronicoEstudiante;
        this.telefonoEstudiante = telefonoEstudiante;
        this.noDpiEstudiante = noDpiEstudiante;
    }
    
    
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNoCarnetEstudiante() {
        return noCarnetEstudiante;
    }

    public void setNoCarnetEstudiante(String noCarnetEstudiante) {
        this.noCarnetEstudiante = noCarnetEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public int getEdadEstudiante() {
        return edadEstudiante;
    }

    public void setEdadEstudiante(int edadEstudiante) {
        this.edadEstudiante = edadEstudiante;
    }

    public LocalDate getFechaNacimientoEstudiante() {
        return fechaNacimientoEstudiante;
    }

    public void setFechaNacimientoEstudiante(LocalDate fechaNacimientoEstudiante) {
        this.fechaNacimientoEstudiante = fechaNacimientoEstudiante;
    }

    public String getGeneroEstudiante() {
        return generoEstudiante;
    }

    public void setGeneroEstudiante(String generoEstudiante) {
        this.generoEstudiante = generoEstudiante;
    }

    public String getCorreoElectronicoEstudiante() {
        return correoElectronicoEstudiante;
    }

    public void setCorreoElectronicoEstudiante(String correoElectronicoEstudiante) {
        this.correoElectronicoEstudiante = correoElectronicoEstudiante;
    }

    public String getTelefonoEstudiante() {
        return telefonoEstudiante;
    }

    public void setTelefonoEstudiante(String telefonoEstudiante) {
        this.telefonoEstudiante = telefonoEstudiante;
    }

    public String getNoDpiEstudiante() {
        return noDpiEstudiante;
    }

    public void setNoDpiEstudiante(String noDpiEstudiante) {
        this.noDpiEstudiante = noDpiEstudiante;
    }

}
