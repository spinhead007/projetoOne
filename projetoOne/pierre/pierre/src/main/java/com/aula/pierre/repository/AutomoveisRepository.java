package com.aula.pierre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.pierre.entity.Automoveis;

@Repository
public interface AutomoveisRepository extends JpaRepository<Automoveis,Integer>{
    
} 