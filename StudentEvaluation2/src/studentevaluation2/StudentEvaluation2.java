package studentevaluation2;
import java.util.Scanner;

public class StudentEvaluation2 {

   
    public static void main(String[] args) 
    {
        //for(int s=1;s<=10;s++);
      
       //The first section of assignments  
      System.out.println("All Assignment 1 Results");
      Scanner keyboard = new Scanner(System.in);
      
      
      System.out.print("Please enter your assignment1 OOP score : ");
      double assignment1OOP= keyboard.nextDouble();
      if (assignment1OOP >5)
      {
          System.out.println("Not Valid");
      }
      
      System.out.print("Please enter your assignment1 Web Development score : ");
      double assignment1WebDev = keyboard.nextDouble();
       if (assignment1WebDev >5)
      {
          System.out.println("Not Valid");
      }
      
      System.out.print("Please enter your assignment1 Entreprenurship score : ");
      double assignment1Entrep = keyboard.nextDouble();
       if (assignment1Entrep >5)
      {
          System.out.println("Not Valid");
      }
      
      System.out.print("Please enter your assignment1 Netwrk Essentials score : ");
      double assignment1NetwrkEss = keyboard.nextDouble();
       if (assignment1NetwrkEss >5)
      {
          System.out.println("Not Valid");
      }
      
      System.out.print("Please enter your assignment1 Software Engineering score : ");
      double assignment1SoftEng =keyboard.nextDouble();
       if (assignment1SoftEng >5)
      {
          System.out.println("Not Valid");
      }
      
   // The second section of assignments    
      
      
      System.out.println("All Assignment 2 Results");
      System.out.print("Please enter your assignment2 OOP score : ");
      double assignment2OOP= keyboard.nextDouble();
      if (assignment2OOP >5)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your assignment2 Web Development score : ");
      double assignment2WebDev= keyboard.nextDouble();
      if (assignment2WebDev >5)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your assignment2 Entreprenurship score : ");
      double assignment2Entrep= keyboard.nextDouble();
      if (assignment2Entrep >5)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your assignment2 Network Essentials score : ");
      double assignment2NetwrkEss= keyboard.nextDouble();
       if (assignment2NetwrkEss >5)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your assignment2 SoftEng score : ");
      double assignment2SoftEng= keyboard.nextDouble();
       if (assignment2SoftEng >5)
      {
          System.out.println("Not Valid");
      }
      
      
      //The CATS listed 
      System.out.println("All CAT 1 Results");
      System.out.print("Please enter your cat1 OOP score : ");
      double cat1OOP= keyboard.nextDouble();
       if (cat1OOP>10)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your cat1 WebDev score : ");
      double cat1WebDev= keyboard.nextDouble();
       if (cat1WebDev>10)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your cat 1 Entrep score : ");
      double cat1Entrep= keyboard.nextDouble();
       if (cat1Entrep>10)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your cat1 NetwrkEss score : ");
      double cat1NetwrkEss= keyboard.nextDouble();
       if (cat1NetwrkEss>10)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your cat1 SoftEng score : ");
      double cat1SoftEng= keyboard.nextDouble();
       if (cat1SoftEng>10)
      {
          System.out.println("Not Valid");
      }
      
      //CAT 2 section starts here 
       System.out.println("All CAT 2 Results");
       System.out.print("Please enter your cat2 OOP score : ");
      double cat2OOP= keyboard.nextDouble();
       if (cat2OOP>10)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your cat2 WebDev score : ");
      double cat2WebDev= keyboard.nextDouble();
       if (cat2WebDev>10)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your cat2 Entrep score : ");
      double cat2Entrep= keyboard.nextDouble();
       if (cat2Entrep>10)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your cat2 NetwrkEss score : ");
      double cat2NetwrkEss= keyboard.nextDouble();
       if (cat2NetwrkEss>10)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your cat2 SoftEng score : ");
      double cat2SoftEng= keyboard.nextDouble();
       if (cat2SoftEng>10)
      {
          System.out.println("Not Valid");
      }
      
      
      //All main exam inputs 
      System.out.println("All Main Exam Results");
      System.out.print("Please enter your MainExam OOP score : ");
      double MainExamOOP= keyboard.nextDouble();
       if (MainExamOOP>70)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your MainExam WebDev score : ");
      double MainExamWebDev= keyboard.nextDouble();
        if (MainExamWebDev>70)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your MainExam Entrep score : ");
      double MainExamEntrep= keyboard.nextDouble();
        if (MainExamEntrep>70)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your MainExam NetwrkEss score : ");
      double MainExamNetwrkEss= keyboard.nextDouble();
        if (MainExamNetwrkEss>70)
      {
          System.out.println("Not Valid");
      }
      
       System.out.print("Please enter your MainExam SoftEng score : ");
      double MainExamSoftEng= keyboard.nextDouble();
        if (MainExamSoftEng>70)
      {
          System.out.println("Not Valid");
      }
      
      
      
      
    OOP Unit1;
    Unit1= new OOP();
    System.out.println("Your current grade on Object Oriented Programming is : "+Unit1.calcTotalOOP());
    
    WebDev Unit2;
    Unit2=new WebDev();
    System.out.println("Your current grade on Web Development is : "+Unit2.calcTotalWebDev());
    
    Entrep Unit3;
    Unit3=new Entrep();
    System.out.println("Your current grade on Entreprenurship Skills is : "+Unit3.calcTotalEntrep());
    
    NetwrkEss Unit4;
    Unit4= new NetwrkEss();
    System.out.println("Your current grade on Network Essentials is : "+Unit4.calcTotalNetwrkEss());
    
    SoftEng Unit5;
    Unit5= new SoftEng();
    System.out.println("Your current grade on Software Engineering is : "+Unit5.calcTotalSoftEng());
    
    TotalGrd StudentGrade;
    StudentGrade= new TotalGrd ();
    int addition;
    //System.out.println("Your Total Marks are: " +calcTotalGrd);
    System.out.println("Your current Overall Grade is : "+StudentGrade.calcTotalGrd());
   

}
}