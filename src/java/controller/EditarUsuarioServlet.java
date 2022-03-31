/** ******************************************************************************
 *    Autor:Fernando Lopez Salvador.                                            *
 *    Fecha creación: 17 de marzo del 2022.                                     *
 *    Fecha actualización: 17 de marzo del 2022.                                *
 *    Descripción: Creacion de EditarUsuarioServlet.                            *
 ******************************************************************************* */
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

public class EditarUsuarioServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int idUsuario = Integer.parseInt(request.getParameter("id"));

        IUsuarioService service = new UsuaServiceImpl();
        Usuario usuario = new Usuario();
        usuario = service.obtenerRegistro(idUsuario);

        out.println("<!!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/resources/css/GuardarEditar.css'>");
        out.println("<script src='" + request.getContextPath() + "/resources/JavaScrip/scrip.js'></script>");
        out.println("</head>");
        out.println("<body>");
        
        
        //out.println("<div class=\"heard\">");
            out.println(" <link href='//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css' rel='stylesheet'/>");
                 out.println(" <div class=\"menuicon\">");
                    out.println("<a href=\"/Renta_Cuartos1/pages\">");
                 out.println("<div class=\"fa fa-home\"></div>");
            out.println("<div class=\"title\">Home</div>");
        out.println("</a>");
        out.println("</div>");
        
        
        
        out.println("<section class=\"container\">");
        out.println("<form action='GuardarEditorUsuarioServlet' method=\"GET\">");
        out.println("<fieldset class=\"p\">");
        out.println("<legend class=\"cen\">Actualizar usuario</legend>");
        out.println("<input type=\"hidden\" name=\"idUsuario\" value=\"" + usuario.getId() + "\">");
        out.println("<label for=\"lnombre\">Nombre:</label><br>");
        out.println("<input type=\"text\" id=\"name\" name=\"nombre\" value=\"" + usuario.getNombre() + "\"><br><br>");
        out.println("<label for=\"lSexo\">Sexo:</label><br>");
        out.println("<input type=\"text\" id=\"sexo\" name=\"sexo\" value=\"" + usuario.getSexo() + "\"><br><br>");
        out.println("<label for=\"ledad\">Edad:</label><br>");
        out.println("<input type=\"text\" id=\"edad\" name=\"edad\" value=\"" + usuario.getEdad() + "\"><br><br>");
        out.println("<label for=\"lcodigo\">Codigo:</label><br>");
        out.println("<input type=\"text\" id=\"codigo\" name=\"codigo\" value=\"" + usuario.getCodigo() + "\"><br><br>");
        out.println("<label for=\"ledad\">Nombre Usuario:</label><br>");
        out.println("<input type=\"text\" id=\"nameUsuario\" name=\"nameUsuario\" value=\"" + usuario.getNombreUsuario() + "\"><br><br>");
        out.println("<label for=\"lcontraseña\">Contraseña:</label><br>");
        out.println("<input type=\"text\" id=\"contraseña\" name=\"contraseña\" value=\"" + usuario.getContraseña() + "\"><br><br>");
        out.println("<input type=\"submit\" value=\"Actualizar\">");

        out.println("</fieldset>");
        out.println("<form>");
        out.println("</section>");
        out.println("</body>");
        out.println("</html>");
    }

    
    
}
