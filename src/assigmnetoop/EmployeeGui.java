
package assigmnetoop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class EmployeeGui extends JFrame implements ActionListener{
    ArrayList<Instractor> arr=new ArrayList();
 

  int in=0;
  
     

 
  JButton delet;
     JButton submit;
     JButton search;
     JButton next;
      JTextField t;
        JTextField t1;
         JTextField t2;
   
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
              JTextField t17;
               JTextField t18;
               JTextField t19;
          JLabel j;
             JTextField l;
      EmployeeGui(){
        this.setTitle("Employe CLASS");
        this.setVisible(true);
        this.setSize(800, 800);
        this. setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         this.setLayout(null);
        JLabel name=new JLabel("NAME");
         JLabel fathername=new JLabel("FATHER NAME");
        JLabel cnic=new JLabel("CNIC");
        
         JLabel address=new JLabel("ADDRESS");
          JLabel phno=new JLabel("Phone_no");
           JLabel emil=new JLabel("EMAIL");
            JLabel date=new JLabel("DATE OF BIRTH");
             JLabel age=new JLabel("AGE");
              JLabel clas=new JLabel("employ id");
             JLabel section=new JLabel("department");
              JLabel quiz=new JLabel("date of joining");
              JLabel ass=new JLabel("qulification");
              JLabel mid=new JLabel("experince");
              JLabel fin=new JLabel("salary");
              JLabel fyp=new JLabel("cource");
             JLabel cgpa=new JLabel("contectHours");
             JLabel ch=new JLabel("Credit hours");
             JLabel prj=new JLabel("No of project");
             JLabel std=new JLabel("no of Student");
t=new JTextField();
     t1=new JTextField();
     
      t2= new JTextField();
      
       t4=new JTextField();
    t5=new JTextField();
    t6=new JTextField();
   t7=new JTextField();
       t8= new JTextField();
      t9=new JTextField();
        t10=new JTextField();
        t11= new JTextField();
        t12=new JTextField();
            t13=new JTextField();
                t14=new JTextField();
                    t15=new JTextField();
                        t16=new JTextField();
                        t17=new JTextField();
                         t18=new JTextField();
                          t19=new JTextField();
         this.add(t1);
        this. add(t2);
     
         this.add(t4);
         this.add(t5);
         this.add(t6);
        this.add(t7);
         this.add(t8);
       
         this.add(t9);
         this.add(t10);
         this.add(t11);
        this. add(t12);
          this.add(t13);
          this. add(t14);
           this. add(t15);
             this.add(t16);
               this.add(t17);
                 this.add(t18);
                   this.add(t19);
        this.add(t);
        this.add(name);
        this.add(cgpa);
        this.add(fathername);
       this. add(cnic);
       this. add(address);
        this.add(phno);
        this.add(emil);
        this.add(date);
        this.add(age);
        this.add(clas);
        this.add(section);
  t9.setEditable(false);
        this.add(quiz);
          this. add(ass);
             this. add(mid);
                 this.add(fin);
                    this.add(fyp);
                    this.add(ch);
                     this.add(prj);
                      this.add(std);
                    
        t.setBounds(60, 85, 100, 20);
        name.setBounds(20, 80, 50, 20);
        
       cnic.setBounds(180, 80, 100, 20);
       t2.setBounds(220, 80, 120, 20);
       address.setBounds(15, 140, 100, 20);
       t4.setBounds(80, 140, 120, 20);
       phno.setBounds(220, 140, 100, 20);
       t5.setBounds(300, 140 ,100, 20);
       emil.setBounds(20, 190, 100, 20);
       t6.setBounds(70, 190, 100, 20);
       date.setBounds(200, 190, 100, 20);
       t7.setBounds(300, 190, 80, 20);
       age.setBounds(400, 190, 50, 20);
       t8.setBounds(430, 190, 50, 20);
       clas.setBounds(20, 300, 100, 20);
       t9.setBounds(100, 300, 70, 20);
       section.setBounds(180, 300, 100, 20);
       t10.setBounds(260, 300, 100, 20);
       cgpa.setBounds(20, 450, 100, 20);
       t11.setBounds(120, 450, 60, 20);
    quiz.setBounds(20, 360, 120, 20);
    t12.setBounds(120, 360, 100, 20);
    ass.setBounds(230, 360, 120, 20);
    t13.setBounds(300, 360, 80, 20);
    mid.setBounds(20, 390, 100, 20);
      t14.setBounds(110, 390, 100, 20);
    fin.setBounds(220, 390, 80, 20);
     t15.setBounds(290, 390, 80, 20);
     fyp.setBounds(20, 420, 100, 20);
     t16.setBounds(90, 420, 100, 20);
     ch.setBounds(220, 420, 100, 20);
     t17.setBounds(300, 420, 60, 20);
     prj.setBounds(20, 490, 100, 20);
     t18.setBounds(120, 490, 60, 20);
     std.setBounds(240, 490, 100, 20);
     t19.setBounds(330, 490, 60, 20);
        submit= new JButton();
       submit.setText("SUBMIT");
       this.add(submit);
       submit.setBounds(60, 550, 110, 20);
    delet=new JButton("DELET");
     
      
      search=new JButton("search");
     search.setBounds(180, 550,70, 20);
     next=new JButton("NEXT");
     next.setBounds(300, 550, 70, 20);
     this.add(next);
    this. add(search);
    delet.setBounds(420, 550, 120, 20);
     this.add(delet);
   submit.addActionListener(this);
     next.addActionListener(this);
     search.addActionListener(this);
     delet.addActionListener(this);
      }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(submit)){
            String  Name, CNIC, Address, Phone_num, email_address, date_of_birth, empid, department, dateofjoining, qulification, cource;
      int age,salary,exp,ch,crdh,noofp,noofs;
      Name=t.getText();
      CNIC=t2.getText();
      Address=t4.getText();
      Phone_num=t5.getText();
      email_address=t6.getText();
      date_of_birth=t7.getText();
      age=Integer.parseInt(t8.getText());
      empid=t9.getText();
      department=t10.getText();
      ch=Integer.parseInt(t11.getText());
      qulification=t13.getText();
      dateofjoining=t12.getText();
      exp=Integer.parseInt(t14.getText());
      salary=Integer.parseInt(t15.getText());
      cource=t16.getText();
      crdh=Integer.parseInt(t17.getText());
      noofp=Integer.parseInt(t18.getText());
      noofs=Integer.parseInt(t19.getText());
      Instractor i=new Instractor(  Name, CNIC, Address, Phone_num, email_address, date_of_birth,age,empid,department,dateofjoining, qulification,exp,salary,cource,ch,crdh,noofp,noofs);
      t9.setText(i.get_EmpID());
      arr.add(i);
              JOptionPane.showMessageDialog(null, "SUMITTED", " ", JOptionPane.PLAIN_MESSAGE);

     }
       else if(e.getSource().equals(delet)){
            String z=JOptionPane.showInputDialog(null,"ENTER ID TO SEARCH");
              for(int i=0;i<arr.size();i++){
               if(z.equalsIgnoreCase(arr.get(i).empid)){
                   arr.remove(i);
                   JOptionPane.showMessageDialog(null, "THE STUDENT RECORD SUCCEFULLY DELETED");
               }
        }
       }
       else if(e.getSource().equals(search)){
           String z=JOptionPane.showInputDialog(null,"ENTER ID TO SEARCH");
           for(int i=0;i<arr.size();i++){
               if(z.equalsIgnoreCase(arr.get(i).empid)){
                   String x=arr.get(i).toString();
                   JOptionPane.showMessageDialog(null, x);
               }
               
               }
       }
        if(e.getSource().equals(next)){
     t.setText("");
     t1.setText(""); 
    t2.setText("");
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
                                                   t17.setText("");
                                                       t18.setText("");
                                                           t19.setText("");
                                                       
                                               
                                        
                                    
                                
                    
                    
                
        }
    }
    
}
