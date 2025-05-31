package ejercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear lista genérica de alumnos
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // Insertar algunos alumnos
        listaAlumnos.add(new Alumno("001", "Ana Pérez", "C12345"));
        listaAlumnos.add(new Alumno("002", "Luis Gómez", "C67890"));
        listaAlumnos.add(new Alumno("003", "María López", "C54321"));

        // Mostrar los alumnos en pantalla
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}
