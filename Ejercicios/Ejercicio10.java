import java.util.Scanner;

public class Ejercicio10 {

    /*
     * Realice un algoritmo que permita ingresar tres notas de un determinado
     * alumno. Mostrar las notas
     * ordenadas en forma descendente (de mayor a menor).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar 3 notas");

        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();

        int[] notas = {nota1, nota2, nota3};
        java.util.Arrays.sort(notas);
        // De mayor a menor
        System.out.println("Notas de mayor a menor: " + notas[2] + " " + notas[1] + " " + notas[0]);
        // De menor a mayor
        System.out.println("Notas de menor a mayor: " + notas[0] + " " + notas[1] + " " + notas[2]);

    }
}
