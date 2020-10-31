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
				Scanner scan2 = new Scanner(System.in);
				
				String eingabeName = scan2.nextLine();


				
				System.out.println("Bitte gib folgende Angaben an in dieser Reihenfolge: 1. Name 2. Gewicht, 3. Alter 4. Augenfarbe");
				
				Kuh neueKuh = new Kuh(scan2.nextLine(), scan.nextInt(), scan.nextInt(), scan2.nextLine());
				System.out.println("Anzahl Hufe");
				neueKuh.hufe = scan.nextInt();
				
				

				
				System.out.println("Unsere erstellte Kuh heisst " + neueKuh.name + ". Sie ist " + neueKuh.alter + " Jahre alt. Sie wiegt " + neueKuh.gewicht + " KG. Sie hat auch " + neueKuh.hufe + " Hufen wie jede Kuh. Ihre Augenfarbe ist " + neueKuh.augenfarbe + ".");
				System.out.println(eingabeName);
				
				
				
				
				
				
			}break;
			
			case 2: {
				
				System.out.println("Case 2");
				System.out.println("Hund erstellen");
				
			}break;
			default: {
				
				System.out.println("Keine Eingabe erkannt");
			}
		
		}
		
		
	}

}
