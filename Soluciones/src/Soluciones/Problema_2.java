/*
 Problema-2
Clasificación de un triángulo 
 */
package Soluciones;
import java.util.Scanner;
public class Problema_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.println("Ingresar el primer lado:");
        lado1 = teclado.nextDouble();
        System.out.println("Ingresar el segundo lado:");
        lado2 = teclado.nextDouble();
        System.out.println("Ingresar el tercer lado:");
        lado3 = teclado.nextDouble();
        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
            System.out.println("Triángulo equilátero");
        } else {
            System.out.println("Triángulo isósceles");
        }
        if (lado1 + lado2 < lado3) {
            System.out.println("No es un triángulo");
        }
    }   
}
