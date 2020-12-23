package day1;

import java.io.*;
import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=x-2;i++){
            a=b+a;
            System.out.println(a);
            b=b+a;
            System.out.println(b);
            i++;


        }
    }
}