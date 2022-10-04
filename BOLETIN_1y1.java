package boletin_1.pkg1;

import java.util.Scanner;
/*
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class BOLETIN_1y1 {
/*
2) Pedir el radio de un círculo y calcular su área. A=PI*r^2. 
 */
    public static void main(String[] args) {
        double a, r; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        Scanner Entrada = new Scanner(System.in);
        r = Entrada.nextInt();
        a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
    }

}

