package com.example.demo.mapppers;

import java.sql.Date;
import java.util.List;

import com.example.demo.domain.Historial;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HistorialMapper {
    @Select("select*from historial1")
    public List<Historial> listarHistorial();
    @Insert("INSERT into historial1(idusuario,productos,total,fecha)values(#{idusuario},#{productos},#{total},#{fecha})")
    public void nuevo(
        @Param("idusuario") int idusuario,
        @Param("productos") String productos,
        @Param("total") float total,
        @Param("fecha") Date fecha );
}
