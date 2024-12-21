package com.salitreparquemagicoapp.jdbc;

public class Estacion {
    private String nombre;
    private boolean habilitada;

    public Estacion(String nombre) {
        this.nombre = nombre;
        this.habilitada = true; // Por defecto, la estación está habilitada
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public boolean isHabilitada() { return habilitada; }
    public void setHabilitada(boolean habilitada) { this.habilitada = habilitada; }
}