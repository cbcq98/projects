package airplaneProject;

import java.util.*;

public class airplaneMenu {
   Scanner reader = new Scanner(System.in);
   airplane plane = new airplane();
  
   public void stage1(){
       System.out.println("1) Add 2) Show 3) Quit");
       String input = reader.nextLine();
       if(input.equalsIgnoreCase("1")){
           stage2();
       }else if(input.equalsIgnoreCase("2")){
           plane.printSeats();
       }else if(input.equalsIgnoreCase("3")){
           System.exit(0);
       }else{
           System.out.println("Invalid Input");
       }
   }
  
   public void stage2(){
       while(true){
           System.out.println("1) First 2) Economy");
           String input = reader.nextLine();
           if(input.equalsIgnoreCase("1")){
               stage3(2);
               break;
           }else if(input.equalsIgnoreCase("2")){
               stage3(3);
               break;
           }
           System.out.println("Invalid input, try again.");
       }
      
   }
 
   public void stage3(int cls){
      
       while(true){
           System.out.println("Passengers? (1-" + cls + ")");
           int input = reader.nextInt();
           reader.nextLine();//consume
           if(input == cls){
               plane.findSeats(input,cls,1);
               break;
           }else if(input > 0 && input < cls){
               stage4(cls, input);
               break;
           }else{
               System.out.println("Invalid input, try again");
           }
       }
   }
  
   public void stage4(int cls, int pass){
      
       while(true){
           if(cls==2)
               System.out.println("1) Aisle 2) Window");
           else
               System.out.println("1) Aisle 2) Center 3) Window");
           String input = reader.nextLine();
           if(input.equalsIgnoreCase("1")){
               if(cls == 2){
                   plane.findSeats(pass,cls,2);
                   break;
               }
               plane.findSeats(pass,cls,3);
               break;
           }else if(input.equalsIgnoreCase("2")){
               plane.findSeats(pass,cls, 2);
               break;
           }else if(input.equalsIgnoreCase("3")){
               plane.findSeats(pass,cls,1);
               break;
           }else{
               System.out.println("Invalid input, try again");
           }
       }
      
   }

}