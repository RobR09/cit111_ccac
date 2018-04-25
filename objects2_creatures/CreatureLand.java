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
public class CreatureLand {
    public static void main (String[]args){
       
   
        Creature turtle;
        turtle = new Creature();
        turtle.name = "George";
        turtle.species = "sea turtle";
        turtle.ID = 300;
        turtle.type = "cinnamon";
        
        turtle.setsizeLimit(50);
        turtle.setBiteSizeInPerecent(15);
        
        SizedDonut donutForTurtle = new SizedDonut();
        donutForTurtle.name = "George";
        donutForTurtle.SizeInmm = 56; 
        
       
        turtle.eatDonut(donutForTurtle);
         
        System.out.println("Donut left for Turtle: " + donutForTurtle.getPercRemaining());
        
    }
    
    
}
