class Q25
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j =i;j<=7;j++)
			{
				System.out.print(j+" ");
			}
			for(int k =1;k<i;k++)
			{
				System.out.print(k+" ");
				
			}
		 
	 
		
			System.out.println();
		}
	}
}	

/*

OUTPUT:

1 2 3 4 5 6 7
2 3 4 5 6 7 1
3 4 5 6 7 1 2
4 5 6 7 1 2 3
5 6 7 1 2 3 4
6 7 1 2 3 4 5
7 1 2 3 4 5 6

*/