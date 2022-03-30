/********************************************************************************
 *    Autor:Pérez Hernández Jazziel.                                            *
 *    Fecha creación: 17 de marzo del 2022.                                     *
 *    Fecha actualización: 26 de marzo del 2022.                                *
 *    Descripción: Implementacion en el metodo doPost.                          *
 ********************************************************************************/
package controller;

import entity.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import service.IUsuarioService;
import service.UsuaServiceImpl;

public class GuardarCrearUsuarioServlet extends HttpServlet {


    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IUsuarioService service = new UsuaServiceImpl();
        Usuario usuario = new Usuario();
        usuario.setNombre(request.getParameter("nombre"));
        int edad = Integer.parseInt(request.getParameter("edad"));
        usuario.setSexo(request.getParameter("sexo"));
        usuario.setEdad(edad);
        usuario.setCodigo(request.getParameter("codigo"));
        usuario.setNombreUsuario(request.getParameter("nameUsuario"));
        usuario.setContraseña(request.getParameter("contraseña"));
        service.crearRegistro(usuario);
        response.sendRedirect("ListarUsuarioServlet");
    }
    
}
