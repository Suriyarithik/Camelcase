# Camelcase
import java.util.Scanner;
public class Camelcase
{
public static void main(String[] args) 
{
		Scanner s=new Scanner(System.in);
		System.out.println("Entre the string");
		String str=s.next();
		String str1[]=str.split(" ");
	    char ch1=str.charAt(0);
	    char ch12=str1[0].charAt(0);
	    if((Character.isUpperCase(ch1))&&(Character.isUpperCase(ch12)))
      {
	    	System.out.println("The string is camel case");
	    }
      else
      {
	    	System.out.println("The string is not a camel case");
	    }
	}
}
