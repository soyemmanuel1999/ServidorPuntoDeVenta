package com.example.demo.mapppers;

import java.util.List;

import com.example.demo.domain.Productos;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ProductoMapper {
    @Select("SELECT p.id,p.nombre,p.unidad,p.status,p.cantidad,p.presio,c.nombre  AS categoria FROM categorias AS c , productos AS p WHERE p.idcategoria=c.id")
    public List<Productos> ListarProducto();
    
    @Insert("INSERT INTO productos(nombre,unidad,cantidad,presio,idcategoria)VALUES(#{nombre},#{unidad},#{cantidad},#{presio},#{idcategoria})")
    public void  Nuevo(
        @Param("nombre") String nombre,
        @Param("unidad") String unidad, 
        @Param("cantidad") int cantidad, 
        @Param("presio") float presio, 
        @Param("idcategoria") int idcategoria 
        
    );
    @Update("UPDATE productos set nombre = #{nombre},unidad=#{unidad},status = #{status},cantidad=#{cantidad},presio=#{presio},idcategoria=#{idcategoria} WHERE id=#{id}")
        public Integer editar(int id, 
        String nombre,
        String unidad,
        int status,
        int cantidad,
        float presio,
        int idcategoria);

        
 @Delete("DELETE FROM productos WHERE id=#{id}")
        public Integer borrar(int id);
}
