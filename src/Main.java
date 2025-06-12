import GUI.GrafoPanel;
import grafo.Grafo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(); // Asegúrate de que esta clase esté bien definida
        GrafoPanel panel = new GrafoPanel(grafo);

        JFrame frame = new JFrame("Grafo");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}