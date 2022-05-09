/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaToken.pruebaToken.Service.Impl;

import com.pruebaToken.pruebaToken.Dto.PersonaDTO;
import com.pruebaToken.pruebaToken.Repository.PersonaRepository;
import com.pruebaToken.pruebaToken.Service.PersonaService;
import com.pruebaToken.pruebaToken.modelo.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope
@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository PersonaRepository;

    @Override
    public List<Persona> Listarpersona() {
        List<Persona> findAll = PersonaRepository.findAll();
        return findAll;
    }

    @Override
    public Persona save(Persona persona) {
        Persona save = PersonaRepository.save(persona);
        return save;
    }

    @Override
    public Persona update(Persona persona) {
        Persona save = PersonaRepository.save(persona);
        return save;
    }

    @Override
    public Optional<Persona> fynById( Integer id) {
        Optional<Persona> findById = PersonaRepository.findById(id);
        return findById;
    }
    
}
