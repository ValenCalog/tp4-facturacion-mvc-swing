
package com.tp4.prog.tp4_facturacion.modelo;

public class Herramientas extends Articulo{
    private String descripcion;
    
    public Herramientas(String descripcion, String nombre, double precio) {
        super(nombre, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
