package com.campusland.crudcliente.services;

import java.util.List;

import com.campusland.crudcliente.repositories.entities.Cliente;


public interface ClienteService {

    
    List<Cliente> findAll();

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    void delete(Long id);



    
}
