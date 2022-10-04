package boletin_1y6;

import java.util.Scanner;
/**
 *
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class BOLETIN_1Y6 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduce un número: ");
        n1 = Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = Entrada.nextInt();
// si ambos números son iguales diría que n2 es mayor que n1
        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else {
            System.out.println(n2 + " es mayor que " + n1);
        }
    }

}

