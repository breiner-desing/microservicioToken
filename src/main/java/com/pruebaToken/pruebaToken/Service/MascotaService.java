/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pruebaToken.pruebaToken.Service;

import com.pruebaToken.pruebaToken.modelo.Mascota;
import java.util.List;
import java.util.Optional;


public interface MascotaService  {
    public Mascota save (Mascota mascota);
    public void dalete (Mascota entity);
    public Mascota update(Mascota mascota);
    public List<Mascota> mascotas();
    public Optional<Mascota> mostrarId (Integer id);
}
