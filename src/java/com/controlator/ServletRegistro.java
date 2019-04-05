/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlator;

import com.modelo.BeanUsuario;
import com.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "ServletRegistro", urlPatterns = {"/ServletRegistro"})
public class ServletRegistro extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");
        String correo = request.getParameter("correo");
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        
        if(!nombre.equalsIgnoreCase("") && !apellido.equalsIgnoreCase("") && !edad.equalsIgnoreCase("") &&
                !correo.equalsIgnoreCase("") && !usuario.equalsIgnoreCase("") && !clave.equalsIgnoreCase("")){
            BeanUsuario busuario = new BeanUsuario(nombre, apellido, edad, correo, usuario, clave);
            boolean sw = Usuario.agregarUsuario(busuario);
            if(sw){
                request.getRequestDispatcher("Mensajes.jsp").forward(request, response);
            }else{
                PrintWriter out = response.getWriter();
                out.println("Algo salio mal");
            }
        }
    }
}

