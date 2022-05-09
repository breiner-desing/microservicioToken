/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaToken.pruebaToken.Controller;

import com.pruebaToken.pruebaToken.Dto.MascotaDTO;
import com.pruebaToken.pruebaToken.Mapper.MascotaMapper;
import com.pruebaToken.pruebaToken.Service.MascotaService;
import com.pruebaToken.pruebaToken.modelo.Mascota;
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
@RequestMapping("/mascota")
public class MascotaController {
    
    @Autowired
    private MascotaService mascotaService;
 
    @Autowired
    private MascotaMapper mascotaMaper;
    
    @GetMapping("mostrar")
    public ResponseEntity<List<MascotaDTO>> mascota () {
        List<Mascota> mascotas = mascotaService.mascotas();
//        log.info("Lista");
        System.err.println(mascotas.get(0));
        
        ResponseEntity<List<MascotaDTO>> body = ResponseEntity.ok().body(mascotaMaper.ListmascotaToListMascotaDTO(mascotas));
        System.err.println(mascotaMaper.ListmascotaToListMascotaDTO(mascotas));
        return body;
    }
    
    @GetMapping("mostrar/{id}")
    public ResponseEntity<Optional<Mascota>> mascotaId (@PathVariable("id") Integer id ) {
        Optional<Mascota> mascotas = mascotaService.mostrarId( id );
        
//        log.info("Lista");
        return  ResponseEntity.ok().body(mascotas) ;
    }
    @PostMapping("save")
    public ResponseEntity<MascotaDTO> save (@RequestBody MascotaDTO mascota){
        Mascota mascotaDTOTomascota = mascotaMaper.mascotaDTOTomascota(mascota);
        Mascota save = mascotaService.save(mascotaDTOTomascota);
//        log.info("Guardar", mascota );
        return  ResponseEntity.ok().body(mascotaMaper.mascotaToMascotaDTO(save));
    }
    
    @PostMapping("update")
    public ResponseEntity<MascotaDTO> update (@RequestBody MascotaDTO mascota){
        Mascota mascotaDTOTomascota = mascotaMaper.mascotaDTOTomascota(mascota);
        Mascota update = mascotaService.update(mascotaDTOTomascota);
//        log.info("Actualizar: ", mascota);
        return ResponseEntity.ok().body(mascotaMaper.mascotaToMascotaDTO(update));
    }
    
    @DeleteMapping
    public String delete (Integer id){
        return "Eliminado";
    }
    
}
