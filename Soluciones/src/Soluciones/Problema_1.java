/*
 Problema-1
Facturación de 2 productos
 */
package Soluciones;
import java.util.Scanner;
public class Problema_1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int nintendo;
        int cantidadtv;
        int precionintendo;
        int preciotv;
        int subpro1;
        int subpro2;
        int subtotal;
        double iva = 0.1;
        double subiva;
        double descuento;
        int envio;
        double total;
        System.out.println("Cuantas nintendo quiere?");
        nintendo = dato.nextInt();
        System.out.println("Cuantas tvs quiere?");
        cantidadtv = dato.nextInt();
        System.out.println("Precio de nintendo");
        precionintendo = dato.nextInt();
        System.out.println("Precio de tvs");
        preciotv = dato.nextInt();
        System.out.println("Costo del envio");
        envio = dato.nextInt();
        subpro1 = precionintendo * nintendo;
        subpro2 = preciotv * cantidadtv;
        subtotal = subpro1 + subpro2;
        iva = subtotal * iva;
        subiva = subtotal + iva;
        if (subiva > 1000) {
            descuento = subiva * 0.2;
        } else {
            descuento = subiva * 0.05;
        }
        if (subtotal > 5000) {
            total = subiva - descuento;
            envio = 0;
            System.out.println("================");
            System.out.println("CANTIDAD DE nintendo: " + nintendo);
            System.out.println("================");
            System.out.println("CANTIDAD DE tv: " + cantidadtv);
            System.out.println("================");
            System.out.println("PRECIO nintendo: " + precionintendo);
            System.out.println("================");
            System.out.println("PRECIO tv: " + preciotv);
            System.out.println("================");
            System.out.println("SUBTOTAL tv: " + subpro1);
            System.out.println("================");
            System.out.println("SUBTOTAL tv: " + subpro2);
            System.out.println("================");
            System.out.println("SUBTOTAL: " + subtotal);
            System.out.println("================");
            System.out.println("IVA: " + iva);
            System.out.println("================");
            System.out.println("SUBTOTAL + IVA: " + subiva);
            System.out.println("================");
            System.out.println("DESCUENTO: " + descuento);
            System.out.println("================");
            System.out.println("GASTOS DE ENVIO: " + envio);
            System.out.println("================");
            System.out.println("MONTO FACTURA: " + total);
        } else {
            total = subiva - descuento + envio;
            System.out.println("================");
            System.out.println("CANTIDAD DE nintendo: " + nintendo);
            System.out.println("================");
            System.out.println("CANTIDAD DE tv: " + cantidadtv);
            System.out.println("================");
            System.out.println("PRECIO nintendo: " + precionintendo);
            System.out.println("================");
            System.out.println("PRECIO tv: " + preciotv);
            System.out.println("================");
            System.out.println("SUBTOTAL tv: " + subpro1);
            System.out.println("================");
            System.out.println("SUBTOTAL tv: " + subpro2);
            System.out.println("================");
            System.out.println("SUBTOTAL: " + subtotal);
            System.out.println("================");
            System.out.println("IVA: " + iva);
            System.out.println("================");
            System.out.println("SUBTOTAL + IVA: " + subiva);
            System.out.println("================");
            System.out.println("DESCUENTO: " + descuento);
            System.out.println("================");
            System.out.println("GASTOS DE ENVIO: " + envio);
            System.out.println("================");
            System.out.println("MONTO FACTURA: " + total);
        }
    }
    
}
