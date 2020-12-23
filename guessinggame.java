import java.io.*;
import java.util.*;
public class guessinggame {
    public static void main(String[] args) {
        System.out.println("Welcome to my guessing game! Enter your guess between 0 and 10:");
        Scanner sc= new Scanner(System.in);
        Random rand=new Random();
        int ans=rand.nextInt(10);
        int guess=sc.nextInt();
        if(guess==ans){
            System.out.println("Congratulation! Your guess is correct!");
            System.out.println("The computer's guess is " +ans);
        }
        else if(guess<ans){
            System.out.println("Your guess is too low!");
            System.out.println("The computer's guess is " +ans);
        }
        else if(guess>ans){
            System.out.println("Your guess is too high!");
            System.out.println("The computer's guess is " +ans);
        }
        else{
            System.out.println("Invalid guess");
            System.out.println("The computer's guess is " +ans);
        }
    }
    
}
