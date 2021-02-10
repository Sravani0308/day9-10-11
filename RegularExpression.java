package day11;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Matcher m=Pattern.compile("aaa").matcher("hiaaahelloaaathns");
while(m.find())
{
	System.out.println("hi");
	System.out.println(m.start() +" "+m.end()+" "+m.group());
	System.out.println("hello");
}
	}

}
  