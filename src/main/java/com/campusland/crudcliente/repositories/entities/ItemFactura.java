package com.campusland.crudcliente.repositories.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="facturas_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemFactura implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    private Long id;
    private Integer cantidad;
    @ManyToOne()
    @JoinColumn(name = "producto_id")
    private Producto producto;

    
}
