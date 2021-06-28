/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salary.employee;

/**
 *
 * @author Mugaruro
 */
public class Employee 
{
    double salary;
    double bonus;
    
    void calculateTotalPay()
    {
       double   totalPay=salary + bonus;
        System.out.println("totalPay"+totalPay);
    }
}
