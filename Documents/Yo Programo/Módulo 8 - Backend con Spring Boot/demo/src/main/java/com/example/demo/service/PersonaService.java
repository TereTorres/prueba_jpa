package com.example.demo.service;

import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository persoRepository;
}
