import sun.applet.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CreateProjectForm {

    private JPanel panel1;
    private JButton button1;
    private JPanel MainContent;
    public  JLabel content;
    private JButton refresh;
    private JButton writeButton;
    private JButton readButton;

    public static JFrame frame1;

    printProject printProject = new printProject();

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new CreateProjectForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    public CreateProjectForm() {
        button1.addActionListener(e -> {    
            frame1 = new JFrame("Hello");
            frame1.getContentPane().add(new MainGUI().getter());
            frame1.pack();
            frame1.setSize(600, 600);
            frame1.setVisible(true);
        });
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                content.setText(printProject.getProjectList());
            }
        });
        writeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printProject.WriteFile();
            }
        });
        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printProject.ReadFile();
            }
        });
    }

}
