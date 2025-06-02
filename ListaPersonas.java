import java.util.LinkedList;

class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método para mostrar los datos
    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class ListaPersonas {
    public static void main(String[] args) {
        // Crear una LinkedList de tipo Persona
        LinkedList<Persona> lista = new LinkedList<>();

        // Insertar valores
        lista.add(new Persona("Ana", 25));
        lista.add(new Persona("Luis", 30));
        lista.add(new Persona("Carlos", 22));

        // Mostrar valores en pantalla
        System.out.println("Contenido de la lista:");
        for (Persona p : lista) {
            p.mostrar();
        }
    }
}
