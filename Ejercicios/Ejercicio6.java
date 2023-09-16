import java.util.Scanner;

/*
 * La librería el bolígrafo necesita con urgencia una solución que le permita ingresar la cantidad de borradores
 * que se compraron y el precio respectivo. Calcular y mostrar el monto a pagar, y si este supera los S/.100.00
 * nuevos soles, aplicarle un descuento del 7%
 */
public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar cantidad de borradores.");
        int cantidad = scanner.nextInt();

        System.out.println("Ingresar el precio de los borradores.");
        double precio = scanner.nextDouble();

        double monto = cantidad * precio;

        if (monto > 100.0) {
            monto = monto - (monto * 0.07);
            System.out.println("El monto a pagar con el descuento de 7% es:" + monto);
        } else {
            System.out.println("El monto a pagar es: " + monto);

        }
    }
}
