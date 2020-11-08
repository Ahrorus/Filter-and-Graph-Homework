// CS-151 - HW-3 - Ahror Abdulhamidov
// Exercise 2 - GUI NumberView Class
// Created using IntelIJ's Form Designer (comes with NumberView.form file)

package exercise2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class NumberView {

    private JPanel panel;
    private JPanel innerPanel;
    private JTextField redField;
    private JTextField greenField;
    private JTextField blueField;
    private JButton updateButton;

    public NumberView(RGB rgb, JFrame frame2) {
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    rgb.setRed(Integer.parseInt(redField.getText()));
                    rgb.setGreen(Integer.parseInt(greenField.getText()));
                    rgb.setBlue(Integer.parseInt(blueField.getText()));
                    frame2.repaint();
                } catch (ColorOutOfRangeException ex) {
                    JOptionPane.showMessageDialog(
                            panel,
                            ex.getErrMsg(),
                            "ColorOutOfRangeException",
                            JOptionPane.ERROR_MESSAGE
                    );
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            panel,
                            "Color should be an integer, not a String.",
                            "NumberFormatException",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }

}
