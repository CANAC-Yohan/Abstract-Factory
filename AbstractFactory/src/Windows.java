/**
 * Created by Yohan on 11/01/2017.
 */

import javafx.scene.control.ComboBox;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Windows extends JFrame
{
    private JPanel panel = new JPanel();
    private int indexButton;
    private JButton button;

    public Windows()
    {
        this.setTitle("Abstract Factory");
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] themeListe = {"Theme Star Wars", "Theme Mario"};
        JComboBox comboBox = new JComboBox(themeListe);

        comboBox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if(!e.equals(button))
                {
                    panel.remove(button);
                    if(e.getItem().equals("Theme Star Wars"))
                    {
                        button = new StarWarsTheme().createButton();
                        panel.add(button);
                    }
                    else
                    {
                        button = new MarioTheme().createButton();
                        panel.add(button);
                    }
                    panel.repaint();
                    panel.revalidate();
                }
            }
        });
        panel.add(comboBox);
        button = new StarWarsTheme().createButton();
        panel.add(button);

        this.setContentPane(panel);
        this.setVisible(true);
    }
}
