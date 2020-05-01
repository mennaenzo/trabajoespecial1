package com.company;

public class Obreros extends Empleados implements InterfazEmpleado{
    private int edad;

    public Obreros(String nombre, int dni, int tel, int edad) {
        super(nombre,dni,tel,1500);
        this.edad = edad;
    }
    // Constructor por consola
    public Obreros(){
        super();
        System.out.println("Edad: ");
        this.edad = scanner.nextInt();
    }

    @Override
    public void trabajar(){
        System.out.println("Soy obrero y construyo");
    }

    @Override
    public int getEdad() {
        return edad;
    }
}
