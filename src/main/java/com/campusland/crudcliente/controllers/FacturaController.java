package com.campusland.crudcliente.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.campusland.crudcliente.repositories.entities.Factura;
import com.campusland.crudcliente.repositories.entities.Producto;
import com.campusland.crudcliente.services.ClienteService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/factura")
@AllArgsConstructor
public class FacturaController {

    private ClienteService clienteService;

    @GetMapping("/{id}")
    public Factura findById(@PathVariable Long id) {
        return clienteService.findFacturaById(id);
    }

    @GetMapping("/")
    public List<Factura> findById() {
        return clienteService.findFacturaAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clienteService.deleteFacturaById(id);
    }

    @GetMapping("/filtra-productos/{term}")
    public List<Producto> filtraProductos(@PathVariable String term){
        return clienteService.findProductoByNombre(term);
    }

    @PostMapping("/")
    public Factura save(@RequestBody Factura factura){
        return clienteService.saveFactura(factura);

    }



}
