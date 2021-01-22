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
public class Vehiculo {

    private String numeroChasis;
    private String marca;
    private String modelo;
    private String placa;

    public Vehiculo(String numeroChasis, String marca, String modelo, String placa) {
        this.numeroChasis = numeroChasis;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }


    
    /*
    
    uso del metodo toString para imprimir los datos de la clase
    
    */

    @Override
    public String toString() {
        return "\nNumero de Chasis: " + this.numeroChasis
                + "\nMarca: " + this.marca
                + "\nModelo: " + this.modelo
                + "\nPlaca: " + this.placa;
    }

}
