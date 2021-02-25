/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap2;

import Libro.Cap2.Fechas.Fecha;
import Libro.Cap2.misclases.FechaDetallada;

/**
 *
 * @author Gerardo
 */
public class TestPolimorfismo {
    public static void main(String[] args){
        
        Fecha fec = new FechaDetallada();
        
        Object obj = new FechaDetallada();

        System.out.println("fec = "+fec); 
        System.out.println("obj = "+obj); 
    }
}
