import java.util.Scanner;

public class LaunchArr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scan=new Scanner(System.in);
		
		
		int[][]arr=new int[3][4];
		
		
		
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
