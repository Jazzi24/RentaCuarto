/***********************************************
 *    Autor:Pérez Hernández Jazziel.            *
 *    Fecha creación: 07 de marzo del 2022.     *
 *    Fecha actualización: 07 de marzo del 2022.*
 *    Descripción: Creacion de la clase usuario.*
 *********************************************** */
package entity;

public class Usuario extends Persona {

    private int id;
    private String codigo;
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }

    public Usuario() {
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
