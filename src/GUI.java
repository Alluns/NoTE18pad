import javax.swing.*;
import java.awt.*;

public class GUI {
    static int width = 800;
    static int height = 600;

    static JFrame frame;
    static JPanel panel;
    static JTextArea text;
    static JMenuBar menuBar;
    static JMenu file;
    static JMenuItem open, save;

    public static void main(String[] args) {
        frame = new JFrame("Exempel");
        panel = new JPanel();
        text = new JTextArea(20, 20);
        file = new JMenu("Menu");

        Dimension dim = new Dimension(width, height);
        frame.add(panel);
        frame.add(text);
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        menuBar = new JMenuBar();

        frame.setPreferredSize(dim);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        file.add(open);
        file.add(save);

        menuBar.add(file);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
