package com.tp4.prog.tp4_facturacion.modelo;


public class Electricidad extends Articulo{
    private double potenciaMaxima;
 
    public Electricidad(String nombre, double precio, int potenciaMaxima) {
        super(nombre, precio);
        this.potenciaMaxima = potenciaMaxima;
    }

    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(double potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }
    
}
