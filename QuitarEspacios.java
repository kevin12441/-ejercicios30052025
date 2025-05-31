import java.util.Scanner;

public class QuitarEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cadena con espacios:");
        String cadenaOriginal = scanner.nextLine();

        // Reemplaza todos los espacios en blanco (incluye tabulaciones y saltos de línea)
        String cadenaSinEspacios = cadenaOriginal.replaceAll("\\s+", "");

        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);

        scanner.close();
    }
}
