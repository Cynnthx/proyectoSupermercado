package org.example.modelos;

import java.util.Objects;

public class Cliente {
    //Atributos
    private Integer identificador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private tipoCliente tipoCliente;

    //Getters and Setters

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public org.example.modelos.tipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(org.example.modelos.tipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    //Constructor vacío

    public Cliente() {

    }

    //Constructor completo

    public Cliente(Integer identificador, String dni, String nombre, String apellidos, String direccion, org.example.modelos.tipoCliente tipoCliente) {
        this.identificador = identificador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }

    //Constructor copiado
    public Cliente(Cliente cliente){
        this.identificador = getIdentificador();
        this.dni = getDni();
        this.nombre = getDni();
        this.apellidos = getApellidos();
        this.direccion = getDireccion();
        this.tipoCliente = getTipoCliente();

    }

    //To String

    @Override
    public String toString() {
        return "Cliente{" +
                "identificador=" + identificador +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    //Equals and HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(identificador, cliente.identificador) && Objects.equals(dni, cliente.dni) && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellidos, cliente.apellidos) && Objects.equals(direccion, cliente.direccion) && tipoCliente == cliente.tipoCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, dni, nombre, apellidos, direccion, tipoCliente);
    }
}
