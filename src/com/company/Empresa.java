package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Empresa{
    private String nombre;
    private ArrayList<Integer> dniDisponibles;
    private HashMap<Integer,Empleados> personal;
    private ArrayList<Obras> obras;
    private int dispObr = 0;
    private int dispArq = 0;
    private int dispMmo = 0;

    //Constructor con obras
    public Empresa(String nombre, ArrayList<Empleados> personal, ArrayList<Obras> obras) {
        this.nombre = nombre;
        this.obras = obras;
        this.dniDisponibles = new ArrayList<>();
        this.personal = new HashMap<>();
        setDisponibles(personal);
        setHashMap(personal);
    }
    //Constructor sin obras
    public Empresa(String nombre, ArrayList<Empleados> personal) {
        this.nombre = nombre;
        this.dniDisponibles = new ArrayList<>();
        this.personal = new HashMap<>();
        setDisponibles(personal);
        setHashMap(personal);
    }

    public ArrayList<Obras> getObras() {
        return obras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setObras(ArrayList<Obras> obras) {
        if(this.obras == null)
            this.obras = obras;
        else
            this.obras.addAll(obras); //agrega todas las obras al final del ArrayList obras
    }

    private void setDisponibles(ArrayList<Empleados> personal){
       for (Empleados empleado : personal) {
           if(empleado instanceof Obreros)
                dispObr++;
           else if (empleado instanceof Arquitectos)
               dispArq++;
           else
               dispMmo++;
       }
    }

    private void setHashMap(ArrayList<Empleados> personal){
        for (int i=0; i<personal.size(); i++) {
            dniDisponibles.add(personal.get(i).getDni()); // Agrega el dni de cada empleado de la lista personal
            this.personal.put(personal.get(i).getDni(), personal.get(i));  // Agrega cada empleado al hashMAp con su key dni(key, valor)
        }
    }

    public ArrayList<Empleados> seleccionPersonal(){
        ArrayList<Empleados> nuevoPersonal = new ArrayList<>();
        int[] disponibles = {dispArq,dispMmo,dispObr};
        if(!hayDisponibles(disponibles))
            System.out.println("No hay los suficientes empleados para la obra");
        else {
            int a = 1; // cargo por defecto 1 Arq, 1 MMo y 1 Obrero
            int m = 1;
            int o = 1;
            boolean condicion = true;
            int i = 0;
            while(condicion) {
                Empleados empleado = personal.get(dniDisponibles.get(i));  // Contiene el empleado con dni disponible del Hash Map
                if(empleado instanceof Arquitectos && a>0) {
                    dispArq--;
                    a--;
                    nuevoPersonal.add(empleado);      // Agrego el empleado a mi lista nuevoPersonal de la obra
                    dniDisponibles.remove(i);
                    i--;// Ese empleado ya no esta disponible, lo elimino de la lista
                }
                else if(empleado instanceof MMdO && m>0) {
                    dispMmo--;
                    m--;
                    nuevoPersonal.add(empleado);
                    dniDisponibles.remove(i);
                    i--;
                }
                else if (empleado instanceof Obreros && o>0) {
                    dispObr--;
                    o--;
                    nuevoPersonal.add(empleado);
                    dniDisponibles.remove(i);
                    i--;
                }
                if(a==0 && m==0 && o==0) {
                    condicion = false;
                }
                i++;
            }
        }
        return nuevoPersonal;
    }

    private boolean hayDisponibles(int[] disponibles){
        if(disponibles[0]<1) // no hay arquitectos
            return false;
        if(disponibles[1]<1) // no hay MmdO
            return false;
        if(disponibles[2]<1)  // no hay obreros
            return false;
        return true;
    }
}
