/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.util.Scanner;




/**
 *
 * @author robert.randig
 */
public class GreatestHockeyPlayers {
    
    public static void main (String[]args){
        //scanner object
        Scanner scanner = new Scanner (System.in);
    
        int jerseySelection;
        
System.out.println("WELCOME TO THE HOUSE OF G.O.A.T`S");
System.out.println("*** Choice your favorite hockey player from the list below ***");
        
System.out.println("  8888 77777   8888   9999 9999   9999  77777  ");    
System.out.println("  8  8     7   8  8   9  9 9  9   9  9      7  ");     
System.out.println("  8888    7    8888   9999 9999   9999     7   ");     
System.out.println("  8  8   7     8  8      9    9      9    7    ");     
System.out.println("  8888  7      8888      9    9      9   7     ");      

System.out.println("   CROSBY      OVI     GRETZKY      McDAVID    ");    
    
//jersry # that was selected from the user
    jerseySelection = scanner.nextInt();
    
 switch(jerseySelection){
     
     case 87: 
         printCrosby();
         break;
         
     case 8:
         printOvi();
         break;
         
    case 99:  
         printGretzky();
         break;
         
  case 97: 
      printMcdavid();
      break;
     } //close switch  
      }//close method GreatestHockeyPlayers
    
    public static void printCrosby(){
        System.out.println(" You Choose Crosby ");
        System.out.println("  Based on Crosby`s preformances he can enter the G.O.A.T house !!!! ");
    }//Close print Crosby
    
    public static void printOvi(){
        System.out.println(" You Chose Ovi ");
        System.out.println(" Based on stats Ovi can enter but since he has no Stanley Cups, he is not allowed to enter.");
        System.out.println(" Try again.");
        
        
    }//Close printOvi
    
    public static void printGretzky(){
        System.out.println(" You choose Wayne Gretzky ");
        System.out.println(" The Orginal G.O.A.T is always allowed to enter!!! ");
        
    }// Close printGretzky
    
    public static void printMcdavid(){
        System.out.println(" You Choose Connor Mcdavid ");
        System.out.println(" Sorry Connor is too young to be a G.O.A.T ");
        System.out.println(" Wait a few years and come bck and try again! ");
    }//Close printMcdavid
    
    
    
    
}//close main

