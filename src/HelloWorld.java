import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Niklas");
		Scanner input = new Scanner(System.in);
		System.out.println("Vad �r ditt anv�ndanamn");
		String name = input.nextLine();
		System.out.println("Ditt anv�ndanamn �r " + name);
		System.out.println("Hur gammal �r du?");
		String age = input.nextLine();
		System.out.println("Din �lder �r " + age);
		System.out.println("Adress:");
		String adress = input.nextLine();
		System.out.println("Din adress �r:" + adress);
		System.out.println("Din postnummer �r?");
		String postnummer = input.nextLine();
		System.out.println("Din postnummer �r " + postnummer);
		System.out.println("Vilken stad bor du i?");
		String stad = input.nextLine();
		System.out.println("Du bor i " + stad);
		System.out.println("Ditt telefonnummer �r?");
		String telefonnummer = input.nextLine();
		System.out.println("Din telefonnummer �r: " + telefonnummer);
		System.out.println("Din anv�ndanamn �r " + name);
		System.out.println("�lder: " + age);
		System.out.println("Adress: " + adress);
		System.out.println("Postnummer: " + postnummer);
		System.out.println("Stad: " + stad);
		System.out.println("Telefon: " + telefonnummer);
		
	}

}
