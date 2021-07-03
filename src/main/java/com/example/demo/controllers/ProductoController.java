package com.example.demo.controllers;

import java.util.List;

import com.example.demo.domain.Productos;
import com.example.demo.mapppers.ProductoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {
     
    @Autowired
    ProductoMapper productomapper;
    @GetMapping("/listar")
   public List<Productos> ListarProducto(){
            return productomapper.ListarProducto();
   }
   @PostMapping("/nuevo")
    public void nuevo(@RequestParam String nombre,
    @RequestParam String unidad,
    @RequestParam int cantidad,
    @RequestParam float presio,
    @RequestParam int idcategoria){
        productomapper.Nuevo(nombre, unidad, cantidad, presio, idcategoria);
    }
    @GetMapping("/editar")
    public Integer editar(
        @RequestParam(name = "id") int id,
        @RequestParam(name = "nombre") String nombre,
        @RequestParam(name = "unidad") String unidad,
        @RequestParam(name = "status") int status,
        @RequestParam(name = "cantidad") int cantidad,
        @RequestParam(name = "presio") float presio,
        @RequestParam(name = "idcategoria") int idcategoria){
        return productomapper.editar(id, nombre, unidad, status, cantidad, presio, idcategoria);
    }
    //revisar este
    @GetMapping("/borrar")
    public Integer borrar(@RequestParam(name = "id") int id){
        return productomapper.borrar(id);
    }


    
    
}
