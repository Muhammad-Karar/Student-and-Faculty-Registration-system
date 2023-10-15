
package assigmnetoop;


public class Staff extends Employ {
    protected String duty;
    protected String shift;
    protected int extrahours,extrahourspay;
     Staff (){};
     Staff(String Name,String CNIC,String Address,String Phone_num,String email_address,String date_of_birth,int age,String empid,String department,String dateofjoining,String qulification,int experince,int salary,String duty,String shift, int extrahours ,int extrahourspay){
   super(Name,CNIC,Address,Phone_num,email_address,date_of_birth,age,empid,department,dateofjoining,qulification,experince,salary);      
         this.duty=duty;
         this.shift=shift;
         this.extrahours=extrahours;
         this.extrahourspay=extrahourspay;
         
     }
    public void Set(){
        super.Set();
        System.out.println("enter the staff duty=");
        duty=S1.nextLine();
        System.out.println("enter the shift ");
        shift=S1.nextLine();
        System.out.println("enter the extrahours");
        extrahours=S1.nextInt();
        System.out.println("enter the pay of extra hours=");
        extrahourspay=S1.nextInt();
    }
   public void get(){
       super.get();
       System.out.println("Staff duty="+duty);
       System.out.println("shift="+shift);
       System.out.println("extrahours="+extrahours);
       System.out.println("Extrahours pay"+extrahourspay);
   }
   public String toString(){
       super.toString();
       return duty+shift+extrahours+extrahourspay;
   }
   public void calculateSalary(){
       totalsalary=salary+extrahourspay;
       System.out.println("total salary of staff="+totalsalary);
       
   }
    
}
