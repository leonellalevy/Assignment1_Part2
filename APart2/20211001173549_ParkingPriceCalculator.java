/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingpricecalculator;
import java.util.Scanner;
/**
 *
 * @Leonella Levy Martel
 */
public class ParkingPriceCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Create a new Scanner object
    Scanner keyboard= new Scanner(System.in); 
    //Ask the number of minutes a car has parked to the user
    System.out.print("Please input the number ");
    System.out.print("of minutes your car has parked: "); 
    //Read the number of minutes input by user
    double minutes = keyboard.nextDouble();
    //Calculate the number of hours 
    double hours = Math.ceil(minutes/60);
    //Calculate the price
    double price = 2*hours;
    //Output the parking time in minutes
    System.out.printf("Parking time (minutes) \t: %.0f %n",minutes);
    //Output the parking time in hours
    System.out.printf("Parking time (hour)\t: %.0f %n",hours);
    //Output the price
    System.out.printf("Price\t\t\t: %.2f %n", price);
    } 
}
