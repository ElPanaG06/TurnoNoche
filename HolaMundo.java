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
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner (System.in);
        //esto lo tengo que poner cada vez que quiera decir algo y mostrarlo por pantalla
        System.out.println("ingrese su nombre");
        //se crea una variable cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        //smuerta un mensaje por pantalla
        //Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("hola mundo soy " + nombre + " y estoy preogramando en Java");
    }
    
}
