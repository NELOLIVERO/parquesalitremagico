package com.salitreparquemagicoapp;

import com.salitreparquemagicoapp.controlador.ControladorParque;
import com.salitreparquemagicoapp.vista.VistaConsola;

public class ParqueSalitreMagicoApp {
    public static void main(String[] args) {
        ControladorParque controlador = new ControladorParque();
        VistaConsola vista = new VistaConsola(controlador);
        vista.mostrarMenu();
    }
}