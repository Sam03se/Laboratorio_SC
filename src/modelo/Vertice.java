package modelo;

public class Vertice {
    private String id;
    private int x, y;
    public Vertice(String id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    public String getId() { return id; }
    public int getX() { return x; }
    public int getY() { return y; }
    @Override
    public String toString() {
        return id + " (" + x + "," + y + ")";
    }
}