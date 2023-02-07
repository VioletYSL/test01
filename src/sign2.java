import myclasses.MyDrawerV2;


import javax.swing.*;
import java.awt.*;

public class sign2 extends JFrame {
    private JButton clean ,undo ,redo ;
    private MyDrawerV2 myDrawer;
    public sign2() {
        super("簽名板");
        setLayout(new BorderLayout());
        clean =new JButton("清除");
        undo =new JButton("上一步");
        redo =new JButton("下一步");

        JPanel top = new JPanel(new FlowLayout());
        top.add(clean);top.add(undo);top.add(redo);

        add(top,BorderLayout.NORTH);
        myDrawer = new MyDrawerV2();
        add(myDrawer,BorderLayout.CENTER);

        setSize(800,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String[] args){
         new sign2();

    }
}
