import java.io.*;
import java.util.*;
import java.net.*;
public class adventuregame{
    public static void main(String[] args) throws Exception  {
        System.out.println("Welcome to my game ");
        System.out.println("What is your name?");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("What is your age?");
        int age=sc.nextInt();
        System.out.println("Hello " +name+ " you are " +age );
        System.out.println("Would you like to play this game or not? yes/no");
        Scanner in=new Scanner(System.in);
        String answer = new String();
        if((answer=in.nextLine()).equals("yes")){
            System.out.println("Great! Would you like to go left or right? left/right");
            String choice=new String();
            if((choice=in.nextLine()).equals("left")){
                System.out.println("you fell in the gutter, you lost!");
            }
            else{
                System.out.println("Great! you entered a cave, you see a lion, would you like to or run? attack/run");
                String response;
                if((response=in.nextLine()).equals("attack")){
                    System.out.println("Do you need a gun or a sword for attacking? gun/sword");
                    String weapon=new String();
                    if((weapon=in.nextLine()).equals("gun")){
                        System.out.println("Great! You killed the lion. Do you need money or food as reward? money/food");
                        String reward=new String();
                        if((reward=in.nextLine()).equals("food")){
                            System.out.println("Great! you survived in the forest with this food! You wonthe game! Congratulations!");
                        }
                        else{
                            System.out.println("Bad choice! what would anyone do with money in the forest? haha, you lost!");
                        }
                    }
                    else{
                        System.out.println("What made you think you could defeat a ion with a sword? You lost!");
                        
                    }
                    
                
                    
                }
                else{
                    System.out.println("Would you like to swim across the river or climb a mountain? swim/climb");
                    String mode=new String();
                    if((mode=in.nextLine()).equals("swim")){
                        System.out.println("The sharks in the river ate you! You lost!");
                    }
                    else{
                        System.out.println("You fell from the mountain because there was an earthquake, you lost!");
                    }
                }
            } 
        
        }
        else{
            System.out.println("Too bad"); 
    }
    sc.close();
    in.close();;

}
}
    