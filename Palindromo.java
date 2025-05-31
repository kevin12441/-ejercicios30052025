import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una palabra:");
        String palabra = scanner.nextLine().trim().toLowerCase();

        // Invertir la palabra
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();

        // Comparar original e invertida
        if (palabra.equals(palabraInvertida)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }

        scanner.close();
    }
}
