package com.company;

import java.util.ArrayList;

public class Obras {
    private String direccion;
    private double cantidadMetrosCuadrados;
    private int tiempoEstimado;
    private double costoMetroCuadrado;
    private ArrayList<Empleados> listadoDelPersonal; //arquitectos, obreros y maestros

    // Con personal
    public Obras(String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado, ArrayList<Empleados> listadoDelPersonal) {
        this.direccion = direccion;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
        this.tiempoEstimado = tiempoEstimado;
        this.costoMetroCuadrado = costoMetroCuadrado;
        this.listadoDelPersonal = listadoDelPersonal;
    }

    // Sin personal
    public Obras(String direccion, double cantidadMetrosCuadrados, int tiempoEstimado, double costoMetroCuadrado) {
        this.direccion = direccion;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
        this.tiempoEstimado = tiempoEstimado;
        this.costoMetroCuadrado = costoMetroCuadrado;
        this.listadoDelPersonal = null;
    }

    public ArrayList<Empleados> getListadoDelPersonal() {
        return listadoDelPersonal;
    }

    public double precioTotalObra(){
        return (costoMetroCuadrado * cantidadMetrosCuadrados) + (costoPersonal() *  tiempoEstimado);   // uso el metodo de la misma clase para obtener ese costo
    }

    private double costoPersonal(){
        double costo = 0;
        if(listadoDelPersonal != null) {
            for (Empleados empleado : listadoDelPersonal) {    //recorro la lista del personal, y voy accediendo al costo de cada uno
                costo = costo + empleado.getCosto();
            }
            return costo;
        }
        else
            return 0;
    }
}

