/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cruddao.data;

import com.mycompany.cruddao.util.conexionUtil;
import com.mycompany.cruddao.Dominio.Nivel_est;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Luisa Carvajal
 */
public class Nivel_estDao {
    private static final String GET_NIVEL_EST = "select * from nivel_estudio";
    private static final String GET_NIVEL_EST_BY_ID = "select * from nivel_estudio where nivel_id = ?";
    
    
    public List<Nivel_est> obtenernivel_est() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Nivel_est> nivel_ests = new ArrayList<>();
        
        try {
            connection = conexionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_NIVEL_EST);
            resultSet = preparedStatement.executeQuery();
            
            while ( resultSet.next()) {
                Nivel_est nivel_est = new Nivel_est();
                nivel_est.setNivel_id(resultSet.getInt("nivel_id"));
                nivel_est.setNivel(resultSet.getString("nivel_estudio"));
                
                nivel_ests.add(nivel_est);
            }
            return nivel_ests;
            
        } finally {
            if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            
            if (resultSet != null) {
                resultSet.close();
            }
        }
    }

public Nivel_est obtenerNivel_est(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Nivel_est nivel_est = null;
        
        try {
            connection = conexionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_NIVEL_EST_BY_ID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
          
                nivel_est  = new Nivel_est();
                nivel_est.setNivel_id(resultSet.getInt("nivel_id"));
                nivel_est.setNivel(resultSet.getString("nivel"));
               
            }
            return nivel_est;
            
        } finally {
            if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            
            if (resultSet != null) {
                resultSet.close();
            }
        }
    }
}





