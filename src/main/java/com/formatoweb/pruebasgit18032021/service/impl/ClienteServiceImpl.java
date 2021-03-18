package com.formatoweb.pruebasgit18032021.service.impl;

import com.formatoweb.pruebasgit18032021.entity.Cliente;
import com.formatoweb.pruebasgit18032021.repository.ClienteRepository;
import com.formatoweb.pruebasgit18032021.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }
}
