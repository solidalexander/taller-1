/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cruddao.control;


import com.mycompany.cruddao.Dominio.Info_academica;
import com.mycompany.cruddao.data.Info_academicaDao;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Luisa Carvajal
 */
public class info_academicaControl {    
       private final Info_academicaDao info_academicaDao ;
    
    public info_academicaControl() {
        info_academicaDao = new Info_academicaDao();
    }
    
    public void crear(Info_academica info_academica) throws SQLException {
        info_academicaDao.crear(info_academica);
    }
    
    public List<Info_academica> obtenerInfo_academicas() throws SQLException {
        return info_academicaDao.obtenerInfo_academicas();
    }
    
    public Info_academica obtenerInfo_academica(int inf_id) throws SQLException {
        return info_academicaDao.obtenerInfo_academica(inf_id);
    }
    
    public void actualizarInfo_academica(int inf_id, Info_academica info_academica) throws SQLException {
        info_academicaDao.actualizarInfo_academica(inf_id, info_academica);
    }
    
    public void eliminarInfo_academica(int inf_id) throws SQLException {
        info_academicaDao.eliminarInfo_academica(inf_id);
    }
}

    

