import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class MainGUI {
    private JTextField yourName;
    private JTextField yourAge;
    private JButton createBtn;
    private JLabel name1;
    private JLabel age1;
    private JLabel nameAge;
    private JPanel mainPanel;
    private JTextField yourHeight;
    private JTextField yourWeight;
    private JTextField yourEmail;
    private JPanel QPanel;

    public static ArrayList<Object> projects = new ArrayList<>();

    /*public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new MainGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }*/

    public MainGUI() {
        createBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String firstname = yourName.getText();
                Person person = new Person(firstname, Integer.parseInt(yourAge.getText()), Integer.parseInt(yourHeight.getText()), Integer.parseInt(yourWeight.getText()), yourEmail.getText());

                projects.add(person);

                CreateProjectForm.frame1.setVisible(false);
            }
        });
    }

    public JPanel getter(){
        return this.mainPanel;
    }
}
