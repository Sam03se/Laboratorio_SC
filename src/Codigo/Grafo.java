package Codigo;

import java.util.ArrayList;

public class Grafo {
    private ArrayList<Vertice> vertices = new ArrayList<>();
    private int[][] matrizAdyacencia = new int[50][50];
    public void agregarVertice(String id, int x, int y) {
        vertices.add(new Vertice(id, x, y));
    }
    public void agregarArista(String id1, String id2, int peso) {
        Vertice v1 = buscar(id1);
        Vertice v2 = buscar(id2);
        if (v1 != null && v2 != null) {
            int i = vertices.indexOf(v1);
            int j = vertices.indexOf(v2);
            matrizAdyacencia[i][j] = peso;
            matrizAdyacencia[j][i] = peso;
        }
    }
    private Vertice buscar(String id) {
        for (Vertice v : vertices) if (v.getId().equals(id)) return v;
        return null;
    }
    public ArrayList<Vertice> getVertices() { return vertices; }
    public int[][] getMatriz() { return matrizAdyacencia; }
}