import java.util.Scanner;

public class Erstellen {

	
	
	public void Erstellen() {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Willkommen im Tier Generator");
		
		int eingabeUser = scan.nextInt();
		
		switch (eingabeUser) {
		
			case 1: {
				
				System.out.println("Case 1");
				
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
