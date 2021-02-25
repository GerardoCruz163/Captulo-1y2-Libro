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
public class NumerosIguales {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        System.out.println("Capture el primer numero.");
        n1= scanner.nextDouble();
        System.out.println("Capture el segundo numero.");
        n2= scanner.nextDouble();
        
        if(n1==n2){
            System.out.println("Los numeros son iguales.");
        }else{
            System.out.println("Los numeros son diferentes");
        }
    }
}
