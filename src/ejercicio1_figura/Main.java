package ejercicio1_figura;

public class Main {
    public static void main(String[] args) {
        // Referencias del tipo abstracto apuntando a objetos concretos
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        System.out.print("Círculo (radio 5) -> ");
        circulo.mostrarArea();

        System.out.print("Rectángulo (4 x 6) -> ");
        rectangulo.mostrarArea();
    }
}
