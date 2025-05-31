import java.util.Scanner;

public class CapitalizarIniciales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cadena:");
        String cadena = scanner.nextLine();

        StringBuilder resultado = new StringBuilder();

        boolean capitalizar = true;

        for (char c : cadena.toCharArray()) {
            if (capitalizar && Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
                capitalizar = false;
            } else {
                resultado.append(c);
            }

            if (c == ' ') {
                capitalizar = true;
            }
        }

        System.out.println("Cadena con mayúsculas iniciales: " + resultado);

        scanner.close();
    }
}
