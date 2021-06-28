/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package microsoft;

/**
 *
 * @author Mugaruro
 */
public class Employees 
{
 double Salary;
 double profits;
 double bonus;
 double commission; 
 
 void EmployeetotalSalary()
 {
     double totalSalary= Salary+profits+bonus+commission;
     System.out.println("totalSalary" +totalSalary);
 }
}
