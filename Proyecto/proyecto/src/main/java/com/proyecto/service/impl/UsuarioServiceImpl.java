package com.proyecto.service.impl;

import com.proyecto.dao.UsuarioDao;
import com.proyecto.domain.Usuario;
import com.proyecto.service.usuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements usuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> getUsuarios() {
        // Usamos directamente el JpaRepository para obtener la lista de usuarios
        return usuarioDao.findAll();
    }
    
  @Override
@Transactional(readOnly = true)
public Usuario getUsuario(Usuario usuario) {
    // Aquí se pasa el id del usuario directamente
    return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
}
    
    @Override
    @Transactional
    public void save(Usuario usuario) {
        // JpaRepository maneja el guardado o actualización
        usuarioDao.save(usuario);
    }
    
    @Override
    @Transactional
    public void delete(Usuario usuario) {
        // JpaRepository maneja la eliminación
        usuarioDao.delete(usuario);
    }
    
    
    @Override
    public Usuario obtenerUsuarioLogueado() {
        // Obtener el usuario logueado del contexto de seguridad
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            // Suponiendo que el usuario está almacenado en el objeto Authentication como un principal
            return (Usuario) authentication.getPrincipal();
        }
        return null;  // Si no hay usuario autenticado
    }
}
