
import java.util.*;

public class Prog2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=10,max=0,count=0;
		int arr[]=new int[n];
		System.out.println("Enter 10 elements of array : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>max){
				max=arr[i];count=0;
			}
			if(arr[i]==max)
				count++;
		}
		System.out.print(count);
	}
}