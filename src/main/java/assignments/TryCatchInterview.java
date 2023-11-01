package assignments;

public class TryCatchInterview {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
				try {
				System.out.println("4");
				System.out.println(a/b);
				System.out.println("6");
					}
				catch(NullPointerException n)
					{
				System.out.println("7");
					}
				finally
					{
				System.out.println("8");
					}
				System.out.println("9");
					}
		catch(ArithmeticException e)
		{
			System.out.println("10");
		}
		finally 
		{
			System.out.println("11");
		}
			System.out.println("12");
	}
}
