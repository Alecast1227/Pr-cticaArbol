/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable{
  private static final long serialVersionUID =1L;
  
           @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private Long idArbol;

    @Column(name = "nombre_comun") 
    private String nombre;

    @Column(name = "tipo_flor")     
    private String tipoFlor;

    @Column(name = "dureza_madera") 
    private String dureza;

    @Column(name = "ruta_imagen")   
    private String rutaImagen;

    private boolean activo;
    public Arbol() {
    }

    public Arbol(String nombre, String tipo_flor, String dureza, String ruta_imagen, boolean activo) {
        this.nombre = nombre;
        this.tipoFlor = tipo_flor;
        this.dureza = dureza;
        this.rutaImagen = ruta_imagen;
        this.activo = activo;
    }

    
          
          
}
