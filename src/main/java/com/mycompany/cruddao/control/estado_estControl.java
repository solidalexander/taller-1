/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cruddao.control;

import com.mycompany.cruddao.Dominio.Estado_est;
import com.mycompany.cruddao.data.Estado_estDao;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Luisa Carvajal
 */
public class estado_estControl {
    Estado_estDao estado_estDao;
    
    public estado_estControl() {
        estado_estDao = new Estado_estDao();
    }
    
    
    public List<Estado_est> obtenerEstado_ests() throws SQLException {
        return estado_estDao.obtenerestado_est();
    }
    
    public Estado_est obtenerSexo(int id) throws SQLException {
        return estado_estDao.obtenerEstado_est(id);
    }
    
 }  

