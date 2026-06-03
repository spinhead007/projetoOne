package com.aula.pierre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.pierre.repository.AutomoveisRepository;

@Service
public class AutomoveisService {

    @Autowired
    private AutomoveisRepository automoveisRepository;
    
}
