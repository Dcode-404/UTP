import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
         * Un padre repartirá una cantidad de dinero entre sus cinco hijos. Cada uno
         * recibirá una
         * cantidad equivalente a:
         * 
         * ▪ Tamara: 85% del monto recibido por Josué
         * ▪ Josué: 27% de la cantidad a repartir
         * ▪ Caleb: 23% del monto total recibido entre Josué y Daniel
         * ▪ Daniel: 25% de la cantidad a repartir
         * ▪ David: lo que queda del dinero a repartir
         * 
         * Dada la cantidad de dinero a repartir, desarrolle un programa que determine
         * cuánto de
         * dinero recibirá cada hijo
         */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introducir monto:");
        double monto = scanner.nextDouble();

        double josue = monto * 0.27;
        double daniel = monto * 0.25;

        double tamara = josue * 0.85;
        double caleb = (josue + daniel) * 0.23;

        double david = monto - (josue + daniel + caleb + tamara);

        System.out.println("Daniel: " + daniel);
        System.out.println("Josue: " + josue);
        System.out.println("Tamara: " + tamara);
        System.out.println("Caleb: " + String.format("%.2f", caleb));
        System.out.println("David: " + String.format("%.2f", david));
    }
}
