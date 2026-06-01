class JaggedArray 
{
    public static void main(String[] args) 
   {

        int marks[][] = new int[3][];
	marks[0] = new int[]{90,92};
	marks[1] = new int[]{86,90,95};
	marks[2] = new int[]{83,86,90,94};
	for(int i=0;i<marks.length;i++)
	{
		System.out.println("Students " +(i+1)+ "marks:");
		for(int j=0;j<marks[i].length;j++)
		{
			System.out.print(marks[i][j]+" ");
		}
		System.out.println();
	}
   }
}
