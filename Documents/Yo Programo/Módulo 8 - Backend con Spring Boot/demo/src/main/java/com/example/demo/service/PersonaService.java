package com.example.demo.service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void agregarPersona(Persona per) {
        persoRepository.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        Persona per = persoRepository.findById(id).orElse(null);
        return per;
    }

    @Override
    public Persona editarPersona(Long id, String nombre, String apellido, int edad) {
        Persona per = persoRepository.findById(id).orElse(null);
        per.setApellido(apellido);
        per.setNombre(nombre);
        per.setEdad(edad);
        
        persoRepository.save(per);
        
        return per;
    }
    
}
