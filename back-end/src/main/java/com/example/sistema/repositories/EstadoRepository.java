package com.example.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sistema.models.Estado;

public interface  EstadoRepository extends JpaRepository<Estado, Long>{
    
}
