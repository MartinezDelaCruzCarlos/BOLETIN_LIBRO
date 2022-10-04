package boletin_1.pkg2;

import java.util.Scanner;
/**
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class BOLETIN_1y2 {
// 3) Pedir el radio de una circunferencia y calcular su longitud.
    public static void main(String[] args) {
        double l, r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        Scanner Entrada = new Scanner(System.in);
        r = Entrada.nextInt();
        l = 2 * Math.PI * r;
        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
    }

}

