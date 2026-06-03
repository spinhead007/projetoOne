package com.aula.pierre.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carros")
public class CarroRest {

    @GetMapping
    public ResponseEntity<String> listarTodos() {
        return ResponseEntity.ok("carros");
    }

    @GetMapping("/teste2")
    public ResponseEntity<String> listarTodos2() {
        return ResponseEntity.ok("motos");
    }
}
