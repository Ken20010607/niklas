import java.util.Scanner;

public class algoritm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("hur många tal ");
		
		  int antal = input.nextInt();
	      int[] massaHeltal2 = new int[antal];
		
	      for (int i = 0; i < antal; i++) {
	            System.out.println("ditt tal: ");
	            massaHeltal2[i] = input.nextInt();
	        }
		

	      int summa = 0;
	        for (int tal : massaHeltal2) {
	            summa = summa + tal;
	        }

	        System.out.println("Summan är: " + summa);

	    }
	}