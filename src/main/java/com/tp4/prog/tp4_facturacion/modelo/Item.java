
package com.tp4.prog.tp4_facturacion.modelo;


public class Item {
    private Articulo articulo;
    private int cantidad;

    public Item() {
    }

    public Item(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double calcularMonto(){
        double monto = articulo.getPrecio() * cantidad;
        return monto;
    }
}
