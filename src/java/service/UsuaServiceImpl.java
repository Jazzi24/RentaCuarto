/** **********************************************************************************
 *    Autor:Pérez Hernández Jazziel.                                                 *
 *    Fecha creación: 16 de marzo del 2022.                                          *
 *    Fecha actualización: 16 de marzo del 2022.                                     *
 *    Descripción: Creacion de la UsuaServiceImpl que implements de IUsuarioService. *
 *************************************************************************************/
package service;

import entity.Usuario;
import java.util.List;
import model.IUsuarioModel;
import model.UsuarioModelImpl;

public class UsuaServiceImpl implements IUsuarioService {

    IUsuarioModel modelo = new UsuarioModelImpl();

    @Override
    public void crearRegistro(Usuario usuario) {
        modelo.crearRegistro(usuario);
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        modelo.actualizarRegistro(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return modelo.obtenerRegistros();
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        return modelo.obtenerRegistro(idUsuario);
    }

    @Override
    public void eliminarUsuario(int idUsuario) {
        modelo.eliminarUsuario(idUsuario);
    }
}
