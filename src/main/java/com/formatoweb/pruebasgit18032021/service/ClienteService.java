package com.formatoweb.pruebasgit18032021.service;

import com.formatoweb.pruebasgit18032021.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> getClientes();
    Cliente saveCliente(Cliente cliente);
}
