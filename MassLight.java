/****************************************************************************
 *
 * Created by: Perry Martin
 * Created on: Sept 2016
 * this program calculates the amount of energy created when changing mass 
 *  into energy   
 *
 ****************************************************************************/

import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    System.out.println("Enter mass in kilograms");
    
    Scanner input = new Scanner(System.in);
    
     final double speedOfLight = 2.998 * Math.pow(10,8);
     final double massInKg = input.nextDouble();
     
     final double energy = massInKg * Math.pow(speedOfLight,2);
     
     System.out.println();
     System.out.println("The energy output would be " + energy + "j of energy." );
     
   
