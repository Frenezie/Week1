import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Main extends JFrame {
    private JTextField textField;
    public Main() {
        super("Соединение заданий");
        createGUI();
    }
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ActionListener actionListener = new TestActionListener();
        JButton button1 = new JButton("Задание 1");
        button1.setActionCommand("https://github.com/Frenezie/Week1/tree/main/untitled13");
        panel.add(button1);
        button1.addActionListener(actionListener);
        JButton button2 = new JButton("Задание 2");
        button2.setActionCommand("https://github.com/Frenezie/Week1/tree/main/Zadanie2");
        panel.add(button2);
        button2.addActionListener(actionListener);
        JButton button3 = new JButton("Задание 3");
        button3.setActionCommand("https://github.com/Frenezie/Week1/tree/main/Zadanie3");
        panel.add(button3);
        button3.addActionListener(actionListener);
        JButton button4 = new JButton("Задание 4");
        button4.setActionCommand("https://github.com/Frenezie/Week1/tree/main/Zadanie4");
        panel.add(button4);
        button4.addActionListener(actionListener);
        JButton button6 = new JButton("Задание 9");
        button6.setActionCommand("https://github.com/Frenezie/Week1/tree/main/Zadanie9");
        panel.add(button6);
        button6.addActionListener(actionListener);
        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 200));
    }
    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL(e.getActionCommand()).toURI());
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                Main frame = new Main();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true); }});  }}
