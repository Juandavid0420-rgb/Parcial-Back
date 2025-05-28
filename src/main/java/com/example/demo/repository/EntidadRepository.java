package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.EntidadEntity;

public interface EntidadRepository extends JpaRepository<EntidadEntity, Long> {}