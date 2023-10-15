
package assigmnetoop;


public abstract class StudentClass extends personClass {
   
    protected String Reg_no,Father_name,Class,Section;
    protected double CGPA;
protected double quiz,assignment,mids,final_marks;
static int x=1;
    StudentClass(){
        
    }
    
    StudentClass(String Name,String CNIC,String Address,String Phone_num,String email_address,String date_of_birth,int age,String Reg_no,String Father_name,String Class,String Section,double quiz,double assignment,double mids,double final_marks){
       super(Name,CNIC,Address,Phone_num,email_address,date_of_birth,age);
       this.Reg_no = Reg_no;
       this.Father_name = Father_name;
       this.Class = Class;
       this.Section = Section;
       this.CGPA = CGPA;
       this.quiz=quiz;
       this.assignment=assignment;
       this.mids=mids;
       this.final_marks=final_marks;
 
    }
   
    
   
    public void Set(){
        super.Set();
        System.out.println("Enter Regestration Number: ");
        Reg_no = S1.next();
        
        System.out.println("Enter Father Name: ");
        Father_name = S1.next();
        
        System.out.println("Enter Class: ");
        Class = S1.next();
        
        System.out.println("Enter Section: ");
        Section = S1.next();
        
       System.out.println("Enter CGPA: ");
       CGPA = S1.nextFloat();
    }
    
    public String toString(){
        return super.toString()+"\n Reg_no: "+"\n Father Name: "+Father_name+"\n Class:"+Class+"\n Section: "+Section+"\n CGPA: "+CGPA;
    }
    
    public String get_reg_no(){
       Reg_no=""+x;
       x++;
        return Reg_no;
    }
    
    public void Set_Class(){
        System.out.println("Enter Class: ");
        Class = S1.nextLine();
    }
    public String get_Class(){
        return Class;
    }
    
    public void Set_CGPA(double c){
        
        CGPA = c;
    }
    public String get_CGPA(){
       return" "+ CGPA;
    }
    public void Set_Section(){
        System.out.println("Enter Section: ");
        Section = S1.nextLine();
    }
    public String get_Section(){
        return Section;
    }
    public void marks(){
        System.out.println("enter the quiz marks=");
        quiz=S1.nextDouble();
        System.out.println("enter the assignment marks=");
        assignment=S1.nextDouble();
        System.out.println("enter the mids marks=");
        mids=S1.nextDouble();
        System.out.println("enter the final marks");
       final_marks= S1.nextDouble();
          }
    public void getmarks(){
        System.out.println("QUIZ MARKS="+quiz);
        System.out.println("ASSIGNMENT MARKS="+assignment);
        System.out.println("MID TERM MARKS="+mids);
        System.out.println("FINAL PAPER MARKS="+final_marks);
    }
 public abstract void calculateCgpa();
 public String getF()
 {
     return Father_name;
 }
 public void set_RegNo(String r){
     Reg_no=r;
 }
 public String get_RegNo(){
     return Reg_no;
 }
public String get_Assignment(){
    return ""+assignment;
}
public String get_Mid(){
    return " "+mids;
}
public String get_final(){
    return ""+final_marks;
}
public String get_QUIZ(){
    return " "+quiz;
}

}
