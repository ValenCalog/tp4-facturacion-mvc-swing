
package com.tp4.prog.tp4_facturacion.modelo;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private List<Factura> facturas;

    public Cliente() {
    }
    
    

    public Cliente(String nombre, String apellido, String dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.facturas = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    //no esta en el diagrama de clases pero es para que se actualicen los dos lados al mismo tiempo(factura y cliente)
    public void agregarFactura(Factura f) {
        facturas.add(f);
        f.setCliente(this);
    }
    
}
