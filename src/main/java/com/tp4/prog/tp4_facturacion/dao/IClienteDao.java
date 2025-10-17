
package com.tp4.prog.tp4_facturacion.dao;

import com.tp4.prog.tp4_facturacion.modelo.Cliente;
import java.util.List;


public interface IClienteDao {
    public Cliente crearCliente(Cliente cliente);
    public List<Cliente> obtenerClientes();
    public Cliente buscarPorId (Long id);
    public Cliente buscarPorDni(String dni);
    public void editarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
}
