/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_arreglos;

/**
 *
 * @author irvingvalles
 */
public class EVA3_1_ARREGLOS {

    public static void main(String[] args) {
        //LOS ARREGLOS EN JAVA SON OBJETOS
        //TENEMOS QUE CREARLOS ANTES DE USARLOS
        //[] --> manejar los indices arreglo [3] acceso a la posicion
        //declaracion = creacion (new) [tamaño del arreglo]
        
        int arreglo[] = new int[10];//un arreglo de 10 enteros
        
        //a traves de indices:
        //conocer las posiciones de los valores:
        //PRIMERO POCISION DE UN ARREGLO ES --> 0
        //ULTIMA POCISON DE UN ARREGLO ES --> N - 1, donde
        //N ES EL TAMAÑO DEL ARREGLO
        arreglo[1] = 100;
        System.out.println("valor  de arreglo[1] = " + arreglo[1]);
        System.out.println(arreglo);
        
    }
}
