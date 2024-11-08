package com.proyecto.controller;

import com.proyecto.domain.Usuario;
import com.proyecto.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

  @Autowired
    private usuarioService usuarioService;

    @GetMapping("/")
    public String mostrarIndex() {
        return "index";
    }

    @GetMapping("/login")
    public String mostrarLogin() {
        return "Usuario/login"; 
    }

    @GetMapping("/registro")
    public String mostrarRegistro() {
        return "Usuario/registro";  
    }

    @GetMapping("/actualizar")
    public String mostrarActualizarDatos(Model model) {
        Usuario usuario = usuarioService.obtenerUsuarioLogueado(); 
        if (usuario != null) {
            model.addAttribute("usuario", usuario);
            return "Usuario/actualizar";  
        } else {
            return "redirect:/login";  
        }
    }
}