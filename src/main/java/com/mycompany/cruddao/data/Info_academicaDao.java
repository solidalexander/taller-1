/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cruddao.data;

import com.mycompany.cruddao.Dominio.Info_academica;
import com.mycompany.cruddao.util.conexionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luisa Carvajal
 */
public class Info_academicaDao {   
   
    private static final String GET_INFO_ACADEMICA = "select * from info_academica";

    private static final String CREATE_INFO_ACADEMICA = "insert into info_academica (nivel_est, estado, nombre_universidad,"
            + " titulo_obt, funcionario_id) values (?,?,?,?,?)";

    private static final String GET_INFO_ACADEMICA_BY_ID = "select * from info_academica where fun_id = ?";

    private static final String UPDATE_INFO_ACADEMICA = "update info_academica set nivel_est = ?, estado = ?, "
            + "nombre_universidad = ?, titulo_obt = ? where funcionario_id = ?";

    private static final String DELETE_INFO_ACADEMICA = "delete from funcionario where inf_id = ? ";

    public void crear(Info_academica info_academica) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = conexionUtil.getConnection();
            preparedStatement = connection.prepareCall(CREATE_INFO_ACADEMICA);
            preparedStatement.setInt(1, info_academica.getNivel_est());
            preparedStatement.setInt(2, info_academica.getNivel_est());
            preparedStatement.setString(3, info_academica.getNombre_universidad());
            preparedStatement.setString(4, info_academica.getTitulo_obt());
            preparedStatement.setInt(5, info_academica.getFuncionario_id());
          
            System.out.println(info_academica.getNivel_est() );
            System.out.println(info_academica.getNivel_est());
            System.out.println(info_academica.getNombre_universidad() );
            System.out.println(info_academica.getTitulo_obt( )); 
            System.out.println(info_academica.getFuncionario_id());
            
            
            
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    
    public List<Info_academica> obtenerInfo_academicas() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Info_academica> info_academicas = new ArrayList<>();
        
        try {
            connection = conexionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_INFO_ACADEMICA);
            resultSet = preparedStatement.executeQuery();
            
            while ( resultSet.next()) {
                Info_academica info_academica = new Info_academica();
                info_academica.setInf_id(resultSet.getInt("inf_id"));
                info_academica.setNivel_est(resultSet.getInt("nivel_est"));
                info_academica.setEstado(resultSet.getInt("estado"));
                info_academica.setNombre_universidad(resultSet.getString("nombre_universidad"));
                info_academica.setTitulo_obt(resultSet.getString("titulo_obt"));
                info_academica.setFuncionario_id(resultSet.getInt("funcionario_id"));
                
                info_academicas.add(info_academica);
            }
            return info_academicas;
            
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
    
    public Info_academica obtenerInfo_academica(int inf_id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Info_academica info_academica = null;
        
        try {
            connection = conexionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_INFO_ACADEMICA_BY_ID);
            preparedStatement.setInt(1, inf_id);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
          
                info_academica  = new Info_academica();
                info_academica.setInf_id(resultSet.getInt("fun_id"));
                info_academica.setNivel_est(resultSet.getInt("nivel_est"));
                info_academica.setEstado(resultSet.getInt("estado"));
                info_academica.setNombre_universidad(resultSet.getString("nombre_universidad"));
                info_academica.setTitulo_obt(resultSet.getString("titulo_obt"));
                info_academica.setFuncionario_id(resultSet.getInt("funcionario_id"));
                
            }
            return info_academica;
            
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
    
    public void actualizarInfo_academica(int fun_id, Info_academica info_academica) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = conexionUtil.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_INFO_ACADEMICA);
            preparedStatement.setInt(1, info_academica.getNivel_est());
            preparedStatement.setInt(2, info_academica.getEstado());
            preparedStatement.setString(3, info_academica.getNombre_universidad());
            preparedStatement.setString(4, info_academica.getTitulo_obt());
            preparedStatement.setInt(5, fun_id);         
            preparedStatement.executeUpdate();
            
            System.out.println(info_academica.getNivel_est());
            System.out.println(info_academica.getEstado());
            System.out.println(info_academica.getNombre_universidad()); 
            System.out.println(info_academica.getTitulo_obt());
            System.out.println(fun_id);

        } finally {
            if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    
    public void eliminarInfo_academica(int inf_id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = conexionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_INFO_ACADEMICA);
            preparedStatement.setInt(1, inf_id);
            preparedStatement.executeUpdate();
            
        } finally {
            if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            } 
        }
    }
}

    

