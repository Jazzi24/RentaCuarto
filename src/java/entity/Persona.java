/** **********************************************
 *    Autor:Pérez Hernández Jazziel.            *
 *    Fecha creación: 07 de marzo del 2022.     *
 *    Fecha actualización: 07 de marzo del 2022.*
 *    Descripción: Creacion de la clase persona.*
 *********************************************** */
package entity;

public abstract class Persona {

    String nombre;
    private String sexo;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

}
