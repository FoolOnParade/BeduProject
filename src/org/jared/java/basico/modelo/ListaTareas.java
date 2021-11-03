package org.jared.java.basico.modelo;

import org.jared.java.basico.Menu;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaTareas implements Serializable {
    //Atributos
    private String nombre;
    private final LocalDate fechaCreacion;
    private final List<Tarea> tareas = new ArrayList<>();

    //Bloque de inicializacion
    {
        fechaCreacion = LocalDate.now();
    }

    //Metodo constructor
    public ListaTareas(String nombre) {
        this.nombre = nombre;
    }

    //Getter & Setters
    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    //Metodos para listas de tarea
    public int numeroTareas(){
        return tareas.size();
    }

    public void muestraTareas(){
        for (int i = 0; i < tareas.size(); i++) {
            Tarea tarea = tareas.get(i);
            System.out.println((i + 1) + " - " + tarea.getNombre() + "[" + (tarea.isRealizada() ? "█" : " ")  + "] " + (tarea.isRealizada() ? tarea.getFechaRealizacion() : ""));

        }
    }

    public void agregaTarea(Tarea tarea){
        tareas.add(tarea);
    }

    public Tarea eliminaTarea(int indice){
        if(indice > tareas.size()){
            System.out.println("La tarea indicada no se encuentra en la lista.");
            return null;
        }
        return tareas.remove(indice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaTareas that = (ListaTareas) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
