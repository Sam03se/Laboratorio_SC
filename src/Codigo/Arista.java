package Codigo;
import modelo.Vertice;

public class Arista {
    private Vertice origen;
    private Vertice destino;
    private int peso;
    public Arista(Vertice origen, Vertice destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }
    public Vertice getOrigen() { return origen; }
    public Vertice getDestino() { return destino; }
    public int getPeso() { return peso; }
    @Override
    public String toString() {
        return origen.getId() + " " + destino.getId() + " (" + peso + ")";
    }
}