package week1.day1;

public class Mobile {
	
	public void sendMsg()
	{
	
	System.out.println("Hello");
	}
	
	private void makeCall()
	{
	String makeCall="dial";	
	System.out.println(makeCall);
	}
	
	void addContact(int num)
	{
	System.out.println(num);
	}
	
	
	public static void main(String arg[])
	{
		Mobile mob=new Mobile();
		mob.sendMsg();
		mob.makeCall();
		mob.addContact(1234567885);
	}

}
