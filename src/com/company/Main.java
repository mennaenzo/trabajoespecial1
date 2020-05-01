package com.company;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args){
        // Punto 2.A
        Arquitectos arq1 = new Arquitectos("Luis",30300330,155634938,1010);
        Arquitectos arq2 = new Arquitectos("Lautaro",30350360,155634938,1011);
        Arquitectos arq3 = new Arquitectos("Lolo",30999999,155634938,1012);
        MMdO maestro1 = new MMdO("Martin",41250650,155232425,30);
        MMdO maestro2 = new MMdO("Manuel",40450450,155232425,40);
        MMdO maestro3 = new MMdO("Marcelo",42500500,155232425,45);
        Obreros obrero1 = new Obreros("Pepe",20500600,155201030,50);
        Obreros obrero2 = new Obreros("Pedro",22800800,155201030,60);
        Obreros obrero3 = new Obreros("Pipo",21600600,155201030,55);

        ArrayList<Empleados> empleados = new ArrayList<>();
        empleados.add(arq1);
        empleados.add(arq2);
        empleados.add(arq3);
        empleados.add(maestro1);
        empleados.add(maestro2);
        empleados.add(maestro3);
        empleados.add(obrero1);
        empleados.add(obrero2);
        empleados.add(obrero3);
        System.out.println("---------- Punto 2.A (Descomentar para ver) ----------");
        /*for(int i=0;i<empleados.size();i++){
            if(empleados.get(i) instanceof Arquitectos)
                ((Arquitectos)empleados.get(i)).crearPlano();
            else
                ((InterfazEmpleado)empleados.get(i)).trabajar();
        }*/

        // Punto 2.B
        ArrayList<Obras> obrasARealizar = new ArrayList<>();
        Hoteles hotel1 = new Hoteles(10,"hotel 1","calleH 1",100,30,1000);
        obrasARealizar.add(hotel1);
        Comercios comercio1 = new Comercios("zapateria","obra 1","calleO 1",50,10,800);
        obrasARealizar.add(comercio1);
        Domesticas domestica1 = new Domesticas(2,"calleD 1",30,5,600);
        obrasARealizar.add(domestica1);
        Empresa empresa = new Empresa("EM",empleados,obrasARealizar);  //empresa con empleados y con obras realizadas

        // Punto 2.C
        //Arquitectos arqConsola = new Arquitectos();
        //System.out.println(arqConsola.getNombre());
        ArrayList<Obras> obrasNuevas = new ArrayList<>();
        Hoteles hotel2 = new Hoteles(10,"hotel 2","calleH 2",140,10,1000,empresa.seleccionPersonal());
        obrasNuevas.add(hotel2);
        Comercios comercio2 = new Comercios("almacenes","almacen 1","calleO 2",80,10,800,empresa.seleccionPersonal());
        obrasNuevas.add(comercio2);
        Domesticas domestica2 = new Domesticas(2,"domestica 2",90,5,600,empresa.seleccionPersonal());
        obrasNuevas.add(domestica2);
        System.out.println("---------- Punto 2.C ----------");
        int a = 0;
        System.out.println("----- Empresa: "+ empresa.getNombre() + " -----");
        for (Obras obrasNueva : obrasNuevas) {
            if (obrasNueva instanceof Comerciales)
                System.out.println("Obra Comercial: " + ((Comerciales) obrasNueva).getNombreDeObra() + "\nCosto: " + obrasNueva.precioTotalObra());
            else {
                a++;
                System.out.println("Obra Domestica " + a + "\nCosto: " + obrasNueva.precioTotalObra());
            }
        }

        //Punto 2.D
        empresa.setObras(obrasNuevas);

        //Punto 2.E
        System.out.print("\n---------- Punto 2.E ----------");
        ArrayList<Obras> obrasTotales = empresa.getObras();
        for(int i=0; i<obrasTotales.size(); i++) {
            if (obrasTotales.get(i).getListadoDelPersonal() != null){ //si el listado del personal de la obra no es vacio
                System.out.print("\n----- Obra " + (i+1) + " -----");
                imprimirEmpleados(obrasARealizar.get(i).getListadoDelPersonal());
            }
        }

        //Punto 2.F
        System.out.print("\n---------- Punto 2.F ----------");
        imprimirCostoObras(empresa.getObras());
    }
    // --------------- Class Main (methods) ----------------------
    public static void imprimirCostoObras(ArrayList<Obras> listadoObras){
        for(int i=0; i<listadoObras.size(); i++){
            System.out.print("\n----- Obra " + (i+1) + " -----");
            System.out.println("\nCosto Total: $" + listadoObras.get(i).precioTotalObra());
        }
    }

    public static void imprimirEmpleados(ArrayList<Empleados> empleados){
        for (Empleados empleado : empleados) {
            System.out.println("\nNombre: " + empleado.getNombre() + "\nDNI: " + empleado.getDni() + "\nTel: " + empleado.getTel());
            if (empleado instanceof Arquitectos)
                System.out.println("Numero de matricula: " + ((Arquitectos) empleado).getNumMatricula());
            else
                System.out.println("Edad: " + ((InterfazEmpleado) empleado).getEdad());
        }
    }
}