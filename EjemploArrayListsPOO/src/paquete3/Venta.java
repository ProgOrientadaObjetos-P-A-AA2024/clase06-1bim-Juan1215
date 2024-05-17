/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public void calcularValorVenta() {
      
        for (int i = 0; i < computadoras.size(); i++) {
            valorVenta = valorVenta + computadoras.get(i).obtenerCostoComputador();
        }
    }

    public void establecerConputadoras(ArrayList<Computador> c) {
        computadoras = c;
    }

    public double obtenerValorVenta() {
        return valorVenta;
    }

    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    @Override
    public String toString() {
        String cadena = "Reporte de ventas de computadoras";
        for (int i = 0; i < computadoras.size(); i++) {
            cadena = String.format("%s\n"
                    + "Marca de la computadora: %s\n"
                    + "Marca del procesador: %s\n"
                    + "Costo del procesador: %.2f\n"
                    + "Marca de la memoria: %s\n"
                    + "Costo de la memoria: %.2f\n"
                    + "Costo de la computadora: %.2f\n",
                    cadena,
                    computadoras.get(i).obtenerMarca(),
                    computadoras.get(i).obtenerProcesador().obtenerMarca(),
                    computadoras.get(i).obtenerProcesador().obtenerCosto(),
                    computadoras.get(i).obtenerMemoria().obtenerMarca(),
                    computadoras.get(i).obtenerMemoria().obtenerCosto(),
                    computadoras.get(i).obtenerCostoComputador());

        }
        cadena = String.format("%s\n Valor de la venta total: %.2f\n",
                cadena, obtenerValorVenta());
        return cadena;
    }
}
