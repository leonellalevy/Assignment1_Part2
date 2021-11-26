/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;
import java.util.Scanner;
/**
 *
 * @Leonella Levy Martel
 */
public class BirthYearCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Create a new Scanner object
    Scanner keyboard= new Scanner(System.in); 
    //Ask the birth year to the user
    System.out.print("Please input a birth year: ");
    //Read the web address input by user
    String BirthYear = keyboard.nextLine();
    //Extract the two first digit 
    String century = BirthYear.substring(0,2);
    //Convert the two first digit to a number and convert it to the century
    int century1 = Integer.parseInt(century)+1;
    //Convert the third digit for decade
    String decade = BirthYear.substring(2,3)+0;
    {
    //Output the brith year
    System.out.printf("Birth Year\t: %s %n",BirthYear);
    //Output the century
    System.out.printf("Century\t\t: %s %n",century1);
    //Output the decade
    System.out.printf("Decade\t\t: %s %n",decade);
    }
    }   
}
