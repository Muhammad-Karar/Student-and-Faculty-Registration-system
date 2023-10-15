
package assigmnetoop;

public abstract class Employ extends personClass{
    protected String empid,department,dateofjoining,qulification;
    protected int experince;
    protected int salary;
    static int x=1;
    Employ(){};
    Employ(String Name,String CNIC,String Address,String Phone_num,String email_address,String date_of_birth,int age,String empid,String department,String dateofjoining,String qulification,int experince,int salary){
      super(Name,CNIC,Address,Phone_num,email_address,date_of_birth,age);
      this.empid=empid;
      this.department=department;
      this.dateofjoining=dateofjoining;
      this.qulification=qulification;
      this.salary=salary;
      
    }
    public void Set(){
        super.Set();
        System.out.println("enter the employ id=");
        empid=S1.next();
        System.out.println("Enter the department");
        department=S1.next();
        System.out.println("enter the date of joining=");
        dateofjoining=S1.next();
        System.out.println("enter the experince in year");
        experince=S1.nextInt();
        System.out.println("Enter the qulification");
        qulification=S1.next();
        System.out.println("enter the salary ");
        salary=S1.nextInt();
    }
    public void get(){
        super.get();
        System.out.println("employ id="+empid);
        System.out.println("Department="+department);
        System.out.println("Date of joining="+dateofjoining);
        System.out.println("experance"+ experince);
        System.out.println("qulification="+  qulification);
        System.out.println("Salary="+salary);
    }
    public String toString(){
        
        return super.toString()+empid+"\n"+department+"\n"+dateofjoining+"\n"+qulification+"\n"+salary+"\n"+experince;
    }
    public void set_Experince(){
        System.out.println("ENTER YOUR EXPERINCE=");
        experince=S1.nextInt();
    }
    public int get_Experince(){
        return experince;
    }
    public void set_salary(){
        System.out.println("ENTER YOUR SALARY=");
        salary=S1.nextInt();
    }
    public int set_Salary(){
        return salary;
    }
  public String get_EmpID(){
      empid=""+x;
      x++;
      return empid;
  }
  public String get_Depaartment(){
      return department;
  }
  public String get_DOj(){
    return dateofjoining;
}
  public String get_Qulification(){
      return qulification;
  }
  public String get_Exp(){
      return " "+experince;
  }
  public String get_Salary(){
      return ""+salary;
  }
    public abstract void calculateSalary();

   
   
    
}
 