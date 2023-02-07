package myclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frame02 extends JFrame {
    public frame02(){

        JFrame f1 = new JFrame();
        f1.getContentPane().setBackground(Color.CYAN);
        f1.setSize(240,180);
        f1.setVisible(true);

        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }
}
