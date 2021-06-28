/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package replacing;

/**
 *
 * @author Mugaruro
 */
public class Replacing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ();
        
        int first = 23;
        int second = 34;
        int third;
        
        third = second;
        second = first;
        first = third;
        
        System.out.println ("first=" +first + "second=" +second); //"third=" +third);
        
        
    }
}
