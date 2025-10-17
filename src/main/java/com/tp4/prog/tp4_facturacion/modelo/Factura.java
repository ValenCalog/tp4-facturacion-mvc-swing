
package com.tp4.prog.tp4_facturacion.modelo;

import java.time.LocalDate;
import java.util.List;


public class Factura {
    private LocalDate fecha;
    private long nroFactura;
    private char letra;
    private Cliente cliente; 
    private List<Item> items;

    public Factura() {
    }

    public Factura(LocalDate fecha, long nroFactura, char letra, Cliente cliente, List<Item> items) {
        this.fecha = fecha;
        this.nroFactura = nroFactura;
        this.letra = letra;
        this.cliente = cliente;
        this.items = items;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public long getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(long nroFactura) {
        this.nroFactura = nroFactura;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double informarTotalPagar(){
        double total = 0;
        for(Item item : items){
            total = total + item.calcularMonto();
        }
        return total;
    }
    
    
}
