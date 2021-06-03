public class DeterminaMayor {

    /**
     * Devuelve el número mayor de entre a, b y c
     */
    public static int determinaMayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else {
            if (c > b) {
                return c;
            } else {
                return b;
            }
        }
    }
}
