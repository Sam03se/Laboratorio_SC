package GUI;

import javax.swing.*;
import java.awt.*;
import grafo.Grafo;
import modelo.Vertice;

public class GrafoPanel extends JPanel {
    private Grafo grafo;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton agregarVerticeButton;
    private JTextField textField4;
    private JTextField textField5;
    private JButton agregarAristaButton;
    private JButton dinujarGrafoButton;
    private JPanel GrafoPanel;
    private JTextArea textArea1;
    private JTable table1;

    public GrafoPanel(Grafo grafo) {
        this.grafo = grafo;
        setBackground(Color.WHITE);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        var vertices = grafo.getVertices();
        int[][] mat = grafo.getMatriz();
        for (int i = 0; i < vertices.size(); i++) {
            Vertice v1 = vertices.get(i);
            for (int j = i+1; j < vertices.size(); j++) {
                if (mat[i][j] == 1) {
                    Vertice v2 = vertices.get(j);
                    g.drawLine(v1.getX(), v1.getY(), v2.getX(), v2.getY());
                    g.drawString("1", (v1.getX() + v2.getX())/2, (v1.getY() +
                            v2.getY())/2);
                }
            }
        }
        for (Vertice v : vertices) {
            g.setColor(Color.BLUE);
            g.fillOval(v.getX()-10, v.getY()-10, 20, 20);
            g.setColor(Color.WHITE);
            g.drawString(v.getId(), v.getX()-5, v.getY()+5);
        }
    }
}
