package pr12;

import javax.swing.*;
import java.util.Scanner;


public class prOne {
    public static void main(String[] args) {
       new Planets();
    }
}

class Planets extends JFrame {

    public Planets(){

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,Planet.values().length * 115);

        for (int i = 0; i < Planet.values().length; i++)
        {
            Planet planet = Planet.values()[i];

            JLabel label = new JLabel();
            label.setBounds(0,i * 110,200,110);

            JLabel name = new JLabel(planet.toString());
            name.setBounds(0,0,200,20);

            label.add(name);

            JLabel weight = new JLabel("Weight = " + planet.getM() + " kg");
            weight.setBounds(0,25,200,20);

            label.add(weight);

            JLabel radius = new JLabel("Radius = " + planet.getR() + " m");
            radius.setBounds(0,50,200,20);

            label.add(radius);

            JButton button = new JButton("Узнать гравитацию");
            button.setBounds(0,75,200,20);

            button.addActionListener( actionListener -> {

                JLabel gravity = new JLabel("Gravity = " + planet.getGravity() + " H");
                gravity.setBounds(0,75,200,20);
                label.add(gravity);

                button.setVisible(false);
                label.repaint();

            });

            label.add(button);

            add(label);
        }

        setLocationRelativeTo(null);
        setVisible(true);
    }

}