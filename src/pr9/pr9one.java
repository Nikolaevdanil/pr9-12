package pr9;

import pr9.Part1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pr9one {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Практическая № 9");

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        JLayeredPane lp = frame.getLayeredPane();

        JButton button = new JButton("Жмякни меня");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Part1.CreateFigure(lp);
            }
        });

        frame.add(button);

        frame.setSize(1980, 1080);
        frame.setVisible(true);
    }
}