import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DiceRoller extends JFrame {
    private JLabel dieLabel;
    private JButton rollButton;
    private int lastRoll;

    public DiceRoller() {
        super("Dice Roller");
        setLayout(new FlowLayout());
        setSize(200, 200);

        dieLabel = new JLabel("Roll the dice!");
        add(dieLabel);

        rollButton = new JButton("Roll");
        rollButton.addActionListener(new RollButtonListener());
        add(rollButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class RollButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lastRoll = (int)(Math.random() * 6) + 1;
            dieLabel.setText("You rolled a " + lastRoll + "!");
        }
    }

    public static void main(String[] args) {
        new DiceRoller();
    }
}
