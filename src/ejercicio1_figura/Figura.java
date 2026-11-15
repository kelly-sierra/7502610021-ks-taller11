package ejercicio1_figura;

public abstract class Figura {

    // Método abstracto: cada figura calcula su área de forma distinta
    public abstract double calcularArea();

    // Método concreto: reutiliza calcularArea() de la clase derivada (polimorfismo)
    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}
