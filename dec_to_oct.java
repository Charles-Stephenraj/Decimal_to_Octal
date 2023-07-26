import java.util.*;
public class dec_to_oct
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int a[]=new int[n];
		ArrayList<Integer> a=new ArrayList<Integer>();
		int j=0;
		while(n>0)
		{
			a.add(n%8);
			n=n/8;
		}
		for(int i=a.size()-1;i>=0;i--)
		{
			//System.out.println("ndub");
			System.out.println(a.get(i));
		}
	}
}