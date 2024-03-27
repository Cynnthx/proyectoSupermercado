package org.example.modelos;

import java.util.Objects;

public class Empleado {
    //Atributos
    private Integer identificador;
    private String dni;
    private String nombre;
    private String direccion;
    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;

    //Getter and Setter

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }


    //Constructor completo

    public Empleado(Integer identificador, String dni, String nombre, String direccion, String numTelefono, Empresa empresa, Contrato contrato) {
        this.identificador = identificador;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public Empleado(){}


    //Constructor copiado
    public Empleado(Empleado empleado) {
        this.identificador = getIdentificador();
        this.dni = getDni();
        this.nombre = getNombre();
        this.direccion = getDireccion();
        this.numTelefono = getNumTelefono();
        this.empresa = getEmpresa();
        this.contrato = getContrato();
    }
    //To String

    @Override
    public String toString() {
        return "Contrato{" +
                "identificador=" + identificador +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
                ", empresa=" + empresa +
                ", contrato=" + contrato +
                '}';
    }

    //Equals and Hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(identificador, empleado.identificador) && Objects.equals(dni, empleado.dni) && Objects.equals(nombre, empleado.nombre) && Objects.equals(direccion, empleado.direccion) && Objects.equals(numTelefono, empleado.numTelefono) && Objects.equals(empresa, empleado.empresa) && Objects.equals(contrato, empleado.contrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, dni, nombre, direccion, numTelefono, empresa, contrato);
    }
}
