
public class Tier {

	//Attribute
	String name;
	int gewicht;
	int alter;
	String augenfarbe;
	
	//Konstruktoren
	
	public Tier(String name, int gewicht, int alter, String augenfarbe) {
		
		this.name = name;
		this.gewicht = gewicht;
		this.alter = alter;
		this.augenfarbe = augenfarbe;
		
		
		
		
	}
	
	public void essen() {
		
		System.out.println("Das Tier ist am Essen");
	}
	
}
