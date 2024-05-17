/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        ArrayList<Computador> comp = new ArrayList<>();

        System.out.print("Ingrese el numero de computadoras: ");
        int numeroComputadoras = l.nextInt();
        System.out.println("===============================");
        for (int i = 0; i < numeroComputadoras; i++) {
            l.nextLine();
            
            System.out.print("Ingrese la marca de su computadora: ");
            String marca = l.next();
            System.out.println();
            
            System.out.println("Ingrese la marca y costo de los componenetes "
                    + "de su computador");
            
            System.out.print("Ingrese la marca de su procesador: ");
            String marcaProcesador = l.next();
            System.out.print("Ingrese el costo de su procesador: ");
            double costoProcesador = l.nextDouble();
            System.out.println();
            
            System.out.print("Ingrese la marca de su memoria: ");
            String marcaMemoria = l.next();
            System.out.print("Ingrese el costo de su memoria: ");
            double costoMemoria = l.nextDouble();
           
            Procesador p = new Procesador(marcaProcesador,
                    costoProcesador);
            Memoria m = new Memoria(marcaMemoria, costoMemoria);

            Computador com = new Computador(marca, p, m);
            com.calcularCostoComputador();

            comp.add(com);
        }
            System.out.println("===============================");
            Venta v = new Venta();
                v.establecerConputadoras(comp);
                v.calcularValorVenta();
            
            System.out.printf("%s\n ", v);
    }
}
