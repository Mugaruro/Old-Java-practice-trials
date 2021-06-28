package studentevaluation2;

public class TotalGrd 
{
    double ttl1;
    double ttl2;
    double ttl3;
    double ttl4;
    double ttl5;
    
    public char calcTotalGrd()
    {
    double ttl6=(ttl1+ttl2+ttl3+ttl4+ttl5);
    //System.out.println("The total results:"+ttl6);
        
   if (ttl6 < 40)
    {
        return 'F';
      }
    else if (ttl6 <55)
    {        
      return 'D';  
    }
    else if (ttl6 <60)
    {        
      return 'C';  
    }
    else if (ttl6 <70)
    {        
      return 'B';  
    }
    else if (ttl6<=100)
    {        
      return 'A';  
    }
    else 
    {        
       return '?';
    }
    
      }
    }

