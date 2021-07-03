package com.example.demo.domain;

public class Categorias {
    private int id;
    private String  nombre;
    private int status;
    public int getId() {
        return id;
    }
   
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }

}
