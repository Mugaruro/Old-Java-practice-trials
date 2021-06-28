/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salary.employee;

/**
 *
 * @author Mugaruro
 */
public class SalaryEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Employee alex,linda,john;
        
        alex = new Employee();
        linda = new Employee();
        john = new Employee();
        
        alex.salary=90000;
        alex.bonus=20000;
        alex.calculateTotalPay();
        
        linda.salary=100000;
        linda.bonus=20000;
        linda.calculateTotalPay();
    }
}
