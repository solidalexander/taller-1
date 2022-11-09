/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cruddao.data;

import com.mycompany.cruddao.util.conexionUtil;
import com.mycompany.cruddao.Dominio.Estado_est;
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
public class Estado_estDao {
    
     private static final String GET_ESTADO_EST = "select * from estado_estudio";
    private static final String GET_ESTADO_EST_BY_ID = "select * from sexo where estado_id = ?";
    
    
    public List<Estado_est> obtenerestado_est() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Estado_est> estado_ests = new ArrayList<>();
        
        try {
            connection = conexionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_ESTADO_EST);
            resultSet = preparedStatement.executeQuery();
            
            while ( resultSet.next()) {
                Estado_est estado_est = new Estado_est();
                estado_est.setEstado_id(resultSet.getInt("estado_id"));
                estado_est.setEstado(resultSet.getString("estado_est"));
                
                estado_ests.add(estado_est);
            }
            return estado_ests;
            
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

public Estado_est obtenerEstado_est(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Estado_est estado_est = null;
        
        try {
            connection = conexionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_ESTADO_EST_BY_ID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
          
                estado_est  = new Estado_est();
                estado_est.setEstado_id(resultSet.getInt("estado_id"));
                estado_est.setEstado(resultSet.getString("estado"));
               
            }
            return estado_est;
            
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




    

