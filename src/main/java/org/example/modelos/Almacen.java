package org.example.modelos;

import java.util.Objects;

public class Almacen {

    //atributos
    private Integer identificador;
    private String nombre;
    private Integer capacidad;

    public Integer getIdentificador() {
        return identificador;
    }

    //getter y setters
    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    //Constuctor vacío

    public Almacen() {

    }

    //Constructor completo

    public Almacen(Integer identificador, String nombre, Integer capacidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    //Constructor copiado  (el copiado es con getters)
    public Almacen(Almacen almacen){
        this.identificador = getIdentificador();
        this.capacidad = getCapacidad();
        this.nombre = getNombre();
    }

    //To String

    @Override
    public String toString() {
        return "Almacen{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Almacen almacen = (Almacen) o;
        return Objects.equals(identificador, almacen.identificador) && Objects.equals(nombre, almacen.nombre) && Objects.equals(capacidad, almacen.capacidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, nombre, capacidad);
    }
}
