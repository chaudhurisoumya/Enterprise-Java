import java.util.Scanner;

public class LaunchArr1 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		
		int[][]arr=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[3];
		
		
		   for(int i=0; i<arr.length;i++)
		   {
			   for(int j=0;j<arr[i].length;j++)
			   {
				   System.out.println("Enter marks of class "+i + " Student "+j);
				   arr[i][j]=scan.nextInt();
			   }
		   
		   }
		   System.out.println("Marks of students are");
		   for(int i=0; i<arr.length;i++)
		   {
			   for(int j=0;j<arr[i].length;j++)
			   {
				   System.out.print(arr[i][j] + " ");
				   
			   }
			   System.out.println();
		   }
		   
	}

}
	
