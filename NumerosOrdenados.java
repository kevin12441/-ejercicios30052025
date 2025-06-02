import java.util.Scanner;
import java.util.TreeSet;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();
        String continuar;

        System.out.println("Ingrese números (se ordenarán automáticamente de menor a mayor):");

        do {
            System.out.print("Ingrese un número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Ingrese un número válido.");
                scanner.next(); // limpiar entrada inválida
            }
            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = scanner.next().toLowerCase();
        } while (continuar.equals("s"));

        // Mostrar los números ordenados
        System.out.println("\nNúmeros ingresados ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
