package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre, profesion y nacionalidad: ");
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        String [] fragmentos = entrada.split(" ");
        String Nombre = fragmentos [0];
        String Profesion = fragmentos [1];
        String Nacionalidad = fragmentos [2];
        System.out.println("Nombre: " +Nombre.toUpperCase());
        System.out.println("Profesion: "+ Profesion.toUpperCase());
        System.out.println("Nacionalidad: "+ Nacionalidad.toUpperCase());

    }
}