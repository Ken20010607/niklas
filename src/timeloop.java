import java.util.Scanner;

public class timeloop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int n = input.nextInt();
		
		String text = " Abracadabra";
		
		if (n <= 100 && n >= 1) 
		{
			for (int i = 1; i <= n; i++)
			{
				System.out.println(i + text);
			}
		}
	
		
		else
		{
			System.out.println("Talet m�ste vara mindre �n 100");
		}
			
			
			
}

}
