import java.util.*;
class student  {
    String name;
    String department ;
    String year;
    String acadamicyear;

    student(String name,String department,String year,String acadamicyear) {
     this.name= name;
     this.department=department;
     this.year=year;
     this.acadamicyear=acadamicyear;
}
    
    void studentdetails(){
        System.out.println("Name : "+name);
        System.out.println("Department  : "+department);
    }
    void yeardetails(){
        System.out.println("Year : "+year);
        System.out.println("Acadamic Year  :  "+acadamicyear);
        System.out.println("                  ");
    }
}
public class project_1_student_management_system{
    public static void main (String [] args){
        // bike sales report system 
        Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         sc.nextLine();
        
        for(int i=0 ;i<n;i++)
        {
             String clg = sc.nextLine();
         String[] college = clg.split(",");
         student details = new student(college[0],college[1],college[2],college[3]);
        System.out.println("Enter the student ID: 411625000"+(i+1));

        details.studentdetails();
        details.yeardetails();
        }
        sc.close();
          }
}