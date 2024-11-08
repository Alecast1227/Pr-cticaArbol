package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario") 
    private long idUsuario;

    @Column(name = "nombre_usuario", nullable = false)
    private String nombreUsuario;

    @Column(name = "correo_usuario", unique = true, nullable = false)
    private String correoUsuario;

    @Column(name = "contrasena_usuario", nullable = false)
    private String contrasenaUsuario;

    @Column(name = "rol_usuario", nullable = false)
    @Enumerated(EnumType.STRING) 
    private RolUsuario rolUsuario;

    
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(String nombreUsuario, String correoUsuario, String contrasenaUsuario, RolUsuario rolUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.rolUsuario = rolUsuario;
    }

    // Enum para los roles de usuario
    public enum RolUsuario {
        USUARIO, ADMIN
    }
}