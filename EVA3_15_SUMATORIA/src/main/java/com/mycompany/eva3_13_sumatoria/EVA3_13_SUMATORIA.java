/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_13_sumatoria;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EVA3_13_SUMATORIA {

    public static void main(String[] args) {
        
        Scanner captu = new Scanner(System.in);{
        System.out.println("Introduzca la sumatoria: ");
        
        }
        
        int limitesumatoria = captu.nextInt();{
        int sumatoria = calcularSum(limitesumatoria);
        System.out.println("El resultado es = " + sumatoria);
        
        }
    }
    public static int calcularSum(int limiteSuperior){
        int sumatoria = 0;
        for (int i = 1; i <= limiteSuperior; i++) {
            sumatoria += i;
        }
        
        return sumatoria;
    
    }
}
