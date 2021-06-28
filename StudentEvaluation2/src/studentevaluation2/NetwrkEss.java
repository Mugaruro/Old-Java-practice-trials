/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentevaluation2;

/**
 *
 * @author Mugaruro
 */
public class NetwrkEss
{
     double assignment1NetwrkEss;
    double assignment2NetwrkEss;
    double cat1NetwrkEss;
    double cat2NetwrkEss;
    double MainExamNetwrkEss;
    
    
    public char calcTotalNetwrkEss()
    {
        double ttl4=(assignment1NetwrkEss+assignment2NetwrkEss+cat1NetwrkEss+cat2NetwrkEss+MainExamNetwrkEss);
        
        
    if (ttl4 < 50.0)
    {
        return 'F';
      }
    else if (ttl4 <60.0)
    {        
      return 'D';  
    }
    else if (ttl4 <70)
    {        
      return 'C';  
    }
    else if (ttl4<80)
    {        
      return 'B';  
    }
    else if (ttl4<=100)
    {        
      return 'A';  
    }
    else 
    {        
       return '?';
    }
}
}
