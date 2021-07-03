package com.example.demo.mapppers;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;
import com.example.demo.domain.Usuario;

/**
 * UsuarioMapper
 */
@Mapper
public interface UsuarioMapper {
    
   @Select("SELECT * FROM usuarios" )
   public List<Usuario> listarUsuario();

   @Select("SELECT id,nombres,apellidos FROM usuarios WHERE correo=#{correo} AND contrasena=#{contrasena}")
   public Usuario login (
       @Param("correo") String correo, 
       @Param("contrasena") String contrasena
   );
   @Insert("INSERT INTO usuarios(nombres, apellidos,correo,contrasena)VALUES (#{nombres},#{apellidos},#{correo},#{contrasena})")
   public void registro( 
       @Param("nombres") String nombres,
       @Param("apellidos") String apellidos,
       @Param("correo") String correo,
       @Param("contrasena") String contrasena
       );
   
    

}