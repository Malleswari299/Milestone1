
import java.io.*;
import java.util.Scanner;
public class Prog5 {
    public static void main(String[] args) {
        int i,sum=0,N;
        float average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers to find the average:");
        for(i=0;i<10;i++){
            N=sc.nextInt();
            sum=sum+N;
        }
        average=sum/(float)10;
        System.out.println("The average of 10 numbers "+"is "+average);
    }
}