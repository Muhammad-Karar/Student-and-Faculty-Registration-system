
package assigmnetoop;

public class Faculity extends Employ {
    protected String cource;
    protected int contecthours,credithours;
    Faculity(){};
    Faculity (String Name,String CNIC,String Address,String Phone_num,String email_address,String date_of_birth,int age,String empid,String department,String dateofjoining,String qulification,int experince,int salary,String cource,int contecthours,int credithours){
       super(Name,CNIC,Address,Phone_num,email_address,date_of_birth,age,empid,department,dateofjoining,qulification,experince,salary);
       this.cource=cource;
       this.contecthours=contecthours;
       this.credithours=credithours;
       
    }
    public void Set(){
        super.Set();
        System.out.println("Enter the faculity course");
        cource=S1.nextLine();
        System.out.println("Eneter the contecthours");
        contecthours=S1.nextInt();
        System.out.println("Enter the credit house");
        credithours=S1.nextInt();
    }
    public void get(){
        super.get();
        System.out.println("Course of Faculity="+cource);
        System.out.println("contecthours="+contecthours);
        System.out.println("CreditHours="+ credithours);
    }
    public String tostring(){
        super.toString();
        return cource+contecthours+credithours;
    }
    public void calculateSalary(){
        totalsalary=salary;
        System.out.println("Total salary="+totalsalary);
    }
public String get_Course(){
    return " "+cource;
}
public String get_CreditH(){
    return ""+credithours;
}
public String get_ContectH(){
    return ""+contecthours;
}
    
    
}
