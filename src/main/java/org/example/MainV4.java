package org.example;

import org.example.Utilidades.UtilidadesContrato;
import org.example.modelos.Contrato;
import org.example.modelos.TipoContrato;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainV4 {
    public static void main(String[] args) {
        List<Contrato> contratos = new ArrayList<>();
                contratos.add(new Contrato(1, 2000.0, TipoContrato.INDEFINIDO));
                contratos.add(new Contrato(2, 2500.0, TipoContrato.PRACTICAS));
                contratos.add(new Contrato(3, 2200.0, TipoContrato.TEMPORAL));
                contratos.add(new Contrato(4, 2700.0, TipoContrato.INDEFINIDO));
                contratos.add(new Contrato(5, 3000.0, TipoContrato.OBRAYSERVICIO));

        UtilidadesContrato utilidades = new UtilidadesContrato();

        Map<TipoContrato, Double>  SalarioMedioTipoContrato = utilidades.getSalarioMedioTipoContrato(contratos);
        System.out.println("Salario Medio por Tipo de Contrato: ");

        SalarioMedioTipoContrato.forEach((tipoContrato, salarioBase) ->
        System.out.println("Tipo de Contrato: " + tipoContrato +", Salario Medio: " + salarioBase));

        System.out.println(UtilidadesContrato.getNumContratosPorTipo(contratos));
    }
}
