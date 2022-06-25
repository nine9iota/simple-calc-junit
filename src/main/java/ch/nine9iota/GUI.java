package ch.nine9iota;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author nine9iota
 * @version 1.0.0
 */

public class GUI implements ActionListener {
    private int count = 0;
    private final JLabel label;

    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Install Simple Calculator");

        label = new JLabel("Number of installs: 0");

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Simple Calculator");

        frame.pack();
        frame.setVisible(true);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));

        panel.setLayout(new GridLayout());

        panel.add(button);

        panel.add(label);

        button.addActionListener(this);
    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count += 1;
        label.setText("Number of installs: " + count);
    }
}

