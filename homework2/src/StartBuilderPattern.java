import java.util.*;

public class StartBuilderPattern 
{
	public static void main(String[] args)
	{
		UsingBP h = new UsingBP.Builder()
		.setId(1)
		.setPhone(8067)
		.setSomeNumb1(100)
		.setSomeNumb2(200)
		.setSomeNumb3(300)
		.build();
		
		System.out.println("id : " + h.getId() + " " 
		+ "phone : " + h.getPhone() + " "
		+ "someNumbers from 1 to 3: " + h.getSomeNumb1() +  " "
		+  h.getSomeNumb2() + " " + h.getSomeNumb3());
		System.out.println();
	}
}