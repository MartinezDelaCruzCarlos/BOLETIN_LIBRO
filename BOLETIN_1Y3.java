package boletin_1y3;

import java.util.Scanner;

/**
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class BOLETIN_1Y3 {
// 4) Pedir dos números y decir si son iguales o no.
    public static void main(String[] args) {
        int n1, n2;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        n1 = Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = Entrada.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

}

