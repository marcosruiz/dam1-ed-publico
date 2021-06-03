import java.util.Scanner;

public class Contador2 {
    public static int contador2(int x, int y) {
        Scanner scanner = new Scanner(System.in);
        int num, c = 0;
        if (x > 0 && y > 0) {
            System.out.println("Escribe un número");
            num = scanner.nextInt();
            while (num != 0) {
                if (num >= x && num <= y) {
                    System.out.println("\tNúmero en el rango");
                } else {
                    System.out.println("\tNúmero fuera de rango");
                }
                System.out.println("Escribe un número");
                num = scanner.nextInt();
            }
        } else {
            c = -1;
        }
        scanner.close();
        return c;
    }
}
