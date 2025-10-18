
package com.tp4.prog.tp4_facturacion.dao;


import com.tp4.prog.tp4_facturacion.modelo.Articulo;
import java.util.List;


public interface IArticuloDao {
    public Articulo crearArticulo(Articulo articulo);
    public List<Articulo> obtenerArticulos();
    public Articulo buscarPorId (Long id);
    public void editarArticulo(Articulo articulo);
    public void eliminarArticulo(Articulo articulo);
}
