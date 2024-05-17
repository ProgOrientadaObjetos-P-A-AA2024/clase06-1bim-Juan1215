
package paquete3;

public class Procesador {
    private String marca;
    private double costo;
    
    public Procesador(String n, double c) {
        marca = n;
        costo = c;
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
