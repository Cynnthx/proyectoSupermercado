package org.example.modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
//import java.util.ArrayList;

public class Factura {
    //Atributos
    private Integer identificador;
    private String codigoFactura;
    private Double importeBase;
    private Double descuento;
    private Double iva;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private Boolean pagada;
    private List<LineaFactura> lineaFactura;
    private Cliente cliente;

    //Getters and Setters
    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Double getImporteBase() {
        return importeBase;
    }

    public void setImporteBase(Double importeBase) {
        this.importeBase = importeBase;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Boolean getPagada() {
        return pagada;
    }

    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }

    public List<LineaFactura> getLineaFactura() {
        return lineaFactura;
    }

    public void setLineaFactura(List<LineaFactura> lineaFactura) {
        this.lineaFactura = lineaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    //Constructor vacio
    public Factura() {

    }

    //Constructor completo
    public Factura(Integer identificador, String codigoFactura, Double importeBase, Double descuento, Double iva, LocalDate fechaEmision, LocalDate fechaVencimiento, Boolean pagada, List<LineaFactura> lineaFactura, Cliente cliente) {
        this.identificador = identificador;
        this.codigoFactura = codigoFactura;
        this.importeBase = importeBase;
        this.descuento = descuento;
        this.iva = iva;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.pagada = pagada;
        this.lineaFactura = lineaFactura;
        this.cliente = cliente;
    }

    //Constructor copiado
    public Factura(Factura factura) {
        this.identificador = getIdentificador();
        this.codigoFactura = getCodigoFactura();
        this.importeBase = getImporteBase();
        this.descuento = getDescuento();
        this.iva = getIva();
        this.fechaEmision = getFechaEmision();
        this.fechaVencimiento = getFechaVencimiento();
        this.pagada = getPagada();
        this.lineaFactura = getLineaFactura();
        this.cliente = getCliente();
    }

        //To String
        @Override
        public String toString () {
            return "Factura{" +
                    "identificador=" + identificador +
                    ", codigoFactura='" + codigoFactura + '\'' +
                    ", importeBase=" + importeBase +
                    ", descuento=" + descuento +
                    ", iva=" + iva +
                    ", fechaEmision=" + fechaEmision +
                    ", fechaVencimiento=" + fechaVencimiento +
                    ", pagada=" + pagada +
                    ", lineaFactura=" + lineaFactura +
                    ", cliente=" + cliente +
                    '}';
        }


    //Equals y Hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Objects.equals(identificador, factura.identificador) && Objects.equals(codigoFactura, factura.codigoFactura) && Objects.equals(importeBase, factura.importeBase) && Objects.equals(descuento, factura.descuento) && Objects.equals(iva, factura.iva) && Objects.equals(fechaEmision, factura.fechaEmision) && Objects.equals(fechaVencimiento, factura.fechaVencimiento) && Objects.equals(pagada, factura.pagada) && Objects.equals(lineaFactura, factura.lineaFactura) && Objects.equals(cliente, factura.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigoFactura, importeBase, descuento, iva, fechaEmision, fechaVencimiento, pagada, lineaFactura, cliente);
    }
}



