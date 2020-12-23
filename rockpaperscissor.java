import java.io.*;
import java.util.*;
public class rockpaperscissor {
    public static void main (String args[]){
        System.out.println("Rock Paper Scissors Game");
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int computer=rand.nextInt(2);
        System.out.println("Choose rock, paper or scissors. For rock choose 0, for paper choose 1, for scissors choose 2. ");
        int human=sc.nextInt();
        if(((human==0)&&(computer==0))||((human==1)&&(computer==1))||((human==2)&&(computer==2))){
            System.out.println("The computer chose " +computer +" \nTie");
        }
        else if(((human==0)&&(computer==2))||((human==2)&&(computer==1))||((human==1)&&(computer==0))){
            System.out.println("The computer chose " +computer +"\nYou won! Congratulations!");
        }
        else if(((human==2)&&(computer==0))||((human==1)&&(computer==2))||((human==0)&&(computer==1))){
            System.out.println("The computer chose" +computer +"\nYou lost! Sorry!");
        }
        else{
            System.out.println("Invalid choice");
        }
    }
    
}
