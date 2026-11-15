package ejercicio2_empleado;

public abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: cada tipo de empleado calcula su salario distinto
    public abstract double calcularSalario();

    // Método concreto: usa calcularSalario() para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}
