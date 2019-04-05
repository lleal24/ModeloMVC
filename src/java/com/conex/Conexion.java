package com.conex;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Conexion {
    private Connection con = null;
    
    public Conexion() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","");            
        }catch(InstantiationException | IllegalAccessException | ClassNotFoundException e){
            e.printStackTrace();          
        }
    }
    public Connection getConexion(){
        return con;
    }
    public void cerrarConexion(){
        try{
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
