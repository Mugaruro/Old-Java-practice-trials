/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentevaluation2;

/**
 *
 * @author Mugaruro
 */
public class SoftEng 
{
     double assignment1SoftEng;
    double assignment2SoftEng;
    double cat1SoftEng;
    double cat2SoftEng;
    double MainExamSoftEng;
    
    
     public char calcTotalSoftEng()
    {
        double ttl5=(assignment1SoftEng+assignment2SoftEng+cat1SoftEng+cat2SoftEng+MainExamSoftEng);
        
        
    if (ttl5 < 50.0)
    {
        return 'F';
      }
    else if (ttl5<60.0)
    {        
      return 'D';  
    }
    else if (ttl5<70)
    {        
      return 'C';  
    }
    else if (ttl5<80)
    {        
      return 'B';  
    }
    else if (ttl5<=100)
    {        
      return 'A';  
    }
    else 
    {        
       return '?';
    }
}
}
