class Q25   //static block will be exexcuted first;
{
	static
	{
		System.out.println("Static block");
	
	}
	
	static void display()
	{
		System.out.println("Static method");
	
	}

	
	public static void  main(String args[])
	{
		display();
	
	
	
	}

}

/*

OUTPUT:

Static block
Static method


*/