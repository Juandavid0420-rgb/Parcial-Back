package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.demo.models.Categoria;

import com.example.demo.repository.CategoriaRepository;
@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    public Categoria guardar(Categoria c) {
        return categoriaRepository.save(c);
    }

    public void eliminar(Long id) {
        categoriaRepository.deleteById(id);
    }
}