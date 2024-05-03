/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_arreglos;

/**
 *
 * @author irvingvalles
 */
public class EVA3_9_ARREGLOS {

    public static void main(String[] args) {
     String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        for (String dias : diasSemana) {
            System.out.println(dias);
        }             
        
        
        int salario[] = {30, 50, 25, 35};
        for (int cant : salario ) {
            System.out.println("$" + cant);
        }   
        
        String mesAño [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre","Octubre", "Noviembre","Diciembre"};
        for (String mes : mesAño) {
            System.out.println(mes);
        }

    }
}
