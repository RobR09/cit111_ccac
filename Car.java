/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Rob Randigs PC
 */
public class Car {
    
 public String make;
    public String model; 
     
    public int tripmiles; 
    private int totalmilesdriven; 
    public int enginelifepercent  ; 
   public double currenttreadlife = 74; 
   public double maxtreadlife = 100;
    public double treadlifepercent;
    
    
      public void driveCar(int tripmiles){
          totalmilesdriven = tripmiles + totalmilesdriven; 
           if(totalmilesdriven >= 8000  ) { 
               System.out.println("Its time for the First service of the car!");
               
          } else{ 
               System.out.println("If you dont get a service @ 8,000 miles you run the risk of damage");
           }// close else/if
           
           if(totalmilesdriven >= 30000 ){
               System.out.println("You`ve driven more than 30,000 miles. Sorry your warranty is over.");
           }else{
               System.out.println("You have not driven more than 30,000 you still have a warranty!");
           }// close if/else
           
           
          
      }//close drivecar
      
      public int getEngineLifepercent ( ){
          enginelifepercent= 100- ((20000/10000)*15);
          
          return enginelifepercent; 
          
        
                  
          
          
      }//close getenginelifepercent
      
      public double  getTreadLifePercent (){
      
      treadlifepercent = currenttreadlife/maxtreadlife; 
      
      return  treadlifepercent;
      
      }//close gettreadlifepercent
      
      
          
          
          
    
      
      
      
      
      
}// close car
