package pr11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class prOne extends JFrame
{
    JTextField jta1 = new JTextField(20);

    JButton button = new JButton("Угадать");
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    prOne()
    {
        super("Угадать число");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("Угадайте число от 0 до 20"));
        add(jta1);
        add(button);
        int x2=(int)(Math.random()*21);
        System.out.println(x2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dimension =toolkit.getScreenSize();
        setBounds(dimension.width/2-250,dimension.height/2-150,400,300);
        button.addActionListener(new ActionListener()
        {
            private int i=0,g=0;
            public void actionPerformed(ActionEvent ae) {
                if(g==3)
                {
                    JOptionPane.showMessageDialog(null, "Вы победитель!", "Победа!", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if (i == 3) {
                    JOptionPane.showMessageDialog(null, "Ваши попытки закончились", "До свидания", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                i++;
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    if (x1 == x2) {
                        JOptionPane.showMessageDialog(null, "Вы угадали число", "Правильно", JOptionPane.INFORMATION_MESSAGE);
                        g=3;
                        return;


                    } else if (x1 > x2) {
                        JOptionPane.showMessageDialog(null, "Число находиться в диапозоне меньше", "Ошибка", JOptionPane.INFORMATION_MESSAGE);
                    } else if (x1 < x2) {
                        JOptionPane.showMessageDialog(null, "Число находиться в диапозоне больше", "Ошибка", JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Нужно вводить цифры", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new prOne();
    }
}
