/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaToken.pruebaToken.Controller;

import com.pruebaToken.pruebaToken.Dto.PersonaDTO;
import com.pruebaToken.pruebaToken.Mapper.PersonaMapper;
import com.pruebaToken.pruebaToken.Service.PersonaService;
import com.pruebaToken.pruebaToken.modelo.Persona;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@CrossOrigin("*")
@RequestMapping("/Persona")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;
 
    @Autowired
    private PersonaMapper personaMaper;
    
    @GetMapping("mostrar")
    public ResponseEntity<List<PersonaDTO>> mascota () {
        List<Persona> persona = personaService.Listarpersona();
//        log.info("Lista");
        ResponseEntity<List<PersonaDTO>> body = ResponseEntity.ok().body(personaMaper.ListPersonaToListPersonaDTO(persona));
//        System.err.println(PersonaMaper.ListmascotaToListMascotaDTO(mascotas));
        return body;
    }
    
    @GetMapping("mostrar/{id}")
    public ResponseEntity<Optional<Persona>> mascotaId (@PathVariable("id") Integer id ) {
        Optional<Persona> Persona = personaService.fynById( id );
//        log.info("Lista");
        return  ResponseEntity.ok().body(Persona) ;
    }
    @PostMapping("save")
    public ResponseEntity<PersonaDTO> save (@RequestBody PersonaDTO Persona){
        Persona personaDTOToPersona = personaMaper.personaDTOToPersona(Persona);
        Persona save = personaService.save(personaDTOToPersona);
//        log.info("Guardar", mascota );
        return  ResponseEntity.ok().body(personaMaper.personaToPersonaDTO(save));
    }
    
    @PostMapping("update")
    public ResponseEntity<PersonaDTO> update (@RequestBody PersonaDTO persona){
        Persona personaDTOToPersona = personaMaper.personaDTOToPersona(persona);
        Persona update = personaService.update(personaDTOToPersona);
//        log.info("Actualizar: ", mascota);
        return ResponseEntity.ok().body(personaMaper.personaToPersonaDTO(update));
    }
    
    
}
