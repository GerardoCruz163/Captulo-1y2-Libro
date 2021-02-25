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
public class TestMuestraConjunto {
    public static void main(String[] args){
        Object[] arr = { new Fecha(2,10,1970)
        , new FechaDetallada()     
        , new String("Esto es una cadena")
        , new Integer(34) };
        
        MuestraConjunto.mostrar(arr);
    }
}
