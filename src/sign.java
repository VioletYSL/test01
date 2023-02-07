import myclasses.MyDrawer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sign extends JFrame {
    private JButton clear,undo,redo,chWidth,chColor;
    private JTextField inputWidth;
    private MyDrawer myDrawer;

    public sign(){
        super("簽名板");
        String jh="1";
        clear = new JButton("清除");
        undo = new JButton("上一步");
        redo = new JButton("下一步");
        chWidth = new JButton("換粗細");
        inputWidth = new JTextField(4);
        chColor = new JButton("換顏色");

        JPanel top = new JPanel(new FlowLayout());
        top.add(clear);
        top.add(undo);
        top.add(redo);
        top.add(inputWidth);
        top.add(chWidth);
        top.add(chColor);

        setLayout(new BorderLayout());
        add(top,BorderLayout.NORTH);

        myDrawer = new MyDrawer();
        add(myDrawer,BorderLayout.CENTER);

        setSize(800,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        inti();
    }

    private void inti() {
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDrawer.clear();
            }
        });

        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDrawer.undo();
            }
        });

        redo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDrawer.redo();
            }
        });

        chWidth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDrawer.setNowWidth(Float.parseFloat(inputWidth.getText()));
            }
        });

        chColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor();
            }
        });

    }
    private void changeColor() {
        Color newColor = JColorChooser.showDialog(this, "選顏色", myDrawer.getNowColor());
        if (newColor != null) {
            myDrawer.setNowColor(newColor);
        }
    }



    public static void main (String[] args){

        new sign();

    }
}
