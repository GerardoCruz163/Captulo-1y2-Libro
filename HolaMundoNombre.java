/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap1;
import java.util.Scanner;
/**
 *
 * @author Gerardo
 */
public class HolaMundoNombre {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //mensaje que se mostrara
        System.out.println("Ingrese su nombre, edad y altura: ");
        //leer nombre desde el teclado
        String nom = scanner.next();
        //leer edad 
        int edad= scanner.nextInt();
        //leer altura 
        double altura= scanner.nextDouble();
        //mostrar resultado en pantalla
        System.out.println("Nombre: "+nom+" Edad: "+edad+" Altura: "+altura );
    }
    
}
