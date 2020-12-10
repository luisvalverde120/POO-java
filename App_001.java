/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_001;

public class App_001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero; // variable
        Persona peter = new Persona("peter", "Grefind"); // INSTANCIACION // peter: instancia
        // objeto/instancia = new Metodo_Constructor ();
        Persona jhon = new Persona();
        Persona samuel = new Persona("Samuel", "villa", 20, true);
        
        jhon.MostrarDatosCompletos();
        System.out.println("");
        samuel.MostrarDatosCompletos();
        System.out.println("");
        peter.MostrarDatosCompletos();
        
        // constructor:
        // 1) crear memoria para alijar al objeto //peter
        // y para aojar datos 
        
        
        /*
        Persona mary = new Persona();
        Persona jhon;
        jhon = new Persona();
        Persona nancy = new Persona();
        */
        
    }
    
}
