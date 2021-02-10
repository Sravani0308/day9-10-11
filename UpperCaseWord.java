package day11;

public class UpperCaseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="hello iam in bangalore";
		String arr[]=st.split("\\name");
		for(String name:arr)
		{
			String first =name.substring(0,1).toUpperCase();
			String remaining=name.substring(1);
			System.out.println(first+remaining +" ");
			
		}
	}

}
