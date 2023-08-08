import java.util.Scanner;

public class Stng2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		
		String s2="";
		for(int i=s1.length()-1;i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
