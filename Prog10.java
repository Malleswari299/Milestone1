
import java.util.*;

public class Prog10 {
	public static void main(String args[]){
		int p=21,q=36,r=66,ans=1;
		lcm l=new lcm();
		int pqr=l.findlcm(p,q,r);
		int arr[]=new int[p];Arrays.fill(arr, 0);
		int num=p;int lcm=pqr;
		for(int i=2;i<p&&p>1;i++){
			while((pqr%i)==0){
		    arr[i]++;pqr/=i;
			}
		}
		for(int i=2;i<num;i++){
			if(arr[i]%2!=0)
				ans*=i;
		}
		System.out.println("The least perfect square number the is divisible by 21,36,66 is: "+ans*lcm);
	}
}
class lcm{
	int gcd(int p, int q)
	{
	    if (q == 0)
	        return p;
	    return gcd(q, p % q);
	}
	int findlcm(int p, int q,int r)
	{
	    int ans = p;
	    ans = ((q * ans) /gcd(q, ans));
	    ans = ((r* ans) /gcd(r, ans));
	    return ans;
	}
	 
}