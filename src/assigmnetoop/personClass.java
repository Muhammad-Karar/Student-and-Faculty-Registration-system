
package assigmnetoop;

import java.util.Scanner;
public class personClass {
 
   
    Scanner S1 = new Scanner(System.in);
    
    protected String Name,CNIC,Address,Phone_num,email_address,date_of_birth;
    protected int age,totalsalary;
    
 
   personClass(){
        
    }
    
  personClass (String Name,String CNIC,String Address,String Phone_num,String email_address,String date_of_birth,int age){
        this.Name = Name;

        this.CNIC = CNIC;
        this.Address = Address;
        this.Phone_num = Phone_num;
        this.email_address = email_address;
        this.date_of_birth = date_of_birth;
        this.age = age;
    }
    
    public  void Set(){
        
        System.out.println("Enter Name: ");
        Name = S1.nextLine();
        
        System.out.println("Enter CNIC: ");
        CNIC = S1.nextLine();
        
        System.out.println("Enter Address: ");
        Address = S1.nextLine();
        
        System.out.println("Enter Phone_num: ");
        Phone_num = S1.next();
        
        System.out.println("Enter email_address: ");
        email_address = S1.next();
        
        System.out.println("Enter date_of_birth: ");
        date_of_birth = S1.next();
        
        System.out.println("Enter age: ");
        age = S1.nextInt();
    }
    public void get(){
        System.out.println("name="+Name);
        System.out.println("CNIC="+CNIC);
        System.out.println("ADDRESS="+Address);
        System.out.println("pone number="+Phone_num);
        System.out.println("email="+email_address);
        System.out.println("Age="+age);
    }
    
    public String toString(){
        return "Name: "+Name+"\n CNIC"+CNIC+"\n Address: "+Address+"\n Phone_num: "+Phone_num+"\n email_address: "+email_address+"\n date_of_birth: "+date_of_birth+"\n Age: "+age;
    }
    
    public void Set_Address(){
        System.out.println("Enter Address: ");
        Address = S1.nextLine();
    }
    public String get_Address(){
        return Address;
    }
    
    public void Set_Phone_num(){
        System.out.println("Enter Phone_num: ");
        Phone_num = S1.nextLine();
    }
    public String get_Phone_num(){
        return Phone_num;
    }
    
    public void Set_email_address(){
        System.out.println("Enter email_address: ");
        email_address = S1.nextLine();
    }
    public String get_email_address(){
        return email_address;
    }
 public void set_name(String n){
     Name=n;
 }
 public String get_Name(){
     return Name;
 }
 public void set_Cnic(String c){
     CNIC=c;
 }
 public String get_Cnic(){
     return CNIC;
 }
public void set_DOB(String d){
    date_of_birth=d;
}
public String get_DOB(){
    return date_of_birth;
}
public String get_Age(){
    return " "+age;
}
 
}
