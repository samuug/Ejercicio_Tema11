package org.example;

public class ClaseCadena {

    public static String devuelveIniciales(String nombre){
        if (nombre == null || nombre.isEmpty()) {
            return "";
        }
        String[] palabras = nombre.split(" ");
        String iniciales = "";
        for (String palabra : palabras) {
            iniciales += palabra.charAt(0)+".";
        }
        return iniciales;
    }


}
