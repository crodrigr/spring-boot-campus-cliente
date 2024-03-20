package com.campusland.crudcliente.repositories.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="facturas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Factura implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String observacion;
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="factura_id")
    private List<ItemFactura> items;
    @JsonIgnoreProperties(value={"facturas", "hibernateLazyInitializer", "handler"}, allowSetters=true)
    @ManyToOne(fetch=FetchType.LAZY)
    private Cliente cliente;

    
}
