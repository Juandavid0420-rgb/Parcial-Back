package com.example.demo.controllers;

import com.example.demo.Dtos.ContratoDTO;
import com.example.demo.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {

    @Autowired
    private ContratoService service;

    @GetMapping
    public List<ContratoDTO> listar() {
        return service.listar();
    }

    @PostMapping
    public ContratoDTO guardar(@RequestBody ContratoDTO dto) {
        return service.guardar(dto);
    }

    @PostMapping("/entidad/{entidadId}")
    public ContratoDTO guardarEnEntidad(@PathVariable Long entidadId, @RequestBody ContratoDTO dto) {
        dto.setEntidadId(entidadId);
        return service.guardar(dto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
