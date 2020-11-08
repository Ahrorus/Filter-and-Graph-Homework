// CS-151 - HW-3 - Ahror Abdulhamidov
// Exercise 2 - Main class

package exercise2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        RGB rgb = new RGB();

        JFrame frame2 = new JFrame("Graph View");
        GraphView graphView = new GraphView(rgb);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.add(graphView);
        frame2.setSize(320, 320);
        frame2.setLocation(800, 240);
        frame2.setVisible(true);

        JFrame frame1 = new JFrame("Number View");
        NumberView numberView = new NumberView(rgb, frame2);
        frame1.setContentPane(numberView.getPanel());
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setSize(320, 240);
        frame1.setLocation(480, 240);
        frame1.setVisible(true);

    }

}
