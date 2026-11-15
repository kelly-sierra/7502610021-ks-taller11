package ejercicio3_uso_incorrecto;

public class Informe extends Documento {

    public Informe(String titulo) {
        super(titulo);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo informe: " + titulo);
    }

    // OJO: NO sobrescribe calcularCosto(). Compila, pero es mala práctica.
}
