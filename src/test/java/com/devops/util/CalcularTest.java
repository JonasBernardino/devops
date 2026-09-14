package com.devops.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcularTest {

    @Test
    void deveSomarDoisNumeros() {
        Calcular calc = new Calcular();
        int resultado = calc.soma(2, 3);
        assertEquals(5, resultado);
    }
}