package boletin_1y4;

import java.util.Scanner;
/**
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class BOLETIN_1Y4 {
// 5) Pedir un número e indicar si es positivo o negativo.
    public static void main(String[] args) {
        int num;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = Entrada.nextInt();
        if (num < 0) {
            System.out.println("Negativo");
        } else // suponemos que el 0 es positivo.
        {
            System.out.println("Positivo");
        }
    }

}

