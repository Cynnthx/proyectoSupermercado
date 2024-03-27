package org.example.Utilidades;

import org.example.modelos.Contrato;

import org.example.modelos.Empleado;
import org.example.modelos.TipoContrato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesContrato {
    public static Map<TipoContrato, Double>
    getSalarioMedioTipoContrato(List<Contrato> contratos){
        return contratos.stream().collect(Collectors.groupingBy(Contrato::getTipoContrato,
                Collectors.averagingDouble(Contrato::getSalarioBase)));
    }

    public static Map<TipoContrato, Integer> getNumContratosPorTipo(List<Contrato> montonFolios){

        //preparar la mesa vacía
        Map<TipoContrato, Integer> mesa = new HashMap<>();

        //coger los folios del monton
        for(Contrato folio: montonFolios ){
            //ver si en la mesa hay un folio de ese color
            if(mesa.containsKey(folio.getTipoContrato())){
                //si lo hay lo colocamos en el mismo sitio
                //si en la mesa ya hay 3 folios del mismo color le sumamos uno
                mesa.put(folio.getTipoContrato(), mesa.get(folio.getTipoContrato())+1);
            }

            //sino hay folio de ese color en la mesa
            else{
                //lo ponemos en el sitio y contamos 1 (el primero)
                mesa.put(folio.getTipoContrato(),1);
            }

        }

        return mesa;

    }



}

