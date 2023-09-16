import java.util.Scanner;

/*
 * Desarrollar una solución que permita ingresar y mostrar las edades de dos personas. Si la primera edad es
 * mayor que la segunda, mostrar la edad ingresada y un mensaje que diga “La primera persona es mayor que
 * la segunda”.
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar la edad de la primera persona");
        int edad_1 = scanner.nextInt();

        System.out.println("Ingresar la edad de la segunda persona");
        int edad_2 = scanner.nextInt();

        if (edad_1 > edad_2) {
            System.out.println("La primera persona es mayor que la segunda.");

        } else if (edad_1 == edad_2) {
            System.out.println("La primera persona y la segunda tienen la misma edad.");

        } else {
            System.out.println("La segunda persona es mayor que la primera.");

        }

    }

}
