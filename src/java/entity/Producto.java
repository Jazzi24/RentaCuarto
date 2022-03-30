/*************************************************
 *    Autor:Pérez Hernández Jazziel.             *
 *    Fecha creación: 07 de marzo del 2022.      *
 *    Fecha actualización: 07 de marzo del 2022. *
 *    Descripción: Creacion de la clase producto.*
 *************************************************/
package entity;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private String descripcion;

    private Producto() {

    }

    private Producto(String codigo, String nombre, double precio, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.setNombre("Coca cola");
        p1.setCodigo("147");
        p1.setPrecio(15.0);
        p1.setDescripcion("bebida");

        Producto p2 = new Producto();
        p2.setNombre("Fresca");
        p2.setCodigo("258");
        p2.setPrecio(13.0);
        p2.setDescripcion("bebida");

        Producto p3 = new Producto();
        p3.setNombre("Agua");
        p3.setCodigo("369");
        p3.setPrecio(13.0);
        p3.setDescripcion("bebida");

        List<Producto> lista = new ArrayList<Producto>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Producto i : lista) {

            System.out.println("Nombre: " + i.getNombre());
            System.out.println("Codigo: " + i.getCodigo());
            System.out.println("Precio: " + i.getPrecio());
            System.out.println("Descripcion: " + i.getDescripcion());
            System.out.println();
        }

        Usuario u1 = new Usuario("Juan","Hombre",26);
        u1.setCodigo("789");
        u1.setNombreUsuario("Administrador");
        u1.setContraseña("789");
        Usuario u2 = new Usuario("Maria","Mujer",23);
        u2.setCodigo("456");
        u2.setNombreUsuario("Vendedor");
        u2.setContraseña("456"); 
        Usuario u3 = new Usuario("Panfilo","Hombre",22);
        u3.setCodigo("123");
        u3.setNombreUsuario("Vendedor");
        u3.setContraseña("123"); 
        
        List <Usuario> lista1 = new ArrayList<>();
        lista1.add(u1);
        lista1.add(u2);
        lista1.add(u3);
        
        
        for (Usuario e : lista1) {
            System.out.println("Codigo: "+e.getCodigo());
            System.out.println("Nombre: "+e.getNombre());
            System.out.println("sexo: "+e.getSexo());
            System.out.println("edad: "+e.getEdad());
            System.out.println("Nombre del usuario: "+e.getNombreUsuario());
            System.out.println("contraseña: "+e.getContraseña());
            System.out.println();
            
        }
    }
}
