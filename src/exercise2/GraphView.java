// CS-151 - HW-3 - Ahror Abdulhamidov
// Exercise 2 - GUI GraphView Class

package exercise2;

import javax.swing.*;
import java.awt.*;

public class GraphView extends JPanel {

    private RGB rgb;

    public GraphView(RGB rgb) {
        this.rgb = rgb;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(255, 0, 0));
        g2d.fillRect(30, 270 - rgb.getRed(), 60, rgb.getRed());

        g2d.setColor(new Color(0, 255, 0));
        g2d.fillRect(120, 270 - rgb.getGreen(), 60, rgb.getGreen());

        g2d.setColor(new Color(0, 0, 255));
        g2d.fillRect(210, 270 - rgb.getBlue(), 60, rgb.getBlue());
    }

}
