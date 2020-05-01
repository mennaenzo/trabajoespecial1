package com.company;

import java.util.Scanner;

public class Empleados {
    private String nombre;
    private int dni;
    private int tel;
    private double costo;

    public static Scanner scanner = new Scanner(System.in);

    public Empleados(String nombre, int dni, int tel, double costo) {
        this.nombre = nombre;
        this.dni = dni;
        this.tel = tel;
        this.costo = costo;
    }

    /// creo un empleado por consola
    public  Empleados (){
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Nombre: ");
        this.nombre = (scanner.nextLine());
        System.out.println("DNI: ");
        this.dni = scanner.nextInt();
        System.out.println("Tel: ");
        this.tel = scanner.nextInt();
    }

    public double getCosto() {
        return costo;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTel() {
        return tel;
    }

}
