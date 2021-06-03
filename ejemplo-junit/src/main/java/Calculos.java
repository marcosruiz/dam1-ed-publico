/**
 * Clase con métodos estáticos para realizar cálculos
 */
public class Calculos {

    /**
     * Devuelve el factorial de número
     */
    public static int factorial(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException();
        }

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Devuelve el factorial de número
     */
    public static int factorialRecursivo(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorialRecursivo(numero - 1);
        }
    }
}
