package com.campusland.crudcliente.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.campusland.crudcliente.repositories.entities.Producto;

public interface RepositoryProducto extends CrudRepository<Producto,Long> {

    @Query("select p from Producto where p.nombre like %?1%")
    List<Producto> findByNombre(String term);

    List<Producto> findByNombreContainingIgnoreCase(String term);
    
}
