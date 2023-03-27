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
public class ejercicio5_guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    
    int num;
    int doble;
    int triple;
    double raizC;
    
    System.out.println("ingrese un numero");
    num = leer.nextInt();
    
    doble = num * 2;
    
    triple = num * 3;
    
    raizC = Math.sqrt(num);
    
    System.out.println("el doble del numero ingresado es " + doble );
    
    System.out.println("el triple es " + triple);
    
    System.out.println("y la raiz es de " + raizC);
            
    }
    
}
