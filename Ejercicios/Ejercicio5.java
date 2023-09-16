import java.util.Scanner;

/*
 * Realizar un algoritmo que permita ingresar el promedio y la desviación estándar de un numero de datos.
 * Calcular el coeficiente de variabilidad, y si este es mayor al 25% mostrar un mensaje que diga “Este grupo
 * tiene mucha variabilidad”.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el promedio.");
        double promedio = scanner.nextDouble();

        System.out.println("Ingresar la desviacion estandar.");
        double desviacion = scanner.nextDouble();

        double coeficiente = (desviacion / promedio) * 100;

        if (coeficiente > 25.0){
            System.out.println("Este grupo tiene mucha variabilidad");
        }else{
            System.out.println("“Este grupo no tiene mucha variabilidad");

        }

    }
}
