package day1;
import java.io.*;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int result=1;
        for(int i=1;i<=x;i++){
            result=i*result;
            

        }
        System.out.println(result);
    }
    
}
