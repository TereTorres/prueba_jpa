package com.example.demo.service;

import com.example.demo.model.Persona;
import java.util.List;

public interface IPersonaService {

    public List <Persona> listarPersonas();
    
    public void agregarPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    
    public Persona editarPersona(Long id, String nombre, String apellido, int edad);
    
}

    

