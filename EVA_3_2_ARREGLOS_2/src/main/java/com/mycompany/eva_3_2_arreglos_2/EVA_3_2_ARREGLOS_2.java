/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_2_arreglos_2;

/**
 *
 * @author irvingvalles
 */
public class EVA_3_2_ARREGLOS_2 {

    public static void main(String[] args) {
        //JAVA: 0 primer elemento
        //      N - 1 ULTIMO ELEMENTO
        //N --> TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        
        //vamos a crear un arreglo y nnearlo de valores aleatorios
        //int datos [],x,y --> SOLO datos es un ARREGLO
        // int[] datos, x, y; --> TODAS LAS VARIBLES SON ARREGLOS 
        
        int datos[] = new int [20] ;
        
        //ASIGNAR VALORES ENTRE 0 Y 99
        for(int i = 0; i < datos.length; i++){
            datos[i] = (int) (Math.random() * 100); //Genera numeros entre 0 - 99
          
        }
        //Imprimir los elemntos del arreglo:
            for(int i = 0; i < datos.length; i++){
                System.out.print("[" + datos [i] + "]");
        }
    }
    
}
