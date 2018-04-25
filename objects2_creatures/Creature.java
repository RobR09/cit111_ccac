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
public class Creature {
    public String name;
    public String species;
    public int ID;
    public String type;
    
    
    
    
    
    
    
    private int biteSizeInPercent;
    private int numBitesTaken = 0;
    private int sizeLimit;
    
    public int eatDonut(SizedDonut donutToEat){
        donutToEat.simulateEating(biteSizeInPercent);
        numBitesTaken = numBitesTaken + 1;
        return numBitesTaken;
        
        
    }
            
    public int getSizeLimit(){
        
        return sizeLimit;
        
    }
    
    public void setsizeLimit( int sizelimit){
        
        this.sizeLimit = sizelimit;
        
    }
    
    public int getNumBitesTaken(){
        return numBitesTaken;
        
    }
    
    public int getBiteSizeInPercent(){
        
        return biteSizeInPercent;
        
    }
    
    public void setBiteSizeInPerecent(int biteSizeInPercent){
      if(biteSizeInPercent < 0 ){
          System.out.println("Cannot set bite size under zero");
          
      }
        this.biteSizeInPercent = biteSizeInPercent;
      
      
        
    }
    
}
