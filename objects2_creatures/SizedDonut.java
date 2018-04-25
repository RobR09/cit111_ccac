/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author robert.randig
 */
public class SizedDonut {
     public String name;
     public int SizeInmm;
     
     
     private int percRemaining = 100;
     
     public void simulateEating(int percentEaten){
         percRemaining = percRemaining - percentEaten;
         
     }
    
    public int getPercRemaining(){
        return percRemaining;
        
    }
    
    
    
    
}
