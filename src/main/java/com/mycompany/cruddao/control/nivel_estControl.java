/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cruddao.control;

import com.mycompany.cruddao.Dominio.Nivel_est;
import com.mycompany.cruddao.data.Nivel_estDao;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Luisa Carvajal
 */
public class nivel_estControl {
    Nivel_estDao nivel_estDao;
    
    public nivel_estControl() {
        nivel_estDao = new Nivel_estDao();
    }
    
    
    public List<Nivel_est> obtenerNivel_ests() throws SQLException {
        return nivel_estDao.obtenernivel_est();
    }
    
    public Nivel_est obtenerNivel(int id) throws SQLException {
        return nivel_estDao.obtenerNivel_est(id);
    }
    
 }