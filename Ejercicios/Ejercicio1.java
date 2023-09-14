import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

         /*
         * Una empresa expondrá sus productos en una feria. La empresa considera que el
         * monto total
         * de dinero a invertir estará distribuido de la siguiente manera:
         * 
         * Rubro Porcentaje
         * Alquiler de espacio en la feria 23%
         * Publicidad 7%
         * Transporte 26%
         * Servicios feriales 12%
         * Decoración 21%
         * Gastos varios 11%
         * 
         * Dado el monto total de dinero a invertir, diseñar un programa que determine
         * cuánto gastará
         * la empresa en cada rubro
         */
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir monto:");
        double monto = scanner.nextDouble();

        double publicidad = monto * 0.07;
        double transporte = monto * 0.26;
        double alquiler = monto * 0.23;
        double servicios = monto * 0.12;
        double decoracion = monto * 0.21;
        double gastos_varios = monto * 0.11;

        System.out.println("Publicidad: " + publicidad);
        System.out.println("Transporte: " + transporte);
        System.out.println("Alquiler de espacio de feria: " + alquiler);
        System.out.println("Gatos varios: " + gastos_varios);
        System.out.println("Decoracion: " + decoracion);
        System.out.println("Servicios feriales: " + servicios);

    }

}