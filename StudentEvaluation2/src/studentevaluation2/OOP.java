/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentevaluation2;

/**
 *
 * @author Mugaruro
 */
public class OOP
{
     double assignment1OOP;
    double assignment2OOP;
    double cat1OOP;
    double cat2OOP;
    double MainExamOOP;
    
    /* public OOP (double a1, double a2, double c1, double c2, double M1)
    {
        assignment1OOP=a1;
        assignment2OOP=a2;
        cat1OOP=c1;
        cat2OOP=c2;
        MainExamOOP=M1;
    } */
    
    public char calcTotalOOP()
    {
        double ttl1=(assignment1OOP+assignment2OOP+cat1OOP+cat2OOP+MainExamOOP);
        
        
    if (ttl1 < 50.0)
    {
        return 'F';
      }
    else if (ttl1 <60.0)
    {        
      return 'D';  
    }
    else if (ttl1 <70)
    {        
      return 'C';  
    }
    else if (ttl1 <80)
    {        
      return 'B';  
    }
    else if (ttl1<=100)
    {        
      return 'A';  
    }
    else 
    {        
       return '?';
    }
}
}
