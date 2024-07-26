package Model;

public class Producto {
    private String nombre;
    private int lote;
    private int peso;
    private String envasado;

    public Producto(String nombre, int lote, String envasado, int peso) {
        this.nombre = nombre;
        this.lote = lote;
        this.envasado = envasado;
        this.peso = peso;
    }

    public int getLote() {
        return lote;
    }

    public int getPeso() {
        return peso;
    }

    public String getEnvasado() {
        return envasado;
    }
}
