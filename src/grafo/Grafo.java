package grafo;
import modelo.Vertice;

import java.util.ArrayList;
public class Grafo {
    private ArrayList<Vertice> vertices = new ArrayList<>();
    private int[][] matrizAdyacencia = new int[50][50];
    public void agregarVertice(String id, int x, int y) {
        vertices.add(new Vertice(id, x, y));
    }
    public void agregarArista(String id1, String id2) {
        Vertice v1 = buscar(id1);
        Vertice v2 = buscar(id2);
        if (v1 != null && v2 != null) {
            int i = vertices.indexOf(v1);
            int j = vertices.indexOf(v2);
            matrizAdyacencia[i][j] = 1;
            matrizAdyacencia[j][i] = 1;
        }
    }
    private Vertice buscar(String id) {
        for (Vertice v : vertices) if (v.getId().equals(id)) return v;
        return null;
    }
    public ArrayList<Vertice> getVertices() { return vertices; }
    public int[][] getMatriz() { return matrizAdyacencia; }
    public String resumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resumen de conexiones: ");
        for (int i = 0; i < vertices.size(); i++) {
            for (int j = i+1; j < vertices.size(); j++) {
                if (matrizAdyacencia[i][j] == 1) {
                    sb.append(vertices.get(i).getId())
                            .append(" - ")
                            .append(vertices.get(j).getId()).append("\n");
                }
            }
        }
        return sb.toString();
    }
}
