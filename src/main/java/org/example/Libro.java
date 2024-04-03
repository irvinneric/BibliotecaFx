package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(int id, String titulo, String autor, int anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //Metodo

    @Override
    public String toString() {
        return "ID: " + id + "\nTITULO: " + titulo + "\nAUTOR: " + autor + "\nAnio: " + anioPublicacion;
    }
}
