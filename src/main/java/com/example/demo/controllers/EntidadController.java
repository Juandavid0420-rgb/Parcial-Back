package com.example.demo.controllers;


import com.example.demo.service.EntidadService;
import com.example.demo.Dtos.EntidadDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/entidades")
public class EntidadController {

    @Autowired
    private EntidadService service;

    @GetMapping
    public List<EntidadDTO> listar() {
        return service.listar();
    }

    @PostMapping
    public EntidadDTO guardar(@RequestBody EntidadDTO entidad) {
        return service.guardar(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
