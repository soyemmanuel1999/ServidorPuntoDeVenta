package com.example.demo.domain;

import java.sql.Date;

public class Historial {
    public String nombre;
    public String productos;
    public  Date fecha;
    public float total;
    public int idusuario;


    public int getIdusuario() {
        return this.idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProductos() {
        return this.productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
