/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentevaluation2;

/**
 *
 * @author Mugaruro
 */
public class WebDev 
{
     double assignment1WebDev;
    double assignment2WebDev;
    double cat1WebDev;
    double cat2WebDev;
    double MainExamWebDev;
    
    
    /* public WebDev (double a1, double a2, double c1, double c2, double M1)
    {
        assignment1WebDev=a1;
        assignment2WebDev=a2;
        cat1WebDev=c1;
        cat2WebDev=c2;
        MainExamWebDev=M1;
    } */
    
    
    public char calcTotalWebDev()
    {
        double ttl2=(assignment1WebDev+assignment2WebDev+cat1WebDev+cat2WebDev+MainExamWebDev);
        
        
    if (ttl2 < 50.0)
    {
        return 'F';
      }
    else if (ttl2 <60.0)
    {        
      return 'D';  
    }
    else if (ttl2 <70)
    {        
      return 'C';  
    }
    else if (ttl2 <80)
    {        
      return 'B';  
    }
    else if (ttl2<=100)
    {        
      return 'A';  
    }
    else 
    {        
       return '?';
    }
}
}
