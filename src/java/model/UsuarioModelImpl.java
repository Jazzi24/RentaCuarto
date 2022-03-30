/*********************************************************************************************************************
 *  Autor:Pérez Hernández Jazziel.                                                                                   *
 *  Fecha creación: 11 de marzo del 2022.                                                                            *
 *  Fecha actualización: 14 de marzo del 2022.                                                                       *
 *  Descripción: Implementacion de los metodos obtenerRegistro,obtenerRegistros,actualizarRegistro,eliminarUsuario.  *              
 *********************************************************************************************************************/
package model;

import bd.*;
import entity.*;
import java.sql.*;
import java.util.*;

public class UsuarioModelImpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "INSERT INTO usuario (codigo,nombreusuario,contraseña,nombre,sexo,edad) VALUES(?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getCodigo());
            statement.setString(2, usuario.getNombreUsuario());
            statement.setString(3, usuario.getContraseña());
            statement.setString(4, usuario.getNombre());
            statement.setString(5, usuario.getSexo());
            statement.setInt(6, usuario.getEdad());
            statement.execute();
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println("error de " + e);
        }
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "UPDATE usuario SET codigo=?,nombreusuario=?,contraseña=?,nombre=?,sexo=?,edad=? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getCodigo());
            statement.setString(2, usuario.getNombreUsuario());
            statement.setString(3, usuario.getContraseña());
            statement.setString(4, usuario.getNombre());
            statement.setString(5, usuario.getSexo());
            statement.setInt(6, usuario.getEdad());
            statement.setInt(7, usuario.getId());
            statement.execute();
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error en " + e);
        }
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> lista1 = new ArrayList<Usuario>();
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "Select * from usuario;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setCodigo(rs.getString(1));
                u.setNombreUsuario(rs.getString(2));
                u.setContraseña(rs.getString(3));
                u.setNombre(rs.getString(4));
                u.setSexo(rs.getString(5));
                u.setEdad(rs.getInt(6));
                u.setId(rs.getInt(7));
                lista1.add(u);
            }
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error en: " + e);
        }

        return lista1;
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        Usuario u1Usuario = new Usuario();
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "Select * from usuario where id =?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idUsuario);
            statement.executeQuery();
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                u1Usuario.setCodigo(rs.getString(1));
                u1Usuario.setNombreUsuario(rs.getString(2));
                u1Usuario.setContraseña(rs.getString(3));
                u1Usuario.setNombre(rs.getString(4));
                u1Usuario.setSexo(rs.getString(5));
                u1Usuario.setEdad(rs.getInt(6));
                u1Usuario.setId(rs.getInt(7));
            }
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error en: " + e);
        }

        return u1Usuario;
    }

    @Override
    public void eliminarUsuario(int idUsuario) {
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "DELETE FROM usuario where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idUsuario);
            statement.execute();
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error en: " + e);
        }
    }
}
