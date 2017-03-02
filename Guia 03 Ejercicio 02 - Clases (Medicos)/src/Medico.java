/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Medico {

    private String rut;
    private String nombre;
    private String registroMedico;
    private String especialidad;

    public Medico() {
        this.rut = "";
        this.nombre = "";
        this.registroMedico = "";
        this.especialidad = "";
    }

    public Medico(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        this.registroMedico = "";
        this.especialidad = "";
    }

    public Medico(String rut, String nombre, String registroMedico, String especialidad) {
        this.rut = rut;
        this.nombre = nombre;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Medico(Medico medico) {
        this.rut = medico.getRut();
        this.nombre = medico.getNombre();
        this.registroMedico = medico.getRegistroMedico();
        this.especialidad = medico.getEspecialidad();
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(String registroMedico) {
        this.registroMedico = registroMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
