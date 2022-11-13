class Q11
{	
	//int i;
	
	public static void main(String args[])
	{
		
		for(char i='G'; i>'A';i--)
		{
			for (char j='A';j<i;j++)
			{
				System.out.print(j+" ");
				
			
			}
			System.out.println();
		
		}
		
		for(char i='A'; i<'G';i++)
		{
			for (char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
				
			
			}
			System.out.println();
		
		}
	
	
	}

}

/*

OUTPUT:
A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F
*/