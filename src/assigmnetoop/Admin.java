
package assigmnetoop;


public class Admin extends Faculity {
    protected String extraduty;
    protected int extrapay;
    Admin(){};
    Admin(String Name,String CNIC,String Address,String Phone_num,String email_address,String date_of_birth,int age,String empid,String department,String dateofjoining,String qulification,int experince,int salary,String cource,int contecthours,int credithours,String extraduty,int extrapay ){
    super(Name,CNIC,Address,Phone_num,email_address,date_of_birth,age,empid,department,dateofjoining,qulification,experince,salary,cource,contecthours,credithours);
    this.extraduty=extraduty;
    this.extrapay=extrapay;
    }
    public void Set(){
        super.Set();
        System.out.println("enter the extraduty=");
        extraduty=S1.nextLine();
        System.out.println("enter the extrypay");
        extrapay=S1.nextInt();
    }
    public void get(){
        super.get();
        System.out.println("EXTRA DUTY OF FACILITY="+extraduty);
        System.out.println("Extra pay of duty="+extrapay);
    }
    public String tostring(){
        super.tostring();
        return extraduty+ extrapay;
    }
    public void calculateSalary(){
        totalsalary=salary+extrapay;
        System.out.println("TOTAL SALARY="+totalsalary);
    }
    
}
