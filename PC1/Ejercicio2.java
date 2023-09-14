/*
         * Desarrolle código en java, que permita ingresar el precio unitario y la
         * cantidad de un producto, para calcular el monto de compra, Luego se le pide
         * al cliente ingresar el total pagado,
         * Si el total pagado por el cliente es menor al monto de compra muestre mensaje
         * “No cuenta con el saldo”. Si el monto de compra es igual al total pagado,
         * muestre el mensaje “Gracias por su compra, te esperamos pronto”. Si el total
         * pagado es mayor al monto de compra entonces calcule y muestre con cuantas
         * monedas de 10 centavos
         * se le pagará el vuelto al cliente.
         * ¿Cuántas monedas de 10 centavos recibirá de vuelto?. Siendo el precio
         * unitario S/. 75 soles con una cantidad de 5, Si se sabe que el cliente
         * realiza el pago con 4 billetes de S/. 20 ?
*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("INGRESAR PRECIO UNITARIO");
         double precio = sc.nextDouble();
 
         System.out.println("INGRESAR CANTIDAD DE PRODUCTO");
         int cantidad = sc.nextInt();
 
         double monto_compra = cantidad * precio;
 
         System.out.println("INGRESAR EL TOTAL PAGADO");
         double total_pagado = sc.nextDouble();
 
         if (total_pagado < monto_compra) {
             System.out.println("NO CUENTA CON SALDO");
 
         } else if (total_pagado == monto_compra) {
             System.out.println("GRACIAS POR SU COMPRA, TE ESPERAMOS PRONTO");
 
         }else{
             double vuelto = total_pagado - monto_compra;
             int monedas = (int) (vuelto / 0.10);
             System.out.println("EL VUELTO ES : " + monedas + " MONEDAS DE 10 CENTAVOS");
 
         }
    }
}
