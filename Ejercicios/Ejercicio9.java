import java.util.Scanner;

public class Ejercicio9 {

    /*
     * Elabore una solución que calcule el costo total de hospitalización, sabiendo que el total de días y el costo de
     * la habitación. El costo de la habitación se determina de acuerdo a la siguiente tabla.
     * AREA COSTO
     * 1 150
     * 2 120
     * Otra 100
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de días de hospitalización");
        int totalDias = scanner.nextInt();

        System.out.print("Ingrese el área de hospitalización (1, 2 u otro)");
        int area = scanner.nextInt();

        double costoHabitacion;
        switch (area) {
            case 1:
                costoHabitacion = 150.0;
                break;
            case 2:
                costoHabitacion = 120.0;
                break;
            default:
                costoHabitacion = 100.0;
                break;
        }

        double Total = totalDias * costoHabitacion;

        System.out.println("Costo total de hospitalización es:" + Total);

    }
}
