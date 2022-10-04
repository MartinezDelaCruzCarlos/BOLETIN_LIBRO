package boletin_1y8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BOLETIN_1Y8 {

    public static void main(String[] args) {
        int n1, n2;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        n1 = Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = Entrada.nextInt();
        if (n1 > n2) {
            System.out.println(n1 + " y " + n2);
        } else {
            System.out.println(n2 + " y " + n1);
        }
    }

}

