package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.ProductoService;
import com.example.demo.models.Producto;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService Service;

    @GetMapping public List<Producto> listar() { return Service.listar(); }
    @PostMapping public Producto guardar(@RequestBody Producto p) { return Service.guardar(p); }
    @DeleteMapping public void eliminar(@PathVariable Long id) { Service.eliminar(id); }
}
