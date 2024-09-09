package fes.ico.unam.mx.clases;

public class Paciente {

    private String Nombre;
    private int Edad;
    private double Peso;
    private double Altura;

    public Paciente(String nombre, int edad, double peso, double altura) {
        Nombre = nombre;
        Edad = edad;
        Peso = peso;
        Altura = altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                ", Altura=" + Altura +
                '}';
    }
}
