/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Paciente {

    private String rut;
    private String nombre;
    private String diagnostico;
    private Medico medico;

    public Paciente() {
        this.rut = "";
        this.nombre = "";
        this.diagnostico = "";
        this.medico = null;
    }

    public Paciente(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        this.diagnostico = "";
        this.medico = null;
    }

    public Paciente(String rut, String nombre, String diagnostico, Medico medico) {
        this.rut = rut;
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.medico = medico;
    }

    public Paciente(Paciente paciente) {
        this.rut = paciente.getRut();
        this.nombre = paciente.getNombre();
        this.diagnostico = paciente.getDiagnostico();
        this.medico = paciente.getMedico();
    }

    public String getReporteCompleto() {
        String s = "";
        s += "\nRut: " + this.getRut();
        s += "\nNombre: " + this.getNombre();
        s += "\nDiagnóstico: " + this.getDiagnostico();
        s += "\nMédico Asignado: " + this.getNombreMedico();
        return s;
    }

    public String getNombreMedico() {
        if (this.medico != null) {
            return this.medico.getNombre();
        }
        return "Sin Médico Asignado.";
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiagnostico() {
        if (!this.diagnostico.equals("")) {
            return this.diagnostico;
        }
        return "Sin Diagnóstico.";
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
