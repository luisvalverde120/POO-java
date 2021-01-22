/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luchifer
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        String chasis, marca, modelo, placa;

        int tipo, dato;

        chasis = marca = modelo = placa = null;

        String aux;

        ArrayList<VehiculoLiviano> liviano = new ArrayList<VehiculoLiviano>();
        ArrayList<VehiculoPesado> pesado = new ArrayList<VehiculoPesado>();

        VehiculoLiviano vehiculoLiviano = new VehiculoLiviano();
        VehiculoPesado vehiculoPesado = new VehiculoPesado();

        ArrayList<String> datosVehiculoLiviano = new ArrayList<String>();
        ArrayList<String> datosVehiculoPesado = new ArrayList<String>();

        do {
            do {
                System.out.printf("\n\n%50S\n\n", "ADMINISTRADOR DE VEHICULOS");

                System.out.printf("%20s%s\n", "", "1) Ingreso de Vehiculo");
                System.out.printf("%20s%s\n", "", "2) Mostrar listado de Vehiculos");
                System.out.printf("%20s%s\n", "", "3) Mostrar listado de Vehiculos por clase");
                System.out.printf("%20s%s\n", "", "4) Eliminar vehiculo");
                System.out.printf("%20s%s\n", "", "5) Salir");

                System.out.printf("\n%20s", "ingrese la opcion (1-5): ");
                op = Integer.valueOf(sc.nextLine());

            } while (op <= 0 || op >= 6);

            // ingreso de datos
            if (op == 1) {

                do {

                    System.out.printf("\n%20s\n", "Tipo de Vehiculo: ");
                    System.out.printf("\n%15s%s", "", "1) Tipo Liviano");
                    System.out.printf("\n%15s%s", "", "2) Tipo Pesado");

                    System.out.printf("\n\n%15s", "opcion (1-2): ");
                    tipo = Integer.valueOf(sc.nextLine());

                    if (tipo < 1 || tipo > 2) {
                        System.err.println("ERROR: EL VALOR SOLO PUEDE SER 1 O 2");
                    }

                } while (tipo < 1 || tipo > 2);

                // distincion de liviano y pesado por un condicional
                if (tipo == 1) {

                    System.out.printf("\n%20s", "numero chasis: ");
                    chasis = sc.nextLine();

                    System.out.printf("\n%20s", "marca: ");
                    marca = sc.nextLine();

                    System.out.printf("\n%20s", "modelo: ");
                    modelo = sc.nextLine();

                    System.out.printf("\n%20s", "placa: ");
                    placa = sc.nextLine();

                    vehiculoLiviano = new VehiculoLiviano(chasis, marca, modelo, placa);

                    aux = vehiculoLiviano.toString();

                    // guardar la lista de objetos
                    liviano.add(vehiculoLiviano);

                    // guardar los datos del vehiculo
                    datosVehiculoLiviano.add(aux);

                } else if (tipo == 2) {

                    System.out.printf("\n%20s", "numero chasis: ");
                    chasis = sc.nextLine();

                    System.out.printf("\n%20s", "marca: ");
                    marca = sc.nextLine();

                    System.out.printf("\n%20s", "modelo: ");
                    modelo = sc.nextLine();

                    System.out.printf("\n%20s", "placa: ");
                    placa = sc.nextLine();

                    vehiculoPesado = new VehiculoPesado(chasis, marca, modelo, placa);

                    aux = vehiculoPesado.toString();

                    pesado.add(vehiculoPesado);

                    datosVehiculoPesado.add(aux);
                }

            }

            // imprimir los datos 
            if (op == 2) {

                for (int i = 0; i <= datosVehiculoLiviano.size() - 1; i++) {
                    System.out.printf("\n%30s%d\n", "Vehiculo Liviano ", i + 1);
                    System.out.println(datosVehiculoLiviano.get(i));
                }

                for (int i = 0; i <= datosVehiculoPesado.size() - 1; i++) {
                    System.out.printf("\n%30s%d\n", "Vehiculo Pesado ", i + 1);
                    System.out.println(datosVehiculoPesado.get(i));
                }

                System.out.printf("\n\n%25s%d","Total de vehiculos: ", (datosVehiculoLiviano.size() + datosVehiculoPesado.size()));

            }

            // imprimir pot tipo de vehiculo
            if (op == 3) {

                // Control para saber que tipo de dato imprimir
                do {

                    System.out.printf("%20s\n", "Cual tipo desea Mostrar: ");
                    System.out.printf("\n%15s%s", "", "1) Tipo Liviano");
                    System.out.printf("\n%15s%s", "", "2) Tipo Pesado");

                    System.out.printf("\n\n%15s", "opcion (1-2): ");
                    tipo = Integer.valueOf(sc.nextLine());

                    if (tipo < 1 || tipo > 2) {
                        System.err.println("ERROR: EL VALOR SOLO PUEDE SER 1 O 2");
                    }

                } while (tipo < 1 || tipo > 2);

                // imprimir tipo liviano
                if (tipo == 1) {
                    for (int i = 0; i < datosVehiculoLiviano.size(); i++) {
                        System.out.printf("\n%30s%d\n", "Vehiculo liviano ", i + 1);
                        System.out.println(datosVehiculoLiviano.get(i));
                    }
                    
                    System.out.printf("\n\n%25s%d","Total de vehiculos Livianos: ", datosVehiculoLiviano.size());
                    
                }

                // imprimir tipo Pesado
                if (tipo == 2) {
                    for (int i = 0; i < datosVehiculoPesado.size(); i++) {
                        System.out.printf("\n%30s%d\n", "Vehiculo Pesado ", i + 1);
                        System.out.println(datosVehiculoPesado.get(i));
                    }
                    
                    System.out.printf("\n\n%25s%d","Total de vehiculos Pesados: ", datosVehiculoPesado.size());
                    
                }

            }

            if (op == 4) {

                // tipo de vehiculo a eliminar
                do {

                    System.out.printf("%20s\n", "Cual Tipo de Vehiculo Desea Eliminar: ");
                    System.out.printf("\n%15s%s", "", "1) Tipo Liviano");
                    System.out.printf("\n%15s%s", "", "2) Tipo Pesado");

                    System.out.printf("\n\n%15s", "opcion (1-2): ");
                    tipo = Integer.valueOf(sc.nextLine());

                    if (tipo < 1 || tipo > 2) {
                        System.err.println("ERROR: EL VALOR SOLO PUEDE SER 1 O 2");
                    }

                } while (tipo < 1 || tipo > 2);

                // eliminar in vehiculo livinao
                if (tipo == 1) {

                    for (int i = 0; i < datosVehiculoLiviano.size(); i++) {
                        System.out.printf("\n%30s%d\n", "Vehiculo Liviano ", i + 1);
                        System.out.println(datosVehiculoLiviano.get(i));
                    }

                    // eliminacion del objeto y el dato del vehiuculo por medio del numero del vehiculo
                    do {
                        System.out.printf("\n\n%15s\n", "Ingrese el Numero Del Vehiculo a Eliminar: ");
                        System.out.printf("\n%s", "Numero Vehiculo: ");
                        dato = Integer.valueOf(sc.nextLine());

                    } while (dato <= 0 || dato > datosVehiculoLiviano.size());

                    datosVehiculoLiviano.remove(dato - 1);
                    liviano.remove(dato - 1);


                } else if (tipo == 2) {

                    for (int i = 0; i < datosVehiculoPesado.size(); i++) {
                        System.out.printf("\n%30s%d\n", "Vehiculo Pesado ", i + 1);
                        System.out.println(datosVehiculoPesado.get(i));
                    }

                    // eliminacion del objeto y el dato del vehiuculo por medio del numero del vehiculo
                    do {
                        System.out.printf("\n\n%15s\n", "Ingrese el Numero Del Vehiculo a Eliminar: ");
                        System.out.printf("\n%s", "Numero Vehiculo: ");
                        dato = Integer.valueOf(sc.nextLine());

                    } while (dato <= 0 || dato > datosVehiculoPesado.size());

                    datosVehiculoPesado.remove(dato - 1);
                    pesado.remove(dato - 1);

                    
                }
                
                // imprimir Vehiculos
                
                for (int i = 0; i <= datosVehiculoLiviano.size() - 1; i++) {
                    System.out.printf("\n%30s%d\n", "Vehiculo Liviano ", i + 1);
                    System.out.println(datosVehiculoLiviano.get(i));
                }

                for (int i = 0; i <= datosVehiculoPesado.size() - 1; i++) {
                    System.out.printf("\n%30s%d\n", "Vehiculo Pesado ", i + 1);
                    System.out.println(datosVehiculoPesado.get(i));
                }
                
                System.out.printf("\n%20s\n", "El Vehiculo fue eliminado con Exito!");

                System.out.printf("\n\n%25s%d","Total de vehiculos: ", (datosVehiculoLiviano.size() + datosVehiculoPesado.size()));
                
                

            }

        } while (op != 5);
    }

}
