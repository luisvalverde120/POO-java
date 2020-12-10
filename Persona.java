/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_001;

/**
 *
 * @author luchifer
 */
public class Persona {

    // datos
    // metodos
    /*
    METODO: constructor : sintaxis
    visibilidad NombreDeclase(argumentos){
        cuerpo
    }
     */

    // datos
    String nombre;
    String apellido;
    int edad;
    char genero;
    boolean esCasado;
    public Persona(){
        edad = 30;
        genero = 'f';
    }
    public Persona(String a, String b){
        nombre = a;
        apellido = b;
    }
    public Persona(String nombre, String apellido, int edad, boolean esCasado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.esCasado = esCasado;
    }
    
    private void MostrarNombreApellido(){
        System.out.println("Nombre: "+ nombre + "Apellido: " + apellido );
    }
    
    public void MostrarDatosCompletos(){
        MostrarNombreApellido();
        System.out.println("Edad: "+ edad + "estado civil: "+ esCasado);
    }
}   
