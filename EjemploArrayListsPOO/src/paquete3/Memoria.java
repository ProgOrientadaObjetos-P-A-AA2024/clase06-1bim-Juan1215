/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Memoria {

    private String marca;
    private double costo;

    public Memoria(String n, double c) {
        marca = n;
        costo = c;
    }

    public Memoria(String n) {
        marca = n;
        costo = 350;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerCosto(double c) {
        costo = c;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerCosto() {
        return costo;
    }

}
