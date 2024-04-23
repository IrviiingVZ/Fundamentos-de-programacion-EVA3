/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_indice_erroneo;

/**
 *
 * @author irvingvalles
 */
public class EVA3_3_INDICE_ERRONEo {

    public static void main(String[] args) {
       int datos[] = new int [10];
       datos [10] = 100; //ERROR EN TIEMPO DE EJECUCION: El indice 10 no existe
        System.out.println("El valor en datos [10]" + datos[10]);
        
    }
}
