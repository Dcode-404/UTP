import java.util.Scanner;

public class Ejercicio8 {

    /*
     * Realizar una solución que permita calcular el sueldo de un trabajador
     * conociendo el número de horas
     * trabajadas y su tarifa horaria, sabiendo que se debe aumentar el 16% por
     * concepto de bonificación familiar,
     * si este es menor a S/.1,800.00 nuevo soles. Mostrar el sueldo y el aumento
     * respectivo.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar horas trabajadas.");
        double horas = scanner.nextInt();

        System.out.println("Ingresar tarifa horaria.");
        double tarifa = scanner.nextDouble();

        double sueldo = horas * tarifa;

        if (sueldo < 1800) {

            double bonificación = sueldo * 0.16;
            double total = sueldo + bonificación;

            System.out.println("El sueldo es: " + sueldo);
            System.out.println("La bonificacion es: " + bonificación);
            System.out.println("El sueldo total es: " + total);

        } else {
            System.out.println("El sueldo supero los S/.1,800.00 nuevo soles.");

        }
    }
}
