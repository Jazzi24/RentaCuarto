/** ***************************************************
 *    Autor:Pérez Hernández Jazziel.                  *
 *    Fecha creación: 11 de marzo del 2022.           *
 *    Fecha actualización: 11 de marzo del 2022.      *
 *    Descripción: Creacion de la interface IUsuario. *
 ***************************************************** */
package model;

import entity.Usuario;
import java.util.List;

public interface IUsuarioModel {

    public void crearRegistro(Usuario usuario);

    public void actualizarRegistro(Usuario usuario);

    public List<Usuario> obtenerRegistros();

    public Usuario obtenerRegistro(int idUsuario);

    public void eliminarUsuario(int idUsuario);
}
