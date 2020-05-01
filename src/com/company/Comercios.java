package com.company;

import java.util.ArrayList;

public class Comercios extends Comerciales{
    private String rubro;
    // Con personal
    public Comercios(String rubro, String nombreDeObra, String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado, ArrayList<Empleados> listadoDelPersonal) {
        super(nombreDeObra, direccion, cantidadMetrosCuadrados, tiempoEstimado, costoMetroCuadrado, listadoDelPersonal);
        this.rubro = rubro;
    }
    // Sin personal
    public Comercios(String rubro, String nombreDeObra, String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado) {
        super(nombreDeObra, direccion, cantidadMetrosCuadrados, tiempoEstimado, costoMetroCuadrado);
        this.rubro = rubro;
    }
}
