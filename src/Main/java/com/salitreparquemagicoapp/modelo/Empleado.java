package com.salitreparquemagicoapp.jdbc;

    public class Empleado {
        private String nombre;
        private String cedula;
        private String telefono;
        private String rol; // administrativo, logística, publicidad, operadores, mantenimiento
        private String horarioLaboral;

        public Empleado(String nombre, String cedula, String telefono, String rol, String horarioLaboral) {
            this.nombre = nombre;
            this.cedula = cedula;
            this.telefono = telefono;
            this.rol = rol;
            this.horarioLaboral = horarioLaboral;
        }

        // Getters y Setters
        public String getNombre() { return nombre; }
        public String getCedula() { return cedula; }
        public String getRol() { return rol; }
    }