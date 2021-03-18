package com.formatoweb.pruebasgit18032021.controllers;

import com.formatoweb.pruebasgit18032021.entity.Cliente;
import com.formatoweb.pruebasgit18032021.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    public List<Cliente> getCliente(){
        return clienteService.getClientes();
    }
}
