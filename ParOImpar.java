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

public class ParOImpar {
    public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
    
    System.out.println("Introduce un numero: ");
    int v=scanner.nextInt();  
    
    int resto= v % 2;
    
    String mssg = (resto == 0 ) ? "es Par": "es Impar";
    
    System.out.println(v+" "+mssg);
    }
    
}
