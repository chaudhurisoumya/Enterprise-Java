import java.util.Scanner;

public class LaunchAr {

	public static void main(String[] args) 
	{
	         int []a=new int[5];
	         System.out.println(a.length);
	         
	         Scanner scan=new Scanner(System.in);
	         
	         for(int i=0; i<a.length;i++)
	         {
	        	 System.out.println("Please enter the marks of Student " + i);
	        	 a[i]=scan.nextInt();
	         }
	        
              System.out.println("the marks of students are as follows");
              
              for(int i=0;i<a.length;i++)
              {
            	  System.out.print(a[i] +" ");
              }

	}

}
