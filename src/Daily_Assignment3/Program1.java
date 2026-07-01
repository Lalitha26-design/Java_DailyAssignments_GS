package Daily_Assignment3;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=77;
		
		if(marks<0 || marks>100)
		{
			System.out.println("invalid marks");
		}
		else if(marks>=90)
		{
			System.out.println("Your grade is A");
		}
		else if(marks>=75)
			System.out.println("Your grade is B");
		else if(marks>=60)
			System.out.println("Your grade is C");
		else if(marks>=40)
			System.out.println("Your grade is D");
		else
		{
			System.out.println("fail");

		}

			


	}

}
