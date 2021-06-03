import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculosBisTest {

    @Test
    void factorial() {
        // Fase 1: Preparacion de los datos
        CalculosBis calculosBis = new CalculosBis();

        // Fase 2: Ejecución del método
        int resultadoReal = calculosBis.factorial(5);

        // Fase 3: Comprobación
        assertEquals(120, resultadoReal, "El resultado es incorrecto");
    }

    @Test
    void factorialRecursivo() {
        // Fase 1: Preparacion de los datos
        CalculosBis calculosBis = new CalculosBis();

        // Fase 2: Ejecución del método
        int resultadoReal = calculosBis.factorialRecursivo(5);

        // Fase 3: Comprobación
        assertEquals(120, resultadoReal, "El resultado es incorrecto");
    }
}