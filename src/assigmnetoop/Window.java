package assigmnetoop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener {

    JButton Student;
    JButton Employee;
    Color c;

    Window() {
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("WELLCOME TO THE SYSTEM");
        c = new Color(255, 239, 213);
        this.getContentPane().setBackground(c);

        Student = new JButton("Student");
        Employee = new JButton("Employee");
        add(Student);
        add(Employee);
        Student.setBounds(120, 70, 150, 50);
        Employee.setBounds(120, 150, 150, 50);

        Student.addActionListener(this);
        Employee.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Student)) {
            StudentGuI sg = new StudentGuI();
            sg.gui();
        }
        if (e.getSource().equals(Employee)) {
            EmployeeGui eg = new EmployeeGui();
        }
    }

}
