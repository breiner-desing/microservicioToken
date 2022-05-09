/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaToken.pruebaToken.Dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;
import lombok.Data;


//@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY )
public class MascotaDTO implements Serializable {

    private Integer id;
    private String nombre;
    private String historial;
    private Integer persona;

    public MascotaDTO(Integer id, String nombre, String historial, Integer persona) {
        this.id = id;
        this.nombre = nombre;
        this.historial = historial;
        this.persona = persona;
    }

    public MascotaDTO() {
    }    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public Integer getPersona() {
        return persona;
    }

    public void setPersona(Integer persona) {
        this.persona = persona;
    }
    
    
}
