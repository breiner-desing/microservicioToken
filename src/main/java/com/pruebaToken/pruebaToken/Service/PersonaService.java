/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pruebaToken.pruebaToken.Service;

import com.pruebaToken.pruebaToken.modelo.Persona;
import java.util.List;
import java.util.Optional;


public interface PersonaService {
    
    public Persona save( Persona persona);
    public Persona update( Persona persona );
    public List<Persona> Listarpersona();
    public Optional<Persona> fynById(Integer id);            
    
}
