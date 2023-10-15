
package assigmnetoop;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window3 extends JFrame implements ActionListener {
    JButton Add;
JButton Search;

    Window3(){
       this.setVisible(true);
this.setLayout(null);
this.setSize(500, 400);
this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
this.setTitle("Employee");  
Add=new JButton("Add");
Search=new JButton("Search");
add(Add);
add(Search);
Add.setBounds(120, 70, 150, 50);
Search.setBounds(120, 150, 150, 50);
Add.addActionListener(this);
Search.addActionListener(this); 
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Add)){
            EmployeeGui emp=new EmployeeGui();
        }
        if(e.getSource().equals(Search)){
            EmploySearch es=new EmploySearch();
            
        }
    }
}
