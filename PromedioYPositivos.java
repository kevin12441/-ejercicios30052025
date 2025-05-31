import java.util.Scanner;

public class PromedioYPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        int positivos = 0;
        String respuesta;

        do {
            System.out.println("Ingresa un número:");
            // Asegura que se ingrese un número válido
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingresa un número válido:");
                scanner.next(); // descarta la entrada inválida
            }
            double numero = scanner.nextDouble();
            scanner.nextLine(); // limpiar buffer

            suma += numero;
            contador++;

            if (numero > 0) {
                positivos++;
            }

            System.out.println("¿Quieres ingresar otro número? (s/n):");
            respuesta = scanner.nextLine().trim().toLowerCase();

        } while (respuesta.equals("s"));

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("Cantidad de números ingresados: " + contador);
            System.out.println("Cantidad de números positivos: " + positivos);
            System.out.println("Promedio de los números: " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        }

        scanner.close();
    }
}
