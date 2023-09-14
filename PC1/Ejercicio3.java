/*
 * Implementar una aplicación en java, que permita ingresar una determinada hora: 
 * expresada en horas, minutos y segundos, e imprima la nueva hora después de 15 segundos.
 * Por ejemplo: Al ingresar 2:20:45, la nueva hora será 2:21:00
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESAR HORA");
        int hora = sc.nextInt();

        System.out.println("INGRESAR MINUTO");
        int minuto = sc.nextInt();

        System.out.println("INGRESAR SEGUNDO");
        int segundo = sc.nextInt();

        System.out.println("INGRESAR SEGUNDOS PARA ADELANTAR");
        int time = sc.nextInt();

        segundo += time;

        if (segundo >= 60) {
            minuto += segundo / 60;
            segundo %= 60;
        }

        if (minuto >= 60) {
            hora += minuto / 60;
            minuto %= 60;
        }
        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);

    }
}
