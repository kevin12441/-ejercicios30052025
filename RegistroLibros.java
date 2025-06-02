import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Objects;

// Clase Libro
class Libro {
    private int id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    // Sobrescribir equals y hashCode para evitar duplicados en el Set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return id == libro.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void mostrar() {
        System.out.println("ID: " + id + ", Título: " + titulo + ", Edición: " + edicion + ", Autor: " + autor);
    }
}

// Clase principal
public class RegistroLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Libro> libros = new LinkedHashSet<>();
        String continuar;

        System.out.println("Registro de libros:");

        do {
            System.out.print("Ingrese ID del libro: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // limpiar el salto de línea

            System.out.print("Ingrese Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese Edición: ");
            String edicion = scanner.nextLine();

            System.out.print("Ingrese Autor: ");
            String autor = scanner.nextLine();

            libros.add(new Libro(id, titulo, edicion, autor));

            System.out.print("¿Desea ingresar otro libro? (s/n): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        // Mostrar los libros ingresados
        System.out.println("\nListado de libros ingresados:");
        for (Libro libro : libros) {
            libro.mostrar();
        }

        scanner.close();
    }
}
