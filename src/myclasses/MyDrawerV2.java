package myclasses;

import javax.swing.*;
import java.awt.*;

public class MyDrawerV2 extends JPanel {
    public MyDrawerV2(){
        setBackground(Color.lightGray);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0,0,200,400);
    }
}
