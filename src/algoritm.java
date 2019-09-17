import java.util.Scanner;

public class algoritm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] massaHeltal2 = { 0, 3, 5, 8 };
		int summa = 0;
		int tempTal;
		int tempTal2;
		int tempTal3;
		
		System.out.println("mata in ditt tal");
		
		tempTal=input.nextInt();
		tempTal2=input.nextInt();
		tempTal3=input.nextInt();
		
		for (int i : massaHeltal2)
			System.out.println(i + tempTal + tempTal2 + tempTal3);
			
		

		for (int i : massaHeltal2)
			System.out.print(i+", ");
		System.out.println();
		for (int tal : massaHeltal2) {
			System.out.println(summa + " + " + tal);
			summa += tal;
		}

		System.out.println(summa);
	}
	

	
}
