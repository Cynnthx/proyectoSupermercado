package org.example.modelos;

import java.util.Objects;

public class Contrato {

    //ATRIBUTOS
    private Integer identificador;
    private Double salarioBase;
    private TipoContrato tipoContrato;

    //GETTER AND SETTER

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    //CONSTRUCTOR VACIO
    public Contrato() {
    }

    //CONSTRUCTOR COMPLETO
    public Contrato(Integer identificador, Double salarioBase, TipoContrato tipoContrato) {
        this.identificador = identificador;
        this.salarioBase = salarioBase;
        this.tipoContrato = tipoContrato;
    }

    //CONSTRUCTOR COPIADO
    public Contrato(Contrato contrato) {
        this.identificador = getIdentificador();
        this.salarioBase = getSalarioBase();
        this.tipoContrato = getTipoContrato();
    }
    //TO STRING

    @Override
    public String toString() {
        return "Contrato{" +
                "identificador=" + identificador +
                ", salarioBase=" + salarioBase +
                ", tipoContrato=" + tipoContrato +
                '}';
    }

    //EQUALS AND HASHCODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return Objects.equals(identificador, contrato.identificador) && Objects.equals(salarioBase, contrato.salarioBase) && tipoContrato == contrato.tipoContrato;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, salarioBase, tipoContrato);
    }
}
