package org.example.Utilidades;
import org.example.modelos.Producto;
import org.example.modelos.tipoProducto;

import java.util.ArrayList;
import java.util.List;
public class UtilidadesProducto {

    public static List<Producto> getPorTipo(List<Producto> productos, tipoProducto tipo){

        List<Producto> productosConTipo = new ArrayList<>();

        for(Producto producto: productos){
            if(producto.getTipoProducto().equals(tipo)){
                productosConTipo.add(producto);
            }
        }
        return productosConTipo;

    }

}
