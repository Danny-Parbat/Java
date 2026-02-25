import java.awt.*;
import javax.swing.*;

public class Frame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Form");
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(5, 5, 5, 5);
        gc.fill = GridBagConstraints.HORIZONTAL;

        // Form fields
        gc.gridx = 0;
        gc.gridy = 0;
        frame.add(new JLabel("Name"), gc);
        gc.gridx = 1;
        frame.add(new JTextField(10), gc);

        gc.gridx = 0;
        gc.gridy = 1;
        frame.add(new JLabel("Roll No"), gc);
        gc.gridx = 1;
        frame.add(new JTextField(10), gc);

        gc.gridx = 0;
        gc.gridy = 2;
        frame.add(new JLabel("Class"), gc);
        gc.gridx = 1;
        frame.add(new JTextField(10), gc);

        gc.gridx = 0;
        gc.gridy = 3;
        frame.add(new JLabel("DOB"), gc);
        gc.gridx = 1;
        frame.add(new JTextField(10), gc);

        JButton button = new JButton("Find Result");
        gc.gridx = 1;
        gc.gridy = 4;
        frame.add(button, gc);

        // Result panels
        JPanel j1 = new JPanel();
        j1.add(new JLabel("English: 100"));

        JPanel j2 = new JPanel();
        j2.add(new JLabel("Maths: 95"));

        JPanel j3 = new JPanel();
        j3.add(new JLabel("Science: 90"));

        // Button event
        button.addActionListener(e -> {
            gc.gridx = 0;
            gc.gridy = 5;
            frame.add(j1, gc);

            gc.gridy = 6;
            frame.add(j2, gc);

            gc.gridy = 7;
            frame.add(j3, gc);

            frame.revalidate();
            frame.repaint();
        });
        frame.setVisible(true);
    }
}