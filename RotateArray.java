import java.util.*;
class RotateArray
{
	public void rotate(int nums[],int k)
	{
		int n = nums.length;
		k = k % n;
		for(int i=0;i<k;i++)
		{
			int last = nums[n-1];
			for(int j=n-1;j>0;j--)
			{
				nums[j] = nums[j-1];
			}
			nums[0] = last;
		}
	}
	public static void main(String arg[])
	{
		RotateArray ars = new RotateArray();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		ars.rotate(nums,k);
		for(int i=0;i<n;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
}

