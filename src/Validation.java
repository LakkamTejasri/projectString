import java.util.Scanner;


public class Validation {


	public static void main(String[] args) {
		int i=0;
		String s="lakkamtejasri@@gmail.com";
		String[] a=s.split("@");
		if(a.length==2)
		{
			System.out.println("accepted");
			String[] ss=a[1].split("\\.");
			if(ss.length==2)
			{
				if(a[0].length()>=5 && ss[0].length()>=5 && ss[1].length()>=3)
				{
				System.out.println("accepted");
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
		else
		{
			System.out.println("not accepted");
		}
		
			
		}
			
		}
