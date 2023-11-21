/*
 Problema-5
Determinar el tipo de operación matemática.
 */
package Soluciones;
import java.util.Scanner;
public class Problema_5 {
    public static void main(String[] args) {
        int op;
        Scanner dato = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO: ");
        op = dato.nextInt();
        switch (op) {
            case 1:
                System.out.println("Suma");
            break;
            case 2:
                System.out.println("Resta");
            break;
            case 3:
                System.out.println("Multiplicación");
            break;
            case 4:
                System.out.println("División");
            break;
        }
    }   
}
