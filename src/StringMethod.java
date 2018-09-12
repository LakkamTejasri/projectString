
public class StringMethod {



	public static void main(String[] args) {
		String s=new String("teju");
		String s1="teju";
		String s2=" 32";
		String s3="sudheer";
		
		//remove the first and spaces
		
		String e=s1.trim();
		System.out.println(e);
		//to add the two strings
		
		//String rs=s1.concat(s2);
		String rs=s1+s2;
		System.out.println(rs.trim());
		
		//find the length of a String
		int str=s1.length();
		System.out.println(str);

    	//find index of a string
	   int ss=s3.indexOf('e');
       System.out.println(ss);
       
       //replays charectars
       String t=s.replace('t','u');
       System.out.println(t);
       //covert the lower lower case
       String w=s3.toUpperCase();
       System.out.println(w);
          
      String q=s3.substring(2,5);
      System.out.println(q);
      
      //convert the char array
      char[] a=s3.toCharArray();
      System.out.println(a);
      
       if(s.equals(s2))//(s==s1)
		{
			System.out.println("ture");
		}
		else
		{
			System.out.println("false");
		}
		if(s1==s2)
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
		if(s.equals(s1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
