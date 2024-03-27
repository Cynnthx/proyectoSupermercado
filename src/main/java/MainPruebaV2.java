import org.example.Utilidades.UtilidadesFactura;
import org.example.Utilidades.UtilidadesProducto;
import org.example.modelos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainPruebaV2 {
    public static void main(String[] args) {
        //UTILIDADES FACTURA

        Factura factura = new Factura(1, "F1", 1.0, 0D, 1.1, LocalDate.now(), LocalDate.now().plusDays(15), true, new ArrayList<>(), null);

        Almacen almacen1 = new Almacen(1, "Almacen Supermercado SAFA", 100);
        Producto producto = new Producto(1, "PR1", "Nestea 1L", LocalDate.now(), tipoProducto.BEBIDA, almacen1, 1.50);
        Producto producto2 = new Producto(1, "PR2", "Palomitas", LocalDate.now(), tipoProducto.DROGUERIA, almacen1, 0.80);
        Producto producto3 = new Producto(1, "PR3", "Fanta Naranja 1L", LocalDate.now(), tipoProducto.ALIMENTACION, almacen1, 0.80);


        LineaFactura linea1 = new LineaFactura(1, factura, producto, 10);
        LineaFactura linea2 = new LineaFactura(1, factura, producto2, 2);

        factura.setLineaFactura(List.of(linea1, linea2));



//        System.out.println(UtilidadesFactura.esFacturaVencida(factura));
//        System.out.println("El importe base de la factura es:" + UtilidadesFactura.calcularBaseFactura(factura));
//        System.out.println("El importe total de la factura es:" + UtilidadesFactura.calcularTotalAPagar(factura));

        List<Producto> listaProductos = List.of(producto, producto2, producto3);
        List<Producto> listaPrueba = UtilidadesProducto.getPorTipo(listaProductos, tipoProducto.BEBIDA);

        for(Producto p: listaPrueba){
            System.out.println(p.getDescripcion());
        }
    }
}
