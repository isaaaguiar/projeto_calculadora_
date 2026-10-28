package test.calculadora;

import calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteCalculadora {

    Calculadora calculadora = new Calculadora();

    @Test
    public void testarSoma() {
        assertEquals(15, calculadora.calc(10, 5, "+"));
    }

    @Test
    public void testarSubtracao() {
        assertEquals(5, calculadora.calc(10, 5, "-"));
    }

    @Test
    public void testarMultiplicacao() {
        assertEquals(50, calculadora.calc(10, 5, "*"));
    }

    @Test
    public void testarDivisao() {
        assertEquals(2, calculadora.calc(10, 5, "/"));
    }

    @Test
    public void testarDivisaoPorZero() {
        assertEquals(0, calculadora.calc(10, 0, "/"));
    }

    @Test
    public void testarOperacaoInvalida() {
        assertEquals(0, calculadora.calc(10, 5, "%"));
    }
}