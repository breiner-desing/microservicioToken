/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaToken.pruebaToken.Service.Impl;

import com.pruebaToken.pruebaToken.Repository.mascotaRepository;
import com.pruebaToken.pruebaToken.Service.MascotaService;
import com.pruebaToken.pruebaToken.modelo.Mascota;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Scope
@Service
public class MascotaServiceImpl implements MascotaService{
    
    @Autowired
    private mascotaRepository mascotaRepository;

    
    @Override
    public Mascota save (Mascota mascota){
        Mascota save = mascotaRepository.save(mascota);
        return save;
    }
    
    @Override
    public void dalete (Mascota entity){
        mascotaRepository.delete(entity);
    }
    
    @Override
    public Mascota update(Mascota mascota){
        Mascota save = mascotaRepository.save(mascota);
        return save;
    } 

    @Override
    public List<Mascota> mascotas() {
        List<Mascota> save = mascotaRepository.findAll();
        return save;
    }

    @Override
    public Optional<Mascota> mostrarId(Integer id) {
        Optional<Mascota> save = mascotaRepository.findById(id);
//        Mascota b = (Mascota) save; 
        return save;    
    }
    
    
}
