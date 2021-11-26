/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaddressextractor;
import java.util.Scanner;
/**
 *
 * @Leonella Levy Martel
 */
public class WebAddressExtractor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    //Create a new Scanner object
    Scanner keyboard= new Scanner(System.in); 
    //Ask the web address to the user
    System.out.print("Please input a web address: ");
    //Read the web address input by user
    String adress = keyboard.nextLine();
    //Return the lowercase of the web address
    String adress1 = adress.toLowerCase();
    {
        int k = adress1.indexOf('.');
        int g = adress1.lastIndexOf('.');
        //Separate the heading of the address
        String heading = adress1.substring(0,k);
        //Separate the company name of the address
        String company = adress1.substring(k+1,g);
        //Separate the extension of the address
        String extension = adress1.substring(g+1);
    {
    //Output the web address
    System.out.printf("Address \t: %s %n",adress1);
    //Output the heading
    System.out.printf("Heading \t: %s %n",heading);
    //Output the company name
    System.out.printf("Company \t: %s %n",company);
    //Output the extension
    System.out.printf("Extension\t: %s %n",extension);
    }
    }
    }
}
