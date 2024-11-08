/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.domain.Usuario;
import java.util.List;

public interface usuarioService {
    // Obtener todos los usuarios
    public List<Usuario> getUsuarios();
    
    // Obtener un usuario por su id
    public Usuario getUsuario(Usuario usuario);
    
    // Guardar o actualizar un usuario
    public void save(Usuario usuario);
    
    // Eliminar un usuario
    public void delete(Usuario usuario);
    
    Usuario obtenerUsuarioLogueado();
}
    
    

    
  
