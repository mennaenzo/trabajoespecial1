package com.company;

import java.util.ArrayList;

public class Domesticas extends Obras{
    private int cantidadDeHabitaciones;
    // Con personal
    public Domesticas(int cantidadDeHabitaciones, String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado, ArrayList<Empleados> listadoDelPersonal) {
        super(direccion, cantidadMetrosCuadrados, tiempoEstimado, costoMetroCuadrado, listadoDelPersonal);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }
    // Sin personal
    public Domesticas(int cantidadDeHabitaciones, String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado) {
        super(direccion, cantidadMetrosCuadrados, tiempoEstimado, costoMetroCuadrado);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }
}
