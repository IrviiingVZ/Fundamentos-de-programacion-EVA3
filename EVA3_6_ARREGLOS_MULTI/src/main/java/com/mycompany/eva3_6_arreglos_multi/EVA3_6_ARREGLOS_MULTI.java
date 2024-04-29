/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_arreglos_multi;

/**
 *
 * @author irvingvalles
 */
public class EVA3_6_ARREGLOS_MULTI {

    public static void main(String[] args) {
        int matriz[][] = new int [3][2];
        matriz[0][0] = 100;
        matriz[1][0] = 200;
        matriz[2][0] = 300;
        matriz[0][1] = 400;
        matriz[1][1] = 500;
        matriz[2][1] = 500;
        //---------
        
        System.out.println("matriz.leng = " + matriz.length);
        //Voy a recorrer la primer dimension
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
                System.out.println("matriz[" + i + "][" + j + ") = " + matriz[i][j]);
            }
        }
        
    }
}
