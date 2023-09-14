import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * La municipalidad de Pueblo Libre piensa invertir cierto monto de dinero en la
         * reparación de
         * las pistas en las avenidas principales. Cada avenida recibirá un monto
         * equivalente a:
         * 
         * ▪ Av. La Mar: 35% del monto recibido por Av. Bolivar
         * ▪ Av. 28 de Julio: 25% del monto recibido
         * ▪ Av. Bolivar: 10% de lo recibido por la Av. 28 de Julio y Av. Clement
         * ▪ Av. Clement: 15% del monto recibido
         * ▪ Av. Sucre: lo que queda del resto.
         * 
         * Dado el monto a invertir, desarrolle un programa que determine cuánto dinero
         * le
         * corresponde a cada avenida.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir monto:");
        double monto = scanner.nextDouble();

        double av_clement = monto * 0.15;
        double av_28julio = monto * 0.25;

        double av_bolivar = (av_28julio + av_clement) * 0.10;
        double av_la_Mar = av_bolivar * 0.35;

        double av_sucre = monto - (av_clement + av_28julio + av_la_Mar + av_bolivar);

        System.out.println("Av. 28 de julio: " + av_28julio);
        System.out.println("Av. Clement: " + av_clement);
        System.out.println("Av. Bolivar: " + av_bolivar);
        System.out.println("Av. La Mar: " + av_la_Mar);
        System.out.println("Av. Sucre: " + av_sucre);
    }
}
