
public class Kuh extends Tier {
	
	int hufe;

	public Kuh(String name, int gewicht, int alter, String augenfarbe) {
		super(name, gewicht, alter, augenfarbe);
		// TODO Auto-generated constructor stub
		this.hufe = hufe;
	}

	@Override
	public void essen() {
		// TODO Auto-generated method stub
		super.essen();
		
		System.out.println("Die " +name +" muss das Essen immer wiederkaufen");
	}

	
	
	
	
	
}
