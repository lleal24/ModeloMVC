/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

/**
 *
 * @author user
 */
public class BeanUsuario {
    private String nombre;
    private String apellido;
    private String edad;
    private String correo;
    private String usuario;
    private String clave;
    
    public BeanUsuario(String nombre, String apellido, String edad, String correo, String usuario, String clave){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
    }

    public BeanUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNombre() { return nombre; }
    public void setNombre (String nombre){ this.nombre = nombre; }
    
    
    public String getApellido () { return apellido; }
    public void setApellido (String apellido) { this.apellido = apellido;}
    
    public String getEdad () { return edad; }
    public void setEdad (String edad) { this.edad = edad;}
    
    public String getCorreo () { return correo; }
    public void setCorreo (String correo) { this.correo = correo;}
    
    public String getUsuario () { return usuario; }
    public void setUsuario (String usuario) { this.usuario = usuario;}
    
    public String getClave () { return clave; }
    public void setClave (String clave) { this.clave = clave;}
    
    
}
