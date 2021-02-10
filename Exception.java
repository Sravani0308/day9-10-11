package day9;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start from chenni");
		System.out.println("75 kms completed");
		System.out.println("100 kms completed");
		try
		{
			
		
		System.out.println(1/0);
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("do not give zero");
		}
		System.out.println("150 kms completed");
		System.out.println("175 kms completed");
		System.out.println("200 kms completed");
		
	}

}
