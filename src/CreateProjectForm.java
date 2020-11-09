import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateProjectForm {

    private JPanel panel1;
    private JButton button1;
    public  JLabel content;
    private JButton refresh;
    private JButton readButton;

    public static JFrame frame1;

    public static printProject printProject = new printProject();
    public static JFrame frame = new JFrame("App");

    public static void main(String[] args) {

        frame.setContentPane(new CreateProjectForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 600);
        frame.setVisible(true);
        printProject.ReadFile();
    }

    //Setting the details for the next frame
    public CreateProjectForm() {
        button1.addActionListener(e -> {    
            frame1 = new JFrame("Hello");
            frame1.getContentPane().add(new MainGUI().getter());
            frame1.pack();
            frame1.setSize(600, 600);
            frame1.setVisible(true);
        });

        //Get all the information from the ArrayList
        /*refresh.addActionListener(e -> {
            content.setText(printProject.getProjectList());
        });*/

        //Calling the Read method
        readButton.addActionListener(e -> {
            printProject.ReadFile();
        });
    }

    public static void createBtn(String projectTitle){
        JButton btn = new JButton(projectTitle);
        btn.setBounds(50, 100, 95, 30);
        frame.revalidate();
        frame.repaint();
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(projectTitle);
            }
        });
    }

}
