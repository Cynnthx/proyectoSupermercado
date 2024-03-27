package org.example.Utilidades;

import org.example.modelos.Factura;
import org.example.modelos.LineaFactura;

import java.time.LocalDate;

public class UtilidadesFactura {

    /**
     * EJERCICIO 4 -> A
     * @param factura
     * @return
     */
    public static boolean esFacturaVencida(Factura factura){
        LocalDate fechaVencimiento = factura.getFechaVencimiento();
        LocalDate fechaActual = LocalDate.now();

        return fechaVencimiento.isAfter(fechaActual) || fechaVencimiento.equals(fechaActual);
    }

    /**
     * EJERCICIO B
     * @param factura
     * @return
     */
    public static Double calcularBaseFactura(Factura factura){
        //0D cero doble.
        Double baseFactura = 0D;

        for(LineaFactura lineFactura : factura.getLineaFactura()){

            //importe del producto
            Double importeProducto = lineFactura.getProducto().getPrecio();
            Integer cantidad = lineFactura.getCantidad();
            baseFactura += importeProducto * cantidad;
        }
        return baseFactura;
    }

    /**
     * EJERCICIO C
     * @param factura
     * @return
     */
    public static Double calcularTotalAPagar(Factura factura){
        return (factura.getImporteBase() - factura.getDescuento() * factura.getIva());
    }

}
