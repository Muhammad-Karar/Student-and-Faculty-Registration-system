
package assigmnetoop;


public class Graduate extends StudentClass{
    protected int thesis;
    Graduate(){};
    Graduate(String Name,String CNIC,String Address,String Phone_num,String email_address,String date_of_birth,int age,String Reg_no,String Father_name,String Class,String Section,double quiz,double assignment,double mids,double final_marks,int thesis){
        super(Name,CNIC,Address,Phone_num,email_address,date_of_birth,age,Reg_no,Father_name,Class,Section,quiz,assignment,mids,thesis);
        this.thesis=thesis;
    }
    public void marks(){
        super.marks();
        System.out.println("Enter 1 if thesis pass press 2 if thesis is fail");
       thesis= S1.nextInt();       
    }
    public void calculateCgpa(){
        if(thesis==1){
        CGPA=quiz+assignment+mids+final_marks;
        System.out.println("CGPA of gratude student is="+CGPA);}
        else if(thesis==2){
            System.out.println("YOU ARE FAIL"+CGPA);   
        }
        else
            System.out.println("SELECT CORRECT OPTION");
            
        
    }
}
