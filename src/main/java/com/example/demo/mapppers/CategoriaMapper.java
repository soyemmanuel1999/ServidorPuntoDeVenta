package com.example.demo.mapppers;

import java.util.List;

import com.example.demo.domain.Categorias;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * CategoriaMapper
 */
@Mapper
public interface CategoriaMapper {
    @Select("SELECT id, nombre,status FROM categorias")
    public List<Categorias> ListarCategoria();
    
    @Insert("INSERT INTO categorias(nombre)VALUES(#{nombre})")
    public void  Nuevo(
        @Param("nombre") String nombre
    );
    @Update("update categorias set nombre = #{nombre},status = #{status} WHERE id=#{id}")
        public Integer editar(int id, String nombre,int status);

        
 @Delete("DELETE FROM categorias WHERE id=#{id}")
        public Integer borrar(int id);
    
}