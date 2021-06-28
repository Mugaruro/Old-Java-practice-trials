/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentevaluation2;

/**
 *
 * @author Mugaruro
 */
public class Entrep
{
     double assignment1Entrep;
    double assignment2Entrep;
    double cat1Entrep;
    double cat2Entrep;
    double MainExamEntrep;
    
    public char calcTotalEntrep()
    {
        double ttl3=(assignment1Entrep+assignment2Entrep+cat1Entrep+cat2Entrep+MainExamEntrep);
        
        
    if (ttl3 < 50.0)
    {
        return 'F';
      }
    else if (ttl3 <60.0)
    {        
      return 'D';  
    }
    else if (ttl3 <70)
    {        
      return 'C';  
    }
    else if (ttl3<80)
    {        
      return 'B';  
    }
    else if (ttl3<=100)
    {        
      return 'A';  
    }
    else 
    {        
       return '?';
    }
}
}
