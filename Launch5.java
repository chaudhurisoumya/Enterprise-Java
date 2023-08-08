

interface Telusko
{
	void disp();
	static void show()
	{
		System.out.println("Iam static method of an interface");
	}
	//Java 9
	
	private void shock()
	{
		System.out.println("I m private");
	}
}


public class Launch5 {

	public static void main(String[] args) {
		
     Telusko.show();
	}

}
