package juego;

import javax.swing.*;
import java.awt.*;

public class Lienzo extends Canvas
{

    public void  paint(Graphics g ) {
        g.setColor(Color.GRAY);
        g.fillOval(50,50,100,100);
    }
}
