import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class frame01 extends JFrame {
    public frame01(){

        JButton b1 = new JButton("b1");

        setLayout(new BorderLayout());
        add(b1,BorderLayout.NORTH);
        setBackground(Color.CYAN);
        setSize(1280,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabled(false);
                JFrame f1 = new JFrame();

                JButton  insert = new JButton("新增");
                JButton canel = new JButton("取消");

                JPanel Bottom = new JPanel();
                Bottom.add(insert);
                Bottom.add(canel);
                setLayout(new BorderLayout());
                f1.add(Bottom,BorderLayout.SOUTH);

                


//                f1.getContentPane().setBackground(Color.CYAN);
                f1.setSize(640,480);
                f1.setVisible(true);
                f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                f1.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);
                        setEnabled(true);
                    }
                });

            }
        });

    }

    public static void main (String[] args){
            new frame01();

    }
}
