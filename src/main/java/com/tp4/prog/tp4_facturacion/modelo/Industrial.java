
package com.tp4.prog.tp4_facturacion.modelo;


public class Industrial extends Electricidad{
    private double temperaturaMinima;
    private double temperaturaMaxima;

    public Industrial( double temperaturaMinima, double temperaturaMaxima, String nombre, double precio, int potenciaMaxima) {
        super( nombre, precio, potenciaMaxima);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
}
