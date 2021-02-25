package Libro.cap1;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerardo
 */
public class PrimerosNumeros1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //leer valor de n
        int n = scanner.nextInt();
        
        int i= 1;
        
        while(i<=n){
            //mostrar el valor de i
            System.out.println(i);
            //incremento del valor de i
            i++;
        }
    }
}
