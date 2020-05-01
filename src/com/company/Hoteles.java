package com.company;

import java.util.ArrayList;

public class Hoteles extends Comerciales{
    private int cantidadDePisos;
    // Con personal
    public Hoteles(int cantidadDePisos, String nombreDeObra, String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado, ArrayList<Empleados> listadoDelPersonal) {
        super(nombreDeObra, direccion, cantidadMetrosCuadrados, tiempoEstimado, costoMetroCuadrado, listadoDelPersonal);
        this.cantidadDePisos = cantidadDePisos;
    }

    // Sin personal
    public Hoteles(int cantidadDePisos, String nombreDeObra, String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado) {
        super(nombreDeObra, direccion, cantidadMetrosCuadrados, tiempoEstimado, costoMetroCuadrado);
        this.cantidadDePisos = cantidadDePisos;
    }
}
