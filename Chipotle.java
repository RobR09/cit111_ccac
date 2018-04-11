/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.util.Random;

/**
 *
 * @author Rob Randig
 */
// used Kennywoodridetracker as a template
public class Chipotle {

  private static int totalBurritosordered = 0;
  private static int totalBowlsordered = 0;
  private static int totalTacosordered = 0;
  private static int totalCustomers = 0;
  
  public static void main(String[]args){
      System.out.println("***10:45 doors are open!***");
      System.out.println(" Welcome to Chipotle! ");
      displayordertotal();
  
  orderBurrito(2,2);
  displayordertotal();
  

  
  orderBowl(1,1);
  displayordertotal();
  
  
  orderTaco(3,15);
  displayordertotal();
  
  
  
   orderBurrito(3,3);
  displayordertotal();
  
 
  orderBowl(5,5);
  displayordertotal();
  
 
  
  orderTaco(10,50);
  displayordertotal();
  
  
  }// close main
  
  public static void orderBurrito(int Customers, int Burritos){
     totalCustomers = totalCustomers + Customers; 
     Random rand = new Random();
     int numBurritosordered = rand.nextInt(Customers);
     totalBurritosordered = totalBurritosordered + numBurritosordered;
  
  }// close orderBurrito
  
  public static void orderBowl(int Customers, int Bowls){
      totalCustomers = totalCustomers + Customers; 
     Random rand = new Random();
     int numBowlsordered = rand.nextInt(Customers);
     totalBowlsordered = totalBowlsordered + numBowlsordered;
        
  }//close orderBowl
      
  public static void orderTaco(int Customers, int Tacos){
      totalCustomers = totalCustomers + Customers; 
     Random rand = new Random();
     int numTacosordered = rand.nextInt(Customers);
     totalTacosordered = totalTacosordered + numTacosordered;
        
  }//close orderTaco
  
  
  public static void displayordertotal(){
      System.out.println("$$$OrderTotal$$$");
      System.out.println("Total Customers" + totalCustomers);
      System.out.println("Total Burritos Ordered" + totalBurritosordered);
      System.out.println("Total Bowls Ordered" + totalBowlsordered);
      System.out.println("Total Tacos Ordered" + totalTacosordered);
      
      
  }//close displayordertotal
  
             
  
  
             
  
  
  
  
  
  
  
  
  
  
  
  
}//close class
