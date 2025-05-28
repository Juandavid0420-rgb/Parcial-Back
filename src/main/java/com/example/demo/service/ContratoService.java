package com.example.demo.service;

import com.example.demo.models.ContratoEntity;
import com.example.demo.models.EntidadEntity;
import com.example.demo.repository.ContratoRepository;
import com.example.demo.repository.EntidadRepository;
import com.example.demo.Dtos.ContratoDTO;
import com.example.demo.Dtos.EntidadDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;



@Service
public class ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    @Autowired
    private EntidadRepository entidadRepository;

    @Autowired
    private ModelMapper mapper;

    public List<ContratoDTO> listar() {
        return contratoRepository.findAll().stream()
                .map(c -> mapper.map(c, ContratoDTO.class))
                .collect(Collectors.toList());
    }

    public ContratoDTO guardar(ContratoDTO dto) {
        ContratoEntity contrato = mapper.map(dto, ContratoEntity.class);
        if (dto.getEntidadId() != null) {
            EntidadEntity entidad = entidadRepository.findById(dto.getEntidadId()).orElseThrow();
            contrato.setEntidad(entidad);
        }
        return mapper.map(contratoRepository.save(contrato), ContratoDTO.class);
    }

    public void eliminar(Long id) {
        contratoRepository.deleteById(id);
    }
}