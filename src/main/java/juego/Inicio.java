package juego;

import javax.swing.*;

public class Inicio {

    public static void main(String[] args) {
        JFrame window = new JFrame("Luna");

        window.setVisible(true);
        window.setSize(700, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(new Lienzo());
    }
}
