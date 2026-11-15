package ejercicio3_uso_incorrecto;

public abstract class Documento {

    protected String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public abstract void imprimir();

    // PARTE 2 (mala práctica que SÍ compila):
    // Método concreto que las hijas "necesitan" sobrescribir. Como tiene cuerpo,
    // Java NO obliga a sobrescribirlo y una hija puede olvidarlo sin error.
    // Lo correcto sería declararlo abstract para forzar la implementación.
    public void calcularCosto() {
        System.out.println("Costo no definido (debería sobrescribirse en la clase derivada)");
    }
}
