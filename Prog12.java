
import java.io.*;
import java.util.Scanner;
public class Prog12 {
public static void main(String[] args) 
{
int i,m=0,flag=0;      
int number; 
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
m=number/2;      
if(number==0||number==1)
{  
System.out.println(number+" is not a prime number");      
}
else{  
for(i=2;i<=m;i++)
{      
if(number%i==0)
{      
System.out.println(number+" is not a prime number");      
flag=1;      
break;      
}      
}      
if(flag==0)  
{ System.out.println(number+" is a prime number");
}  
}  
}    
}