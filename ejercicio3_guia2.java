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
public class ejercicio3_guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
        
        String nombre;
        
        System.out.println("ingrese su nombre");
        
        nombre = leer.next();
        
        System.out.println("el nombre ingresado es " + nombre.toLowerCase()+ " en minusculas" );
        
        System.out.println("el nombre ingresado es " + nombre.toUpperCase()+ " en mayusculas");
                
    
    }
    
}
