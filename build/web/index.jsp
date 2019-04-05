<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>JS Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>FORMULARIO REGISTRO</h1>
        <form action="ServletRegistro" method="POST">
            <table border="1">
                <thead>
                    <tr> <th colspan="2">REGISTRO</th> </tr>
                </thead>
                <tbody>
                    <tr> <td>NOMBRE</td> <td><input type="text" name="nombre" value=""/></td> </tr>
                    <tr> <td>APELLIDO</td> <td><input type="text" name="apellido" value=""/></td> </tr>
                    <tr> <td>EDAD</td> <td><input type="text" name="edad" value=""/></td> </tr>
                    <tr> <td>CORREO</td> <td><input type="text" name="correo" value=""/></td> </tr>
                    <tr> <td>USUARIO</td> <td><input type="text" name="usuario" value=""/></td> </tr>
                    <tr> <td>CLAVE</td> <td><input type="password" name="clave" value=""/></td> </tr>
                    <tr> <td colspan="2" align="center"><input type="submit" value="REGISTRAR"/></td> </tr>
                </tbody>                
            </table>
        </form>
    </body>
</html>
