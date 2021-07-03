package com.example.demo.controllers;


import java.sql.Date;
import java.util.List;

import com.example.demo.domain.Historial;
import com.example.demo.mapppers.HistorialMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historial")
public class HistorialController {
    @Autowired
    HistorialMapper historial;
    @GetMapping("/listar")
   public List<Historial> ListarHistorial(){
            return historial.listarHistorial();
   }
   @PostMapping("/nuevo")
   public void nuevo(
   @RequestParam int idusuario,
   @RequestParam String productos,
   @RequestParam float total,
   @RequestParam Date fecha){
       historial.nuevo(idusuario, productos, total, fecha);
   }
}
