/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.practica01.controller;

import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author casti
 */
@Controller
@RequestMapping("/arbol")
public class ArbolController {
    
    
    
    @Autowired
    private ArbolService arbolService;
    @RequestMapping("/muestra")
    public String inicio(Model model) {
        List<Arbol> lista = arbolService.getArboles(false);
        model.addAttribute("arboles", lista);
        return "/arbol/muestra";
    }
    
}
