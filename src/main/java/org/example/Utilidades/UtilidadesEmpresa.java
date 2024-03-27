package org.example.Utilidades;

import org.example.modelos.Empleado;
import org.example.modelos.Empresa;
import org.example.modelos.TipoContrato;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UtilidadesEmpresa {

    //Que devuelve la lista de empleados pertenecientes a la empresa y que
    //tienen un contrato del tipo que se le pasa.
    public static List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato) {
        List<Empleado> lista = new ArrayList<>();

        for (Empleado empleado : empresa.getEmpleados()) {
            if (empleado.getContrato().getTipoContrato().equals(tipoContrato)) {
                lista.add(empleado);
            }
        }
        return lista;
    }

    //Que devuelve todos los empleados de la empresa cuyo salario es mayor
    //o igual que 1000 € ordenados de mayor a menor salario.
    public static List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa) {
        List<Empleado> lista = new ArrayList<>();

        //Filtrar empleados con salario >= 1000
        for (Empleado empleado : empresa.getEmpleados()) {
            if (empleado.getContrato().getSalarioBase() >= 1000) {
                lista.add(empleado);

            }
        }
        //e es empleado
        lista.sort(Comparator.comparing(e -> e.getContrato().getSalarioBase()));
        lista = lista.reversed();

        return lista;

    }

    //Que devuelve la suma de los salarios de todos los empleados de la
    //empresa.

    /**
     * Devuelve la suma de los salarios de todos los empleados de la empresa
     * @param empresa
     * @return
     */
    public static Double fondoSalarialEmpresa(Empresa empresa) {

            double suma = 0.0;

            for (Empleado empleado : empresa.getEmpleados()) {
                suma += empleado.getContrato().getSalarioBase();
            }
            return suma;
    }

    //Que devuelve el empleado que más cobra de todos los empleados de las
    //empresas que se pasan como parámetros.

    /**
     * Devuelve el empleado que más cobra de todas las empresas
     * @param empresas
     * @return Empleado que más cobra
     */
    public static Empleado getMejorPagado(List<Empresa> empresas){

        Empleado mejorPagado = null;
        double salarioMaximo = 0.0;

        for (Empresa empresa : empresas){
            List<Empleado> empleados = empresa.getEmpleados();
            for (Empleado empleado : empleados){
                if (empleado.getContrato().getSalarioBase() > salarioMaximo){
                    salarioMaximo = empleado.getContrato().getSalarioBase();
                    mejorPagado = empleado;
                }
            }
        }

        return mejorPagado;
    }




}
