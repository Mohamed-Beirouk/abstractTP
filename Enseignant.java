package EtablissementEnseignement;

public class Enseignant extends Person{
	
public String specialite;
	
	static int nbenseignants;

	public Enseignant(String nom, String prenom, String route, String ville, String specialite) throws VilleException {
		super(nom,prenom,route,ville);
		this.specialite=specialite;
		nbenseignants++;

	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public static int getNbenseignants() {
		return nbenseignants;
	}

	public static void setNbenseignants(int nbenseignants) {
		Enseignant.nbenseignants = nbenseignants;
	}
	

	public void ecrirePerson() {
		
		System.out.println("  le nom : "+this.nom);
		System.out.println("\n le prenom : "+this.prenom);
		System.out.println("\n la route est : "+this.route);
		System.out.println("\n la ville est : "+this.ville);
		System.out.println("\n la specialite est : "+this.specialite);
	}
	
	public String toString() {
		return " le nom est : "+this.nom+" le prenom est : "+this.prenom+" la route est : "+this.route+ 
				" la ville est : "+this.ville+ " la specialite en cours"+this.specialite;
	}
	
	
}
	
	

