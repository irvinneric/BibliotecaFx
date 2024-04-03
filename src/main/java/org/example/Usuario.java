package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private int id;
    private String nombre;
    private String correo;

    public Usuario(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public java.lang.String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nCorreo:" + correo;
    }
}
