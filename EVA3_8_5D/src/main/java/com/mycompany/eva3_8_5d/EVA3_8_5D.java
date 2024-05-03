/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_5d;

/**
 *
 * @author irvingvalles
 */
public class EVA3_8_5D {

    public static void main(String[] args) {
        //Crear, llnear con valores aleatorios e imprimir un 
        //Arreglo de 5 dimensiones
        
        
        int cubo [][][][][] = new int [10][5][3][6][8]; //150 enteros 
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    for (int l = 0; l < cubo[i][j][k].length; l++) {
                        for (int m = 0; m < cubo[i][j][k][l].length; m++) {
                        
                            cubo[i][j][k][l][m] = (int)(Math.random() * 100);

                        }
                    }
                }
            }
        }

        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    for (int l = 0; l < cubo[i][j][k].length; l++) {
                        for (int m = 0; m < cubo[i][j][k][l].length; m++) {
                            
                            System.out.println("[" + cubo[i][j][k][l][m] + "]");
                        }
                    }
                }
            }
        }
    }
}
