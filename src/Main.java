import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kuh olga = new Kuh("olga", 200, 24, "blau");
		Kuh paul = new Kuh("paul", 500, 30, "grün");
		
				
			olga.essen();
			paul.essen();
			
		Hund bello = new Hund ("bello", 30, 12, "blau");
		
		Hund carlo = new Hund ("carlo", 32, 13, "grün");
		
		carlo.essen();
		

		System.out.println("Bello erstellt");
		bello.essen();
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Willkommen im Tier Generator");
		System.out.println("Bitte einen Case angeben 1 oder 2");
		
		int eingabeUser = scan.nextInt();
		
		switch (eingabeUser) {
		
			case 1: {
				
				System.out.println("Case 1");
				System.out.println("Wir erstellen eine Kuh");
				System.out.println("Bitte gib deiner Kuh einen Namen");
				
				String eingabeName = scan.toString();


//				Kuh neueKuh = new Kuh();
				
//				neueKuh.name = scan.toString();
//				
//				System.out.println(neueKuh.name);
//				System.out.println(eingabeName);
				
				
				
				
				
				
			}break;
			
			case 2: {
				
				System.out.println("Case 2");
				
			}break;
			default: {
				
				System.out.println("Keine Eingabe erkannt");
			}
		
		}
		
		
	}

}
