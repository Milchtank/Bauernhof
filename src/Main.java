
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kuh olga = new Kuh("olga", 200, 24, "blau");
		Kuh paul = new Kuh("paul", 500, 30, "gr�n");
		
				
			olga.essen();
			paul.essen();
			
		Hund bello = new Hund ("bello", 30, 12, "blau");
		
		Hund carlo = new Hund ("carlo", 32, 13, "gr�n");
		
		carlo.essen();
		
		
		System.out.println("Bello erstellt");
		bello.essen();
	}

}
