package org.example;

import org.example.Utilidades.UtilidadesEmpresa;
import org.example.modelos.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class MainV3 {
    public static void main(String[] args) {

        //EJERCICIO A
        //Crear una instancia de UtilidadesEmpresa
        UtilidadesEmpresa utilidadesEmpresa = new UtilidadesEmpresa();


        Contrato contrato1 = new Contrato(1, 1000.01, TipoContrato.INDEFINIDO);
        Contrato contrato2 = new Contrato(2, 1500.01, TipoContrato.TEMPORAL);
        Contrato contrato3 = new Contrato(3, 2000.01, TipoContrato.INDEFINIDO);

        Empleado empleado1 = new Empleado(1, "12345678A", "Nicole", "Sevilla", "678678788", null, contrato1);
        Empleado empleado2 = new Empleado(2, "12345678B", "Luna", "Roma", "678677777", null, contrato2);
        Empleado empleado3 = new Empleado(3, "12345678C", "Mia", "Colombia", "678677444", null, contrato3);

        //Crear lista de empleados para una empresa.
        List<Empleado> empleadosEmpres = new ArrayList<>();
        empleadosEmpres.add(empleado1);
        empleadosEmpres.add(empleado2);
        empleadosEmpres.add(empleado3);

        //Creamos lista de empleados.
        Empresa empresa1 = new Empresa(1, "PR1", empleadosEmpres, TipoEmpresa.MULTINACIONAL);

        //Llamados al método.
        List<Empleado> empleadosIndefinidos = utilidadesEmpresa.getEmpleadosPorContrato(empresa1, TipoContrato.INDEFINIDO);


        System.out.println("Empleados con un contrato indefinido: ");
        for(Empleado empleado: empleadosIndefinidos){
            System.out.println(empleado.getNombre());
        }


        //EJERCICIO B. OBTENER MILEURISTAS ORDENADOS POR SALARIO.
        List<Empleado> mileurista = UtilidadesEmpresa.getMileuristasOrdenadosPorSalario(empresa1);
        System.out.println("Empleados con contrato Mileuristas: ");
        for(Empleado empleado: mileurista){
            System.out.println(empleado.getNombre() + ": " + empleado.getContrato().getSalarioBase());
        }

        //EJERCICIO C. SUMA DE LOS SALARIOS DE TODOS LOS EMPLEADOS DE LA EMPRESA
        double suma = UtilidadesEmpresa.fondoSalarialEmpresa(empresa1);
        System.out.println("El fondo salarial de los empleados de la empresa es: " + suma);

        //EJERCICIO D. EMPLEADO QUE MAS COBRA DE TODOS DE LAS EMPRESAS QUE SE PASAN COMO PARAMETROS.
        Empleado mejorPagado = UtilidadesEmpresa.getMejorPagado(List.of(empresa1));
        System.out.println("Empleado que más cobra de todos de las empresas: " + mejorPagado.getNombre() + " - Salario: " + mejorPagado.getContrato().getSalarioBase());
    }



}
