package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.ContratoEntity;

public interface ContratoRepository extends JpaRepository<ContratoEntity, Long> {}