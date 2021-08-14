
import java.io.*;
import java.util.Scanner;
public class Prog1 {
public static void main(String[] args) {
int i,number=25;
Scanner sc=new Scanner(System.in);
int Array[];   
Array = new int[number];
		for(i=0;i<number;i++)
		{
		Array[i]=sc.nextInt();	
		}
   int max = Array[0];
        for (i = 1; i < number; i++){
            if (Array[i] > max)
                max = Array[i];
       
	}
System.out.println(max);
}
}