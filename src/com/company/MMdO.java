package com.company;

public class MMdO extends Empleados implements InterfazEmpleado{
    private int edad;

    public MMdO(String nombre, int dni, int tel, int edad) {
        super(nombre, dni, tel, 1800);
        this.edad = edad;
    }
    // Constructor por consola
    public MMdO(){
        super();
        System.out.println("Edad: ");
        this.edad = scanner.nextInt();
    }

    @Override
    public void trabajar () { System.out.println("Soy maestro y superviso las construcciones"); }

    @Override
    public int getEdad() {
        return edad;
    }
}
