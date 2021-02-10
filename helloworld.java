package day11;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String name="hello iam in bangalore";
		String Firstletter=name.substring(0, 1).toUpperCase() ;
		String Secondletter=name.substring(6, 7).toUpperCase() ;
		String Thirdletter=name.substring(10, 11).toUpperCase() ;
		String Fourthletter=name.substring(13, 14).toUpperCase() ;
		
		System.out.println(Firstletter+Secondletter+Thirdletter+Fourthletter);
		System.out.println("");
	

	}

}
