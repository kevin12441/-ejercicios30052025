import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine();

        int contador = 0;

        // Recorre cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a') {
                contador++;
            }
        }

        System.out.println("La vocal 'A' aparece " + contador + " vez/veces en la frase.");

        scanner.close();
    }
}
