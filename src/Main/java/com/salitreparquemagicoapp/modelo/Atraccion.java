package com.salitreparquemagicoapp.jdbc;

public class Atraccion {
    private String nombre;
    private String descripcion;
    private String clasificacion;
    private double estaturaMinima;
    private boolean disponible;

    public Atraccion(String nombre, String descripcion, String clasificacion, double estaturaMinima) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.estaturaMinima = estaturaMinima;
        this.disponible = true; // Por defecto, la atracción está disponible
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public double getEstaturaMinima() { return estaturaMinima; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}