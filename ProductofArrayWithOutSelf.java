import java.util.*;
public class ProductofArrayWithOutSelf
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int p=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					p = p * arr[j];
				}
			}
		}
		System.out.println(p);
		sc.close();
	}
}
