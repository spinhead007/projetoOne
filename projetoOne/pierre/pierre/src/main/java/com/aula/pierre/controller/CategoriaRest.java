package com.aula.pierre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.pierre.service.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaRest {

    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping
    public ResponseEntity<String> listarTodos() {
        return ResponseEntity.ok("carros");
    }

}
 
