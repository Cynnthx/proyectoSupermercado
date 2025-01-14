package org.example.modelos;

import java.util.Objects;

public class LineaFactura {
    //Atributos
    private Integer identificador;
    private Factura factura;
    private Producto producto;
    private Integer cantidad;
    //Getters and Setters

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    //Constructor vacio

    public LineaFactura() {
    }


    //Constructor completo
    public LineaFactura(Integer identificador, Factura factura, Producto producto, Integer cantidad) {
        this.identificador = identificador;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //Constructor copiado
    public LineaFactura(Producto producto) {
        this.identificador = getIdentificador();
        this.factura = getFactura();
        this.producto = getProducto();
        this.cantidad = getCantidad();
    }
    //To String

    @Override
    public String toString() {
        return "LineaFactura{" +
                "identificador=" + identificador +
                ", factura=" + factura +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }

    //Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineaFactura that = (LineaFactura) o;
        return Objects.equals(identificador, that.identificador) && Objects.equals(factura, that.factura) && Objects.equals(producto, that.producto) && Objects.equals(cantidad, that.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, factura, producto, cantidad);
    }
}
