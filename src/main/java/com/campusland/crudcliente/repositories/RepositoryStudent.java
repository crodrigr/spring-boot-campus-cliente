package com.campusland.crudcliente.repositories;

import org.springframework.data.repository.CrudRepository;

import com.campusland.crudcliente.repositories.entities.Student;

public interface RepositoryStudent extends CrudRepository<Student,Long>{
    
}
