/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

    public Computador(String n, double c, Procesador p, Memoria m) {
        marca = n;
        procesador = p;
        memoria = m;
    }

    public Computador(double c, Procesador p, Memoria m) {
        marca = "Dell";
        procesador = p;
        memoria = m;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerProcesador(Procesador n) {
        procesador = n;
    }

    public void establecerMemoria(Memoria c) {
        memoria = c;
    }

    public void calcularCostoComputador(){
        costoComputador = procesador + memoria; 
    }
    
    public String obtenerMarca() {
        return marca;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }
    
    public Memoria obtenerMemoria(){
        return memoria;
    }
    
    public double obtenerCostoComputador(){
        return costoComputador;
    }
}
