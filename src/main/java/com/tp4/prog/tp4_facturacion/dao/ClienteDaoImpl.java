
package com.tp4.prog.tp4_facturacion.dao;

import com.tp4.prog.tp4_facturacion.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;


public class ClienteDaoImpl implements IClienteDao{
    private List<Cliente> clientes = new ArrayList<>();
    private long contadorId = 0;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        cliente.setId(contadorId + 1);
        clientes.add(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> obtenerClientes() {
       return clientes;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        for(Cliente cliente : clientes){
            if(cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Cliente buscarPorDni(String dni) {
        for(Cliente cliente : clientes){
            if(cliente.getDni() == dni){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void editarCliente(Cliente cliente) {
        Cliente clienteAEditar = buscarPorId(cliente.getId());
        if (clienteAEditar != null){
            clienteAEditar.setNombre(cliente.getNombre());
            clienteAEditar.setApellido(cliente.getApellido());
            clienteAEditar.setTelefono(cliente.getTelefono());
            clienteAEditar.setDireccion(cliente.getDireccion());
            //el dni consideramos que no se puede editar
            System.out.println("Se ha actualizado correctamente el cliente con id " + cliente.getId());
        
        }
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
       clientes.remove(cliente);
       System.out.println("Se ha eliminado correctamente el cliente con id "+ cliente.getId());
    }
    
    
}
