/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap2.Fechas;

/**
 *
 * @author Gerardo
 */
public class TestFecha {
    public static void main(String[] args){
        Fecha f= new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);
        
        System.out.println("Dia="+f.getDia());
        
        System.out.println("Mes="+f.getMes());
        
        System.out.println("Anio="+f.getAnio());
        
        System.out.println(f);

    }
}
