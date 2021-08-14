
import java.util.*;
public class Prog3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the level of pyramid : ");
		int n=sc.nextInt();
		int pos=1,space=n-1,num=1;
		while(pos<=n){
			for(int i=1;i<=space;i++)
				System.out.print(" ");
			for(int i=1;i<=pos;i++){
				if(num>9){
					num=num%9-1;
				}
				System.out.print(num);num++;
			}
			int rev=num-2;
			for(int i=1;i<pos;i++){
				if(rev<0){
					rev=9;
				}
				System.out.print(rev);rev--;
			}
			pos++;System.out.print("\n");space--;
		}
	}
}