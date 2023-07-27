
public class LaunchAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]= {20,10,30,40};
		int key=50;
		
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("Key found in collection at index" + i);
				System.exit(0);
			}
			
		}
		System.out.println("key not found");
		
	}

}
