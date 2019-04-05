/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.conex.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jms.Connection;



/**
 *
 * @author user
 */
public class Usuario {
    public static boolean agregarUsuario(BeanUsuario usuario){
        boolean agregado = false;
        
        try{
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if(con!=null){
                Statement st;
                st.executeUpdate("INSERT INTO usuario VALUES('"+usuario.getNombre()+"','"+usuario.getApellido()+"','"
                +usuario.getEdad()+"','"+usuario.getCorreo()+"','"+usuario.getUsuario()+"','"+usuario.getClave()+"')");
                agregado = true;
                st.close();
            }
            c.cerrarConexion();
        } catch (SQLException e){
          agregado = false;
          e.printStackTrace();
        }
        return agregado;
    }
    
}
