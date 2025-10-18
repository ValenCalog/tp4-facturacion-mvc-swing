/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp4.prog.tp4_facturacion.controlador;

import com.tp4.prog.tp4_facturacion.dao.IArticuloDao;
import com.tp4.prog.tp4_facturacion.modelo.Articulo;
import com.tp4.prog.tp4_facturacion.modelo.Domiciliaria;
import com.tp4.prog.tp4_facturacion.modelo.Electricidad;
import com.tp4.prog.tp4_facturacion.modelo.Herramientas;
import java.util.List;
import ui.ArticulosFrame;

public class ControladorArticulo {
    private final IArticuloDao dao;
    private final ArticulosFrame vista; //cambiar si no es esa clase la vista

    public ControladorArticulo(IArticuloDao dao, ArticulosFrame vista) {
        this.dao = dao;
        this.vista = vista;
    }

    
    public void crearElectricidadIndustrial(String nombre, double precio, int potenciaMaxima) {
        Articulo a = new Electricidad(nombre, precio, potenciaMaxima);
        dao.crearArticulo(a);
        actualizarLista();
    }

    public void crearElectricidadDomiciliaria(String nombre, double precio, int potenciaMaxima) {
        Articulo a = new Domiciliaria(nombre, precio, potenciaMaxima);
        dao.crearArticulo(a);
        actualizarLista();
    }

    public void crearHerramienta(String nombre, double precio, String descripcion) {
        Articulo a = new Herramientas(descripcion, nombre, precio);
        dao.crearArticulo(a);
        actualizarLista();
    }

    public void eliminarPorId(Long id) {
        Articulo a = dao.buscarPorId(id);
        if (a != null) { 
            dao.eliminarArticulo(a); 
            actualizarLista(); 
        }
    }

    public void actualizarLista() {
        List<Articulo> lista = dao.obtenerTodos();
        vista.mostrarArticulos(lista); // la vista refresca tabla/combobox
    }
}