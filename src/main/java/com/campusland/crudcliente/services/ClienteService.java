package com.campusland.crudcliente.services;

import java.util.List;

import com.campusland.crudcliente.repositories.entities.Cliente;
import com.campusland.crudcliente.repositories.entities.Factura;
import com.campusland.crudcliente.repositories.entities.Producto;


public interface ClienteService {

    
    List<Cliente> findAll();

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    Cliente update(Long id,Cliente cliente);

    void delete(Long id);

    Cliente findByEmail(String email);

    Factura findFacturaById(Long id);

    List<Factura> findFacturaAll();

    Factura saveFactura(Factura factura);

    void deleteFacturaById(Long id);

    List<Producto> findProductoByNombre(String term);





    
}
