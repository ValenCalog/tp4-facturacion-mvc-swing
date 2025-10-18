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
import com.tp4.prog.tp4_facturacion.modelo.Industrial;
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
    
   
    public boolean editarElectricidadIndustrial(Long id, String nombre, double precio, int potenciaMaxima) {
        Articulo a = dao.buscarPorId(id);
        if (a instanceof Industrial industrial) {
            industrial.setNombre(nombre);
            industrial.setPrecio(precio);
            industrial.setPotenciaMaxima(potenciaMaxima);
            dao.editarArticulo(a);
            actualizarLista();
            return true;
        }
        return false; // si el tipo no coincide, no editamos
    }

    public boolean editarElectricidadDomiciliaria(Long id, String nombre, double precio) {
        Articulo a = dao.buscarPorId(id);
        if (a instanceof Domiciliaria domiciliaria) {
            domiciliaria.setNombre(nombre);
            domiciliaria.setPrecio(precio);
            dao.editarArticulo(a);
            actualizarLista();
            return true;
        }
        return false;
    }

  
    public boolean editarHerramienta(Long id, String nombre, double precio, String descripcion) {
        Articulo a = dao.buscarPorId(id);
        if (a instanceof Herramientas herramientas) {
            herramientas.setNombre(nombre);
            herramientas.setPrecio(precio);
            herramientas.setDescripcion(descripcion);
            dao.editarArticulo(a);
            actualizarLista();
            return true;
        }
        return false;
    }

    public void actualizarLista() {
        List<Articulo> lista = dao.obtenerArticulos();
        // vista.mostrarArticulos(lista); // (lo dejo comentado por ahora para que no tire error
    }
}