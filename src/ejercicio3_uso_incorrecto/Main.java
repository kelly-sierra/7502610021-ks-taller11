package ejercicio3_uso_incorrecto;

public class Main {
    public static void main(String[] args) {

        // ===== PARTE 1: instanciar una clase abstracta (ERROR DE COMPILACIÓN) =====
        // Descomenta la siguiente línea para observar el error en IntelliJ:
        // Documento doc = new Documento("Manual");
        // Error: 'Documento' is abstract; cannot be instantiated

        // ===== PARTE 2: método concreto que debía sobrescribirse (COMPILA, mala práctica) =====
        Documento informe = new Informe("Informe final");
        informe.imprimir();
        informe.calcularCosto(); // Imprime el mensaje por defecto: la hija nunca lo sobrescribió
    }
}
