/*
Problema-3
Costo de envío de paquetes 
 */
package Soluciones;
import java.util.Scanner;
public class Problema_3 {
    public static void main(String[] args) {
        double paquete,peso;
        String region;
        Scanner dato = new Scanner(System.in);       
        System.out.println("Ingrese el precio del paquete:");
        paquete = dato.nextDouble();
        System.out.println("Ingrese el peso del paquete:");
        peso = dato.nextDouble();
        System.out.println("Ingrese la región del paquete:");
        region = dato.nextLine();
        switch (region) {
            case "local":
                if (peso<5) {
                    paquete=paquete +5;
                    System.out.println("El precio del paquete es: "+paquete);
                }
                else if (peso<10.0){
                    paquete=paquete +10;
                    System.out.println("El precio del paquete es: "+paquete);
                }
            break;
            case "nacional":
                System.out.println("Nacional");
            break;
        }
    }  
}
