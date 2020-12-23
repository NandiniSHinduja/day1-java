package day1;
import java.io.*;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a new number:");
        int x=sc.nextInt();
        int isprime=1;
        for(int i=2;i<x;i++){
            if(x%i==0){
                isprime=0;
                System.out.println("The given number is not a prime number");
                break;
            }
        }if (isprime==1){
            System.out.println("The given number is a prime number");
            }
    }
}
