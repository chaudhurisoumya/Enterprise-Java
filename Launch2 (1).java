


class Telusko
{
	public static void disp()
	{
	    System.out.println("telusko is parent");
	}
}

class Alien extends Telusko
{
	
	
	
	public static void disp()
	{
		System.out.println("Alien is telusko");
	}
}

public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien a=new Alien();
		a.disp();
		Telusko t=new Alien();
		t.disp();

	}

}
