package day1;
import java.io.*;
import java.util.*;
public class die {
    public static void main(String[] args) throws Exception {
    System.out.println("Press enter to roll the die:");
    int counter=0;
    Random rand=new Random();  
    int x; 
    do{
        System.in.read();
        x=rand.nextInt(6)+1;
        System.out.println("You entered " +x);
        counter++;
    }while(x!=6);
    
    System.out.println("It took you " +counter+ " times to get 6");
    }
    
}
