package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.mapppers.UsuarioMapper;
import java.util.List;
import com.example.demo.domain.Usuario;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioMapper usuariomapper;
    
    @GetMapping("/listar")
    public List<Usuario> listarUsuario(){
     
        return usuariomapper.listarUsuario() ;
    }
    @PostMapping("/login")
    public boolean login(
      
        @RequestParam String correo, 
         @RequestParam String contrasena){
         
            Usuario user= usuariomapper.login(correo, contrasena);
         boolean ok = false;
         System.out.println(correo);
         if(user!=null){
             
             ok=true;
             System.out.println("LOGIN EXITOSO");
         }else{
             System.out.println("USUARIO O CONTRASEÑA INCORRECTO");
         }
         return ok;       
     }

     @PostMapping("/nuevo")
     public boolean registro(
     @RequestParam String nombres,
     @RequestParam String apellidos,
     @RequestParam String correo,
     @RequestParam String contrasena    
     ){
     
                    usuariomapper.registro(nombres, apellidos, correo, contrasena);
                 System.out.println("Dato insertado \n");
                 return true;
     }
     
}
