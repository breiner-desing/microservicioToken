/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaToken.pruebaToken.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Tu compra
 */
@Entity
@Table( name="mascotas" )
public class Mascota implements Serializable {
    
    @Id
    @Column( name="idmascota" )
    private Integer id;
    
    @Column( name="nombre" )
    private String nombre;
    
    @Column( name="historial" )
    private String historial;
    
    @Column( name="iddueño" )
    private Integer persona;

    public Mascota(Integer id, String nombre, String historial, Integer persona) {
        this.id = id;
        this.nombre = nombre;
        this.historial = historial;
        this.persona = persona;
    }

    public Mascota() {
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
