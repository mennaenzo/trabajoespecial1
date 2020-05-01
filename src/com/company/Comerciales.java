package com.company;

import java.util.ArrayList;

public class Comerciales extends Obras{
    private String nombreDeObra;
    // Con personal
    public Comerciales(String nombreDeObra, String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado, ArrayList<Empleados> listadoDelPersonal) {
        super(direccion, cantidadMetrosCuadrados, tiempoEstimado, costoMetroCuadrado, listadoDelPersonal);
        this.nombreDeObra = nombreDeObra;
    }

    // Sin personal
    public Comerciales(String nombreDeObra, String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado) {
        super(direccion, cantidadMetrosCuadrados, tiempoEstimado, costoMetroCuadrado);
        this.nombreDeObra = nombreDeObra;
    }

    public String getNombreDeObra() {
        return nombreDeObra;
    }
}
