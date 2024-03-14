package com.campusland.crudcliente.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campusland.crudcliente.repositories.entities.Cliente;

@Service
public interface ClienteService {

    
    List<Cliente> findAll();

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    void delete(Long id);



    
}
