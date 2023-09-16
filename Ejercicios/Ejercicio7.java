import java.util.Scanner;

public class Ejercicio7 {

    /*
     * Elabore un algoritmo que permita determinar cómo se clasifica un ángulo
     * ingresado por teclado. Los ángulos
     * se clasifican de la siguiente manera:
     * ANGULO TIPO
     * ∢ = 0 Nulo
     * 0 < ∢ < 90 Agudo
     * ∢ = 90 Recto
     * 90 < ∢ < 180 Obtuso
     * ∢ = 180 Llano
     * 180 < ∢ < 360 Cóncavo
     * ∢ = 360 Completo
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar un angulo.");
        double angulo = scanner.nextDouble();

        if (angulo == 0) {
            System.out.println("El angulo es Nulo.");

        } else if (0 < angulo && angulo < 90) {
            System.out.println("El angulo es Agudo.");

        } else if (angulo == 90) {
            System.out.println("El angulo es Recto.");

        } else if (90 < angulo && angulo < 180) {
            System.out.println("El angulo es Obtuso.");

        } else if (angulo == 180) {
            System.out.println("El angulo es Llano.");

        } else if (180 < angulo && angulo < 360) {
            System.out.println("El angulo es Concavo.");

        } else if (angulo == 360) {
            System.out.println("El angulo es Completo.");

        } else {
            System.out.println("Ingresa un numero de 0 a 360.");

        }
    }
}
