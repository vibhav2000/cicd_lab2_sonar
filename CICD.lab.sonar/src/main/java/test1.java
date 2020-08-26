
public class test1 {
	private int n=10;
			public void f1(int n1)
			{
		n1=10;
			}

	public static void main(String[] args) {
		int n2=20;
		System.out.println("Hello Sonar");
		test1 ob = new test1();
		ob.f1(20);
		if(n1==10)
		{
			System.out.println("Update: This is true part");
			
		}
		else 
		{
			System.out.println("this is false part");
		}
	}

}
