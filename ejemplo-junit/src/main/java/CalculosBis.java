/**
 * Clase con métodos para realizar cálculos
 */
public class CalculosBis {

    /**
     * Constructor
     */
    public CalculosBis() {
    }

    /**
     * Devuelve el factorial de número
     */
    public int factorial(int numero) throws IllegalArgumentException {
        return Calculos.factorial(numero);
    }

    /**
     * Devuelve el factorial de número
     */
    public int factorialRecursivo(int numero) {
        return Calculos.factorialRecursivo(numero);
    }

}
