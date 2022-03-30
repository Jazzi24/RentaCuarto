/********************************************************************************
 *    Autor:Pérez Hernández Jazziel.                                            *
 *    Fecha creación: 15 de marzo del 2022.                                     *
 *    Fecha actualización: 23 de marzo del 2022.                                *
 *    Descripción: Terminación del metodo doGet.                                *
 ********************************************************************************/
package controller;

import entity.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import service.IUsuarioService;
import service.UsuaServiceImpl;

public class ListarUsuarioServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/resources/css/tabla.css'>");
        out.println("<script src='" + request.getContextPath() + "/resources/JavaScrip/scrip.js'></script>");
        out.println("</head>");
        out.println("<body>");

        out.println("<section class='container'>");
        out.println("<div style='text-align:center;'>");
        out.println("<table  class=\\\"container\\\" border='2' align='center'>");
        out.println("<caption>Tabla de Usuarios</caption>");
        out.println("<tr>");
        out.println("<th>Id</th>");
        out.println("<th>Codigo</th>");
        out.println("<th>NombreUsuario</th>");
        out.println("<th>Contraseña</th>");
        out.println("<th>Nombre</th>");
        out.println("<th>Edad</th>");
        out.println("<th>Sexo</th>");
        out.println("<th>Editar</th>");
        out.println("<th>Eliminar</th>");
        out.println("</tr>");

        IUsuarioService service = new UsuaServiceImpl();
        List<Usuario> listaUsuarios = service.obtenerRegistros();
        out.println("<tbody>");
        for (Usuario usuario : listaUsuarios) {
            out.println("<tr>");
            out.println("<td>" + usuario.getId() + "</td>");
            out.println("<td>" + usuario.getCodigo() + "</td>");
            out.println("<td>" + usuario.getNombreUsuario() + "</td>");
            out.println("<td>" + usuario.getContraseña() + "</td>");
            out.println("<td>" + usuario.getNombre() + "</td>");
            out.println("<td>" + usuario.getEdad() + "</td>");
            out.println("<td>" + usuario.getSexo() + "</td>");
            out.println("<td><a href='EditarUsuarioServlet?id=" + usuario.getId() + "'>Editar</a></td>");
            out.println("<td><a href='EliminarUsuarioServlet?id=" + usuario.getId() + "' onclick=\"return confirm('Desea eliminar el registro')\">Eliminar</a></td>");
            out.println("</tr>");
        }
        out.println("</section>");
        out.println("</tbody>");
        out.println("</div>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

}
