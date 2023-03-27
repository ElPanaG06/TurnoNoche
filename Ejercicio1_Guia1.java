/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int suma;
        int num2;
        int num1;
    

        System.out.println("ingrese un numero entero");
        System.out.println("ingrese un numero entero");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        
        System.out.println("la suma de los numeros es " + suma );
        
        
    }
    
}
