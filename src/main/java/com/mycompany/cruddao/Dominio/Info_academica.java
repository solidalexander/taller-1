/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cruddao.Dominio;

/**
 *
 * @author Luisa Carvajal
 */
public class Info_academica {
    
     private int inf_id;
     private int nivel_est;
     private int estado;
     private String nombre_universidad;
     private String titulo_obt;
     private int funcionario_id;  

    public int getInf_id() {
        return inf_id;
    }

    public void setInf_id(int inf_id) {
        this.inf_id = inf_id;
    }

    public int getNivel_est() {
        return nivel_est;
    }

    public void setNivel_est(int nivel_est) {
        this.nivel_est = nivel_est;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre_universidad() {
        return nombre_universidad;
    }

    public void setNombre_universidad(String nombre_universidad) {
        this.nombre_universidad = nombre_universidad;
    }

    public String getTitulo_obt() {
        return titulo_obt;
    }

    public void setTitulo_obt(String titulo_obt) {
        this.titulo_obt = titulo_obt;
    }

    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    @Override
    public String toString() {
        return "Info_academica{" + "inf_id=" + inf_id + ", nivel_est=" + nivel_est + ", estado=" + estado + ", funcionario_id=" + funcionario_id + '}';
    }
         
    
}
