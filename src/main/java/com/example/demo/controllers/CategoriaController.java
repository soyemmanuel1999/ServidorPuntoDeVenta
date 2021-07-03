package com.example.demo.controllers;

import java.util.List;

import com.example.demo.domain.Categorias;
import com.example.demo.mapppers.CategoriaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired

    CategoriaMapper categoriamapper;
    @GetMapping("/listar")
    public List<Categorias> ListarCategoria(){
        return categoriamapper.ListarCategoria();
    }
    @PostMapping("/nuevo")
    public boolean nuevo(@RequestParam String nombre){
        categoriamapper.Nuevo(nombre);
	return true;
    }
    @GetMapping("/editar")
    public Integer editar(@RequestParam(name = "id") int id,@RequestParam(name = "nombre") String nombre,@RequestParam(name = "status") int status ){
        return categoriamapper.editar(id, nombre,status);
    }
    //revisar este
    @GetMapping("/borrar")
    public Integer borrar(@RequestParam(name = "id") int id){
        return categoriamapper.borrar(id);
    }
}
