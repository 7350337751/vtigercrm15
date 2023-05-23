import java.util.Scanner;
class strongno
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
	    int num=sc.nextInt();
	    int sum=0;
		int z=num;
	
		while(num>0)
		{
			int s=1;
			int fact=1;
			int b=num%10;
			num/=10;
			while(s<=b)
			{
				fact=fact*s;
				s++;
			}
			sum=sum+fact;
		}
		if(z==sum)
		System.out.println("strong");
		else
			System.out.println("not strong");
	}
	    
	}
	

