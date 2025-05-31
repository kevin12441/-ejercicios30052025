import java.util.Scanner;

public class Contadors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine();

        // Elimina espacios al inicio y al final, luego divide por espacios
        String[] palabras = frase.trim().split("\\s+");

        // Si la frase está vacía, evitar error
        int cantidadPalabras = frase.trim().isEmpty() ? 0 : palabras.length;

        System.out.println("La frase contiene " + cantidadPalabras + " palabra(s).");
        
        scanner.close();
    }
}
