package com.company;

public class Arquitectos extends Empleados {
    private int numMatricula;

    public Arquitectos(String nombre, int dni, int tel,int numMatricula) {
        super(nombre,dni,tel,2000);
        this.numMatricula = numMatricula;
    }
    // Constructor por consola
    public Arquitectos(){
        super();
        System.out.println("Numero de Matricula: ");
        this.numMatricula = scanner.nextInt();
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void crearPlano(){
        System.out.println("Creando mi proximo plano");
    }
}
