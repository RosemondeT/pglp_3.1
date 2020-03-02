package traore.Exercice_SRP;

public class Employer {
	protected ClasseCalcul calcul;
	
	private final String nom;
	private final String adresse ;
	
	
	public Employer(ClasseCalcul calcul, String nom, String adresse) {
		this.calcul = calcul;
		this.nom = nom;
		this.adresse = adresse;
	}

	public void afficheCoordonnees () { System.out. println (nom + " , " + adresse);}
	

}
