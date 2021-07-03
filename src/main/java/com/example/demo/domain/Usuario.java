package com.example.demo.domain;

/**
 * Usuario
 */
public class Usuario {
    private String nombres;
    private String apellidos;
    private String correo;
    public String getNombres() {
        return nombres;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    
}