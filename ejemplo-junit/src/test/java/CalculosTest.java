import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculosTest {

    @BeforeEach
    public void beforeEach() {
        // Fase 0: Preparamos los datos que sean comunes a todos los @Test
    }

    @AfterEach
    public void afterEach() {
        // Fase 4: Eliminamos los datos que sean necesarios y comunes a todos los @Test
    }

    @Test
    public void factorialDe5Devuelve120() {
        // Fase 1: Preparacion de los datos

        // Fase 2: Ejecución del método
        int resultadoReal = Calculos.factorial(5);

        // Fase 3: Comprobación
        assertEquals(120, resultadoReal, "El resultado es incorrecto");
    }

    @Test
    public void factorialRecursivoDe5Devuelve120() {
        int resultadoReal = Calculos.factorialRecursivo(5);
        assertEquals(120, resultadoReal, "El resultado es incorrecto");
    }

    @Test
    public void factorialLanzaExcepcion() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> Calculos.factorial(-1), "Se esperaba una excepción ya que la entrada es -1");
    }

    @Test
    public void factorialDe0Devuelve1(){
        int resultado = Calculos.factorial(0);
        assertEquals(1, resultado);
    }


}