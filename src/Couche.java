
public abstract class Couche extends Patisserie {
	protected Patisserie pat;
	protected String nom;
	
	public Couche(Patisserie pPat) {
		pat = pPat;
	}
	
	public String Preparer() {
		String str = pat.preparer();
		return str + nom;
	}

}
