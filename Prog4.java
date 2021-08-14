
import java.io.*;
import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		int Num,f=1;
		Scanner sc=new Scanner(System.in);
		Num=sc.nextInt();
		for(int i=1;i<=Num;i++)
		{
			f=f*i;
		}
		System.out.println(f);

	}

}