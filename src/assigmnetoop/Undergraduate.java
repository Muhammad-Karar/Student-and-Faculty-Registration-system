
package assigmnetoop;


public class Undergraduate extends StudentClass {
    protected double fyp_marks;
    Undergraduate(){};
    Undergraduate(String Name,String CNIC,String Address,String Phone_num,String email_address,String date_of_birth,int age,String Reg_no,String Father_name,String Class,String Section,double quiz,double assignment,double mids,double final_marks,double fyp_marks){
        super(Name,CNIC,Address,Phone_num,email_address,date_of_birth,age,Reg_no,Father_name,Class,Section,quiz,assignment,mids,final_marks);
       this.fyp_marks=fyp_marks;
         }
    public void marks(){
        super.marks();
        System.out.println("enter your fyp marks=");
       fyp_marks= S1.nextDouble();
    }
    public void calculateCgpa(){
        CGPA=quiz+assignment+mids+final_marks+fyp_marks;
        System.out.println("CGPA OF UNDERGRATUDE STUDENT IS="+CGPA);
      
    }

  public String get_Fyp(){
      return ""+fyp_marks;
      
  }
    
    
}
