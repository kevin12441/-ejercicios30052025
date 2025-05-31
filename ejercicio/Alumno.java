package ejercicio;

public class Alumno {
    private String codigo;
    private String nombre;
    private String carnet;

    // Constructor vacío
    public Alumno() {
    }

    // Constructor con parámetros
    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    // Método para mostrar datos del alumno en formato texto
    @Override
    public String toString() {
        return "Alumno{" +
                "Código='" + codigo + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Carnet='" + carnet + '\'' +
                '}';
    }
}
