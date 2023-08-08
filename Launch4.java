
interface Demo1
{
	void disp();
	default void show()
	{
		System.out.println("Hello i m in interface");
	}
}

class Alien implements Demo1
{
	public void disp()
	{
		System.out.println("implementing display");
	}
	public void show()
	{
		System.out.println("I have be overirded inchild");
		
	}
}


public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Demo1 d=new Alien();
		d.disp();
		d.show();
		
	}

}
