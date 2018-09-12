import java.util.Scanner;


public class NameValidation {


	public static void main(String[] args) {
		String s="Teju";
		//s.contains(new String("abc"));
		
		
		if(s.length()>=3)
		{
			if(s.charAt(0)>=65 && s.charAt(0)<=97) 
			{
			if(s.indexOf("a")==-1 || s.indexOf("e")==-1 || s.indexOf("i")==-1 || s.indexOf("o")==-1 || s.indexOf("u")==-1 || s.indexOf("y")==-1 )
				
				{
		             System.out.println("valid");
			    }
		
				else
				{
					System.out.println("not valid");
				}
			}
			else
			{
				System.out.println("not");
			}
			}
		else
		{
			System.out.println("not");
		}
		}
}
		
		
	



