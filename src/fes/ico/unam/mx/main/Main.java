package fes.ico.unam.mx.main;

import fes.ico.unam.mx.clases.ColaADT;
import fes.ico.unam.mx.clases.Paciente;

public class Main {
    public static void main(String[] args) {
        ColaADT<Paciente> pacienteEsperando = new ColaADT<>();

        pacienteEsperando.Encolar(new Paciente("Alejandro",35,65.5,1.74));
        pacienteEsperando.Encolar(new Paciente("Maria",24,59.3,1.52));
        pacienteEsperando.Encolar(new Paciente("Israel",19,60,1.66));
        System.out.println("Primer muestra de pacientes que hay");

        System.out.println("\n"+pacienteEsperando);
        System.out.println("Primera muestra del paciente");
        System.out.println(pacienteEsperando.frente());
        System.out.println("EL Siguiente paciente en pasar es:"+pacienteEsperando.desencolar());
        System.out.println("Segunda muestra de los pacientes esperando");
        System.out.println("\n"+pacienteEsperando);
        pacienteEsperando.Encolar(new Paciente("Luis",29,70.2,1.82));
        pacienteEsperando.Encolar(new Paciente("Carla",45,85,1.56));
        System.out.println("EL Siguiente paciente en pasar es:"+pacienteEsperando.desencolar());
        System.out.println("Ultima muestra de los pacientes esperando");
        System.out.println("\n"+pacienteEsperando);




    }
}