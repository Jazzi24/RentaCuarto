/** ******************************************************************************
 *    Autor:Pérez Hernández Jazziel.                                            *
 *    Fecha creación: 17 de marzo del 2022.                                     *
 *    Fecha actualización: 17 de marzo del 2022.                                *
 *    Descripción: Creacion de EliminarUsuarioServlet.                          *
 ******************************************************************************* */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import service.IUsuarioService;
import service.UsuaServiceImpl;

public class EliminarUsuarioServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        IUsuarioService service = new UsuaServiceImpl();
        service.eliminarUsuario(id);
        response.sendRedirect("ListarUsuarioServlet");
    }
}
