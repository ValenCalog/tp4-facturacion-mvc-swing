
package com.tp4.prog.tp4_facturacion.controlador;

import com.tp4.prog.tp4_facturacion.dao.IClienteDao;
import com.tp4.prog.tp4_facturacion.modelo.Cliente;
import java.util.List;


public class ControladorCliente {
    private IClienteDao dao;
    //private VistaCliente vista; cambiar VistaCliente por el nombre de la clase de la vista

    /*public ControladorCliente(IClienteDao dao, VistaCliente vista) {
        this.dao = dao;
        this.vista = vista;
    } Cambiar tamb lo de VistaCliente cuando se sepa*/
    
    public void crearCliente(String nombre, String apellido, String dni, String direccion, String telefono) {
        Cliente nuevoCliente = new Cliente(nombre, apellido, dni, direccion, telefono);
        dao.crearCliente(nuevoCliente);
        actualizarVista(); // actualiza la tabla en la vista
    }

   
    public void actualizarVista() {
        List<Cliente> clientes = dao.obtenerClientes();
        
        /* cambiar por el nombre que va a tener el metodo de la vista:
          vista.mostrarClientes(clientes); // podria ser un metodo asi que actualice la tabla
        */
    }

    public Cliente buscarPorId(Long id) {
        return dao.buscarPorId(id);
    }


    public Cliente buscarPorDni(String dni) {
        return dao.buscarPorDni(dni);
    }

    public void editarCliente(Long id, String nombre, String apellido, String direccion, String telefono) {
        //*esto lo voy a modificar despues por que quedo repetitivo en el dao y controlador, creo con JPA va a quedar mas limpio*/
        Cliente c = dao.buscarPorId(id);
        if (c != null) {
            c.setNombre(nombre);
            c.setApellido(apellido);
            c.setDireccion(direccion);
            c.setTelefono(telefono);
            dao.editarCliente(c); 
            actualizarVista(); 
        }
    }

    public void eliminarCliente(Long id) {
        Cliente c = dao.buscarPorId(id);
        if (c != null) {
            dao.eliminarCliente(c);
            actualizarVista(); 
        }
    }
}
