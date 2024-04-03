package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro(1234,"Hábitos atomicos","James Clear",2015);

        System.out.println(libro.toString());//mostrando el libro


        Usuario usuario = new Usuario(12213,"Irvin", "irvinneric@gmai.com");
        System.out.println(usuario.toString());//mostrando el usuario


        LocalDate fechaPrestado = LocalDate.of(2024,4,2);
        LocalDate fechaDevolucion = LocalDate.of(2024,4,20);

        Prestamo prestamo = new Prestamo(1234,libro,usuario,fechaPrestado,fechaDevolucion);

        System.out.println("Dias de prestamo:       "+prestamo.calcularDiasDePrestamo());



    }
}
