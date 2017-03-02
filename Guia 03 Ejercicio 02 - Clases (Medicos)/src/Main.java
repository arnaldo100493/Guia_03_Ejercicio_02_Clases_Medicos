/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("Guía 03 Clases Médicos");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        c.println("Ingrese el rut del médico: ");
        String rutMedico = c.readString();

        c.println("Ingrese el nombre del médico: ");
        String nombreMedico = c.readString();

        c.println("Ingrese el número de registro del médico: ");
        String numeroRegistro = c.readString();

        c.println("Ingrese la especialidad: ");
        String especialidad = c.readString();

        Medico medico = new Medico(rutMedico, nombreMedico, numeroRegistro, especialidad);
        c.println("Médico creado exitosamente.");

        c.println("Ingrese el rut del paciente: ");
        String rutPaciente = c.readString();

        c.println("Ingrese el nombre del paciente: ");
        String nombrePaciente = c.readString();

        Paciente paciente = new Paciente(rutPaciente, nombrePaciente);
        c.println("Paciente creado exitosamente.");

        paciente.setMedico(medico);

        c.println("Ingrese el diagnostico del paciente: ");
        String diagnostico = c.readString();

        paciente.setDiagnostico(diagnostico);

        c.println(paciente.getReporteCompleto());

    }

}
