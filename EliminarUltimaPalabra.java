import java.util.Scanner;

public class EliminarUltimaPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().trim();

        // Verifica si la frase está vacía o contiene solo una palabra
        if (frase.isEmpty() || !frase.contains(" ")) {
            System.out.println("No hay suficientes palabras para eliminar la última.");
        } else {
            // Encuentra la última posición de espacio
            int ultimaPosEspacio = frase.lastIndexOf(" ");
            String nuevaFrase = frase.substring(0, ultimaPosEspacio);

            System.out.println("Frase sin la última palabra: " + nuevaFrase);
        }

        scanner.close();
    }
}
