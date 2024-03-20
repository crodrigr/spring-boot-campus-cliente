package com.campusland.crudcliente.services.impl;

import org.springframework.stereotype.Service;

import com.campusland.crudcliente.repositories.RepositoryStudent;
import com.campusland.crudcliente.repositories.entities.Student;
import com.campusland.crudcliente.repositories.entities.Tuition;
import com.campusland.crudcliente.repositories.entities.University;
import com.campusland.crudcliente.services.StudentService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private RepositoryStudent repositoryStudent;

    @Override
    @Transactional
    public Student save(Student student) {

        Tuition tuition=student.getTuition();
        
        if(tuition!=null){
            tuition.setStudent(student);
        }
                   
        return repositoryStudent.save(student);
        
    }
    
}
