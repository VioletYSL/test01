package myclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

public class MyDrawer extends JPanel {
    private LinkedList<Line> lines,recycler;
    private Color nowColor;
    private float nowWidth;

    public MyDrawer(){
        setBackground(Color.LIGHT_GRAY);

        MyListener listener = new MyListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);

        lines = new LinkedList<>();
        recycler = new LinkedList<>();

        nowColor = Color.RED;
        nowWidth = 1;
//

    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
//        g2d.setColor(Color.BLUE);
//		g2d.setStroke(new BasicStroke(4));
        for(Line line:lines){
            g2d.setColor(line.getColor());
            g2d.setStroke(new BasicStroke(line.getWidth()));
            for (int i = 1; i< line.getPoints().size(); i++) {
                HashMap<String, Integer> p0 = line.getPoints().get(i - 1);
                HashMap<String, Integer> p1 = line.getPoints().get(i);
                g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
            }

        }

    }
    private class MyListener extends MouseAdapter{

        @Override
        public void mousePressed(MouseEvent e) {
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x",e.getX());
            point.put("y",e.getY());
//            LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
            Line line = new Line(nowColor, nowWidth);
            line.getPoints().add(point);

            lines.add(line);
            repaint();
//            System.out.println(point);
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x",e.getX());
            point.put("y",e.getY());
            lines.getLast().getPoints().add(point);
            repaint();
//            System.out.println(point);
        }
    }

    public void clear() {
        lines.clear();
        repaint();
    }

    public void undo() {
        recycler.add(lines.removeLast());
        repaint();
    }

    public void redo() {
        lines.add(recycler.removeLast());
        repaint();
    }

    public Color getNowColor() {
        return nowColor;
    }

    public void setNowColor(Color nowColor) {
        this.nowColor = nowColor;
    }

    public float getNowWidth() {
        return nowWidth;
    }

    public void setNowWidth(float nowWidth) {
        this.nowWidth = nowWidth;
    }

}
