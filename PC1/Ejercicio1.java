import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*
         * Implemente una aplicación que permita controlar los pagos que realiza un
         * estudiante de una IEP, por concepto de pensión, de acuerdo a un monto
         * especificado según su categoría:
         * 
         * Categoría Monto Pensión (S/.)
         * Q 4200
         * R 3500
         * S 2800
         * T 2000
         * Se debe ingresar el nombre del estudiante, categoría y su promedio, la cual
         * deberá aplicar un descuento de acuerdo al promedio obtenido:
         * 
         * Promedio Descuento
         * 18 a 20 25%
         * 16 a 17.99 18%
         * 14 a 15.99 15%
         * menor a 13 no hay descuento
         * Al ejecutar deberá mostrar los datos del estudiante: Nombre, categoría,
         * promedio, pensión, descuento y monto a pagar.
         * 
         * ¿Cuánto deberá pagar un estudiante de categoría Q, con un promedio de 15?
         * 
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESAR NOMBRE");
        String nombre = sc.next();

        System.out.println("CATEGORIA: Q,R,S,T");
        String categoria = sc.next();

        System.out.println("INGRESAR PROMEDIO");
        double promedio = sc.nextDouble();
        System.out.println("");
        double pension = 0;
        double monto = 0;
        double descuento = 0;

        switch (categoria) {
            case "Q":
                pension = 4200;
                evaluar(promedio, categoria, nombre, pension, monto, descuento);
                break;
            case "R":
                pension = 3500;
                evaluar(promedio, categoria, nombre, pension, monto, descuento);
                break;
            case "S":
                pension = 2800;
                evaluar(promedio, categoria, nombre, pension, monto, descuento);
                break;
            case "T":
                pension = 2000;
                evaluar(promedio, categoria, nombre, pension, monto, descuento);
                break;
            default:
        }
    }

    private static void evaluar(Double promedio, String categoria, String nombre, double pension, double monto,
            double descuento) {

        if (promedio >= 18 && promedio <= 20) {
            descuento = pension * 0.25;
            monto = pension - descuento;
            datos(nombre, categoria, promedio, pension, monto, descuento);

        } else if (promedio >= 16 && promedio <= 17.99) {
            descuento = pension * 0.18;
            monto = pension - descuento;
            datos(nombre, categoria, promedio, pension, monto, descuento);

        } else if (promedio >= 14 && promedio <= 15.99) {
            descuento = pension * 0.15;
            monto = pension - descuento;
            datos(nombre, categoria, promedio, pension, monto, descuento);

        } else if (promedio <= 13) {
            monto = pension;
            datos(nombre, categoria, promedio, pension, monto, descuento);
        }
    }

    private static void datos(String nombre, String categoria, Double promedio, double pension, double monto,
            double descuento) {
        System.out.println("Nombre : " + nombre);
        System.out.println("Categoria : " + categoria);
        System.out.println("Promedio : " + promedio);
        System.out.println("Pension : " + pension);
        System.out.println("Descuento : " + descuento);
        System.out.println("Monto a pagar : " + monto);

    }

}