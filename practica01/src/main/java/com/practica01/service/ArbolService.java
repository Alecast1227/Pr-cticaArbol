/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica01.service;



import com.practica01.domain.Arbol;



import java.util.List;


public interface ArbolService {
    
    public List<Arbol> getArboles(boolean activos);
    
    public Arbol getArboles(Arbol arbol);
 
    public void save(Arbol arbol);
    
    
    public void delete(Arbol arbol);
}