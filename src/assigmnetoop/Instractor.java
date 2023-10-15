
package assigmnetoop;


public class Instractor extends Faculity {
protected int noofproject,noofstudent;
Instractor(){};
Instractor(String Name,String CNIC,String Address,String Phone_num,String email_address,String date_of_birth,int age,String empid,String department,String dateofjoining,String qulification,int experince,int salary,String cource,int contecthours,int credithours,int noofproject,int noofstudent ){
    super(Name,CNIC,Address,Phone_num,email_address,date_of_birth,age,empid,department,dateofjoining,qulification,experince,salary,cource,contecthours,credithours);
    this.noofproject=noofproject;
    this.noofstudent=noofstudent;
    
}

public void Set(){
    super.Set();
    System.out.println("enter number of project of instractor=");
    noofproject=S1.nextInt();
    System.out.println("enter number of student with instractor=");
    noofstudent=S1.nextInt();
}
public void get(){
    super.get();
    System.out.println("NUMBER OF PROJECT OF INSTRACTOR IS="+noofproject);
    System.out.println("NUMBER OF student with instractor is ="+noofstudent);
}
public String toString(){
  
    return   super.toString()+" "+noofproject+noofstudent;
}
public void calculateSalary(){
    totalsalary=salary;
    System.out.println("TOTAL SALARY OF INSTRACTOR IS="+totalsalary);
}
public String get_no_Of_Project(){
    return ""+ noofproject;
}
public String get_no_of_Student(){
    return ""+noofstudent;
}

}
