import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Niklas");
		Scanner input = new Scanner(System.in);
		System.out.println("Vad är ditt användanamn");
		String name = input.nextLine();
		System.out.println("Ditt användanamn är " + name);
		System.out.println("Hur gammal är du?");
		String age = input.nextLine();
		System.out.println("Din ålder är " + age);
		System.out.println("Adress:");
		String adress = input.nextLine();
		System.out.println("Din adress är:" + adress);
		System.out.println("Din postnummer är?");
		String postnummer = input.nextLine();
		System.out.println("Din postnummer är " + postnummer);
		System.out.println("Vilken stad bor du i?");
		String stad = input.nextLine();
		System.out.println("Du bor i " + stad);
		System.out.println("Ditt telefonnummer är?");
		String telefonnummer = input.nextLine();
		System.out.println("Din telefonnummer är: " + telefonnummer);
		System.out.println("Din användanamn är " + name);
		System.out.println("Ålder: " + age);
		System.out.println("Adress: " + adress);
		System.out.println("Postnummer: " + postnummer);
		System.out.println("Stad: " + stad);
		System.out.println("Telefon: " + telefonnummer);
		
	}

}
