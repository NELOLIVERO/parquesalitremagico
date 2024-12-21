package com.salitreparquemagicoapp.jdbc;

public class Cliente {
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    private double estatura;
    private int edad;
    private String contactoFamiliar; // Solo si es menor de edad
    private int visitas; // Contador de visitas para promociones

    public Cliente(String nombre, String cedula, String telefono, String correo, double estatura, int edad, String contactoFamiliar) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.estatura = estatura;
        this.edad = edad;
        this.contactoFamiliar = contactoFamiliar;
        this.visitas = 0; // Inicialmente, el cliente no ha visitado
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
    public double getEstatura() { return estatura; }
    public int getEdad() { return edad; }
    public String getContactoFamiliar() { return contactoFamiliar; }
    public int getVisitas() { return visitas; }
    public void incrementarVisitas() { this.visitas++; }
}