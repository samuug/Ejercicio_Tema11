package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ClaseCadenaTest {

    @org.junit.jupiter.api.Test
    void devuelveIniciales(){
        assertEquals("A.D.", ClaseCadena.devuelveIniciales("Andreas Dulac"));
        assertEquals("j.h.", ClaseCadena.devuelveIniciales("jim hawkins"));
        assertEquals("", ClaseCadena.devuelveIniciales(""));
        assertEquals("", ClaseCadena.devuelveIniciales(null));
        assertEquals("D.", ClaseCadena.devuelveIniciales("DAPS"));
    }
}