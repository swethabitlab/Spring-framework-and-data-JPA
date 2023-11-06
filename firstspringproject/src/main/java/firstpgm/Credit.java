package firstpgm;

public class Credit implements Payment {
   Credit(){
	   System.out.println("Object created by spring IOC");
   }
	@Override
	public String pay() {
		// TODO Auto-generated method stub
		return "Hello";
	}

}
