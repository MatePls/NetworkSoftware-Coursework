/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.system;

import java.util.Scanner;

/**
 *
 * @author w1549523
 */


public class PayrollSystem {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       GetData();

        
         System.out.println("Mate it work");
        
    }
    public static int GetData(){
    Scanner GetData = new Scanner(System.in);
    //System.in.useDelimter("[^A-Za-z]+");
    int choice;
         
       System.out.println(" Enter 1 to register a new employee\n Enter 2 to show Full Time Employees\n Enter 3 to show Part Time Employees");
       choice =GetData.nextInt();
       if (choice > 3  && choice < 0){
       throw new IllegalArgumentException("Please enter a number between 1-3 to choose from the menu");
       }
       else {
       switch (choice)
        {
            case 1: System.out.println( "You entered 1");
            break;
                
            case 2: System.out.println("You Entered 2");
            break;
            
            case 3: System.out.println("You entered 3");
            break;
            
            default: System.out.println("Congrats you've messed up a simple number entry");
        }
        return choice ;
        
}
}
}
    

