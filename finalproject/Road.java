/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author robert.randig
 */
public class Road {
    
public static void main (String[]args){
        
   Car car1;
   car1 = new Car ();
   car1.make = "Mercedes Benz";
   car1.model= "GTR"; 
   
   car1.driveCar(10000); 
    
    
    System.out.println(" Whats the make of the car again? " + car1.make );
    System.out.println(" Whats the model of the car again? " + car1.model );
     
    System.out.println(" The current engine life for this car is: " + car1.getEngineLifepercent ( ) );
    System.out.println(" The current tread life for this car is: " + car1.getTreadLifePercent());
    
     
    
    
    
    
    }//close main



}//close road 
