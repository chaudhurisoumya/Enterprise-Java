
@FunctionalInterface
interface Alpha1
{
	void beta();
}


public class AnonyInner {

	public static void main(String[] args) {
		
          Alpha1 a= new Alpha1(){
        	  
        	  public void beta()
        	  {
        		  System.out.println("Beta implemention ");
        	  }
          };
          a.beta();
          
	}

}
