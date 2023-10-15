package assigmnetoop;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

public class StudentGuI extends JFrame implements ActionListener {

    ArrayList<Undergraduate> un = new ArrayList();
    String mylist[] = {"Undergrduate", "Grdauate"};
    JList list;
    int in = 0;
    Color c;

    String x;
    int index;
    JTextField s;
    JButton delet;
    JButton submit;
    JButton search;
    JButton next;
    JTextField t;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;
    JTextField t11;
    JTextField t12;
    JTextField t13;
    JTextField t14;
    JTextField t15;
    JTextField t16;
    JLabel j;
    JTextField l;

    public void gui() {
        this.setTitle("STUDENT CLASS");
        this.setVisible(true);
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        c = new Color(255, 239, 213);
        this.getContentPane().setBackground(c);
        
        JLabel name = new JLabel("NAME");
        JLabel fathername = new JLabel("FATHER NAME");
        JLabel cnic = new JLabel("CNIC");
        JLabel regno = new JLabel("REGISTRATION NO");
        JLabel address = new JLabel("ADDRESS");
        JLabel phno = new JLabel("Phone_no");
        JLabel emil = new JLabel("EMAIL");
        JLabel date = new JLabel("DATE OF BIRTH");
        JLabel age = new JLabel("AGE");
        JLabel clas = new JLabel("CLASS");
        JLabel section = new JLabel("SECTION");
        JLabel quiz = new JLabel("QUIZ");
        JLabel ass = new JLabel("Assignment");
        JLabel mid = new JLabel("MID");
        JLabel fin = new JLabel("final");
        JLabel fyp = new JLabel("FYP");
        JLabel cgpa = new JLabel("CGAP");
        t = new JTextField();
        t1 = new JTextField();

        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        t9 = new JTextField();
        t10 = new JTextField();
        t11 = new JTextField();
        t12 = new JTextField();
        t13 = new JTextField();
        t14 = new JTextField();
        t15 = new JTextField();
        t16 = new JTextField();
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(t5);
        this.add(t6);
        this.add(t7);
        this.add(t8);
        this.add(t9);
        this.add(t10);
        this.add(t11);
        this.add(t12);
        this.add(t13);
        this.add(t14);
        this.add(t15);
        this.add(t16);

        this.add(t);
        this.add(name);
        this.add(cgpa);
        this.add(fathername);
        this.add(cnic);
        this.add(address);
        this.add(phno);
        this.add(emil);
        this.add(date);
        this.add(age);
        this.add(clas);
        this.add(section);
        this.add(regno);
        this.add(quiz);
        this.add(ass);
        this.add(mid);
        this.add(fin);
        this.add(fyp);

        t.setBounds(80, 35, 120, 20);
        name.setBounds(30, 30, 50, 30);
        fathername.setBounds(220, 35, 100, 30);
        t1.setBounds(340, 35, 120, 20);
        cnic.setBounds(25, 70, 100, 20);
        t2.setBounds(80, 70, 120, 20);
        regno.setBounds(220, 70, 120, 20);
        t3.setBounds(340, 70, 120, 20);
        address.setBounds(20, 105, 100, 20);
        t4.setBounds(80, 105, 120, 20);
        phno.setBounds(220, 105, 100, 20);
        t5.setBounds(340, 105, 120, 20);
        emil.setBounds(20, 135, 100, 20);
        t6.setBounds(80, 135, 120, 20);
        date.setBounds(220, 135, 100, 20);
        t7.setBounds(340, 135, 120, 20);
        age.setBounds(480, 135, 50, 20);
        t8.setBounds(510, 135, 50, 20);
        clas.setBounds(20, 330, 60, 20);
        t9.setBounds(70, 330, 60, 20);
        section.setBounds(140, 330, 60, 20);
        t10.setBounds(220, 330, 80, 20);
        cgpa.setBounds(140, 420, 60, 20);
        t11.setBounds(220, 420, 80, 20);
        quiz.setBounds(20, 360, 60, 20);
        t12.setBounds(70, 360, 60, 20);
        ass.setBounds(140, 360, 80, 20);
        t13.setBounds(220, 360, 80, 20);
        mid.setBounds(20, 390, 60, 20);
        t14.setBounds(70, 390, 60, 20);
        fin.setBounds(140, 390, 60, 20);
        t15.setBounds(220, 390, 80, 20);
        fyp.setBounds(20, 420, 60, 20);
        t16.setBounds(70, 420, 60, 20);
        submit = new JButton();
        submit.setText("Submit");
        this.add(submit);
        submit.setBounds(60, 500, 110, 20);

        delet = new JButton("Delete");
        search = new JButton("Search");
        search.setBounds(180, 500, 110, 20);
        next = new JButton("Next");
        next.setBounds(300, 500, 110, 20);
        delet.setBounds(420, 500, 110, 20);
        this.add(delet);
        this.add(next);
        this.add(search);

        submit.addActionListener(this);
        next.addActionListener(this);
        search.addActionListener(this);
        list = new JList(mylist);
        delet.addActionListener(this);
        this.add(list);
        s = new JTextField("SELECT OPTION");
        this.add(s);
        s.setBounds(20, 200, 120, 20);
        list.setBounds(20, 220, 150, 50);
        t3.setEditable(false);
        list.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    x = (String) list.getSelectedValue();
                    s.setText(x);

                }

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String n, fn, cnic, reg, add, ph, em, dob, cls, sec;
        int ag;
        double gpa, q, a, m, f, fy;

        if (e.getSource().equals(submit)) {

            n = t.getText();
            fn = t1.getText();
            cnic = t2.getText();
            reg = t3.getText();
            add = t4.getText();
            ph = t5.getText();
            em = t6.getText();
            dob = t7.getText();
            ag = Integer.parseInt(t8.getText());
            cls = t9.getText();
            sec = t10.getText();
            gpa = Double.parseDouble(t11.getText());
            q = Double.parseDouble(t12.getText());
            a = Double.parseDouble(t13.getText());
            m = Double.parseDouble(t14.getText());
            f = Double.parseDouble(t15.getText());
            fy = Double.parseDouble(t16.getText());
            Undergraduate obj = new Undergraduate(n, cnic, add, ph, em, dob, ag, reg, fn, cls, sec, q, a, m, f, fy);
            un.add(obj);
            t3.setText(obj.get_reg_no());
            JOptionPane.showMessageDialog(null, "SUMITTED", " ", JOptionPane.PLAIN_MESSAGE);

        } else if (e.getSource().equals(delet)) {
            String z = JOptionPane.showInputDialog(null, "ENTER ID TO SEARCH");
            for (int i = 0; i < un.size(); i++) {
                if (z.equalsIgnoreCase(un.get(i).Reg_no)) {
                    un.remove(i);
                    JOptionPane.showMessageDialog(null, "THE STUDENT RECORD SUCCEFULLY DELETED");
                }

            }
        }

        if (e.getSource().equals(search)) {
            String z = JOptionPane.showInputDialog(null, "ENTER ID TO SEARCH");
            for (int i = 0; i < un.size(); i++) {
                if (z.equalsIgnoreCase(un.get(i).Reg_no)) {
                    String t = un.get(i).toString();
                    JOptionPane.showMessageDialog(null, t);
                }

            }
        } else if (e.getSource().equals(next)) {

            t.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
            t13.setText("");
            t14.setText("");
            t15.setText("");
            t16.setText("");
            s.setText("");

        }

    }
}
