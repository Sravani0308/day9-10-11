package day11;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="apple";//aple
		String s1="";
		for(int i=0;i<name.length();i++)
		{
			char ch =name.charAt(i);
			s1=s1+ch;//append the character from name to s1 variable
			System.out.println("s1 "+s1);
			name=name.replace(ch, ' ');//
		}
	}

}
   