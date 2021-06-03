import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ejemplo de prueba del camino básico
 */
class DeterminaMayorTest {

    /**
     * Camino: 1,2,3,5,6,F
     */
    @Test
    public void determinaMayorDe637Devuelve7() {
        int a = 6;
        int b = 3;
        int c = 7;

        int resultado  = DeterminaMayor.determinaMayor(a, b, c);

        assertEquals(7, resultado);
    }

    /**
     * Camino: 1,2,3,4,F
     */
    @Test
    public void determinaMayorDe534Devuelve7() {
        int a = 5;
        int b = 3;
        int c = 4;

        int resultado  = DeterminaMayor.determinaMayor(a, b, c);

        assertEquals(5, resultado);
    }

    /**
     * Camino: 1,2,5,7,F
     */
    @Test
    public void determinaMayorDe576Devuelve7() {
        int a = 5;
        int b = 7;
        int c = 6;

        int resultado  = DeterminaMayor.determinaMayor(a, b, c);

        assertEquals(7, resultado);
    }

    /**
     * Camino: 1,2,5,6,F
     */
    @Test
    public void determinaMayorDe579Devuelve7() {
        int a = 5;
        int b = 7;
        int c = 4;

        int resultado  = DeterminaMayor.determinaMayor(a, b, c);

        assertEquals(7, resultado);
    }
}