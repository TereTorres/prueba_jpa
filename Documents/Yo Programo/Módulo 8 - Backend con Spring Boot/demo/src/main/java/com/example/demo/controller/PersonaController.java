package com.example.demo.controller;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService interPerso;
    
    @GetMapping("/persona/traer")
    public List <Persona> listarPersonas(){
        return interPerso.listarPersonas();
    }
    
    @PostMapping("/persona/crear")
    public String agregarPersona(@RequestBody Persona per){
        interPerso.agregarPersona(per);
        return "Persona agregada correctamente";
        
    }
    
    @DeleteMapping("/persona/borrar/{id}")
    public String borrarPersona(@PathVariable Long id){
        interPerso.borrarPersona(id);
        return "Persona borrada correctamente";
    }
    
    @PutMapping("/persona/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
                                @RequestParam ("nombre") String nombre,
                                @RequestParam ("apellido") String apellido,
                                @RequestParam ("edad") int edad){
        Persona per = interPerso.editarPersona(id, nombre, apellido, edad);
        return per;
    }
    
}
