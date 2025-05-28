package com.example.demo.service;


import com.example.demo.models.EntidadEntity;
import com.example.demo.repository.EntidadRepository;
import com.example.demo.Dtos.EntidadDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class EntidadService {
    



    @Autowired
    private EntidadRepository repository;
@Autowired
    private ModelMapper mapper;

    public List<EntidadDTO> listar() {
        return repository.findAll().stream()
                .map(entidad -> mapper.map(entidad, EntidadDTO.class))
                .collect(Collectors.toList());
    }

    public EntidadDTO guardar(EntidadDTO dto) {
        EntidadEntity entidad = mapper.map(dto, EntidadEntity.class);
        return mapper.map(repository.save(entidad), EntidadDTO.class);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}