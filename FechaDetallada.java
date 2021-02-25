/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap2.misclases;
import Libro.Cap2.Fechas.Fecha;


/**
 *
 * @author Gerardo
 */
public class FechaDetallada extends Fecha {
    private static String meses[]={"Enero"
                                  ,"Febrero"
                                  ,"Marzo"
                                  ,"Abril"
                                  ,"Mayo"
                                  ,"Junio"
                                  ,"Julio"
                                  ,"Agosto"
                                  ,"Septiembre"
                                  ,"Octubre"
                                  ,"Noviembre"
                                  ,"Diciembre"};
      
    public String toString()  {
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    }
    
    public FechaDetallada(int dia, int mes, int anio){
        super(dia,mes,anio);
    }
    public FechaDetallada(String s){
        super(s);
    }
    
    
    public FechaDetallada(){
        this(0,0,0);
    }
            
     
    
}
