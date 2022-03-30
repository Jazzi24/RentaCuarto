/********************************************************************************
 *    Autor:Pérez Hernández Jazziel.                                            *
 *    Fecha creación: 16 de marzo del 2022.                                     *
 *    Fecha actualización: 16 de marzo del 2022.                                *
 *    Descripción: Creacion de la interface IUsuarioService.                    *
 ********************************************************************************/
package service;

import entity.*;
import java.util.*;

public interface IUsuarioService {

    public void crearRegistro(Usuario usuario);

    public void actualizarRegistro(Usuario usuario);

    public List<Usuario> obtenerRegistros();

    public Usuario obtenerRegistro(int idUsuario);

    public void eliminarUsuario(int idUsuario);
}
