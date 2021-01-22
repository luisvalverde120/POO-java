/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author luchifer
 */
public class VehiculoLiviano extends Vehiculo{
    
    
    public VehiculoLiviano (String numeroChasis, String marca, String modelo, String placa){
        super(numeroChasis, marca, modelo, placa);
    }
     
    public VehiculoLiviano(){
        super(null,null,null,null);
    }
    
    /* 
    
    uso del metodo toString de la clase padre para imprimr
    
    */
    
    @Override
    public String toString(){
        return  "\ntipo de vehiculo: Liviano" + super.toString();
    }
    
}
