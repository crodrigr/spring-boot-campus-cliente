package com.campusland.crudcliente.repositories.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "tuition")
@Data
public class Tuition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double fee;


    @JoinColumn(name = "student_id")
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnoreProperties("tuition")    
    private Student student;

}    
