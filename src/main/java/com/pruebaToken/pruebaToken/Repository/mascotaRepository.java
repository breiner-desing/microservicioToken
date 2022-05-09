/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pruebaToken.pruebaToken.Repository;

import com.pruebaToken.pruebaToken.modelo.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;


public interface mascotaRepository extends JpaRepository<Mascota, Integer>{
    
}
