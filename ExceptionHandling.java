package day9;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]=new int[5];
		System.out.println("start from chenni");
		System.out.println("75 kms completed");
		System.out.println("100 kms completed");
		try
		{
			
		
		System.out.println(1/1);
		System.out.println("welcome to java programmig");
		
		a[2]=22;
		System.out.println("welcome to exception handling");
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("do not give zero");
		}
		catch(ArrayStoreException ex)
		{
		System.out.println("150 kms completed");
		System.out.println("175 kms completed");
		System.out.println("200 kms completed");
		
	}
	}
}
