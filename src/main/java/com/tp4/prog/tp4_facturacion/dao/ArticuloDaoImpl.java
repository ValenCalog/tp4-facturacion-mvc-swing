
package com.tp4.prog.tp4_facturacion.dao;

import com.tp4.prog.tp4_facturacion.modelo.Articulo;
import java.util.ArrayList;
import java.util.List;


public class ArticuloDaoImpl implements IArticuloDao{
    private List<Articulo> articulos = new ArrayList<>();
    private long contadorId = 0;

    @Override
    public Articulo crearArticulo(Articulo articulo) {
         articulo.setId(contadorId++);
         articulos.add(articulo);
         return articulo;
    }

    @Override
    public List<Articulo> obtenerArticulos() {
       return articulos;
    }

    @Override
    public Articulo buscarPorId(Long id) {
        for (Articulo articulo : articulos) {
            if(articulo.getId() == id){
                return articulo;
            }
        }
        return null;
    }

    @Override
    public void editarArticulo(Articulo articulo) {
        //lo dejo vacio porque ya se esta editando en el controlador, cuando pongamos persistencia acá actualizariamos la base de datos con el entityManager
    }

    @Override
    public void eliminarArticulo(Articulo articulo) {
        articulos.remove(articulo);
        System.out.println("Se ha eliminado correctamente el articulo con id "+ articulo.getId());
    }
    
}
