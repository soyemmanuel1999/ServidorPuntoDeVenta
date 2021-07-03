package com.example.demo.domain;

public class Productos {
    private  int id;
    private  String nombre;
    private   String unidad;
    private int status;
    private int cantidad;
    private float presio;
    private String categoria;
    public int getId() {
        return id;
    }
    public float getPresio() {
        return presio;
    }
    public void setPresio(float presio) {
        this.presio = presio;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getUnidad() {
        return unidad;
    }
    public void setUnidad(String unidad) {
        this.unidad = unidad;
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
