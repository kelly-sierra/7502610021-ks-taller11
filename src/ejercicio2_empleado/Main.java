package ejercicio2_empleado;

public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Laura Gómez", 5000000, 1500000);
        Empleado vendedor = new Vendedor("Carlos Ruiz", 1800000, 10000000, 5);

        gerente.mostrarDetalles();
        System.out.println("-----------------------");
        vendedor.mostrarDetalles();
    }
}
