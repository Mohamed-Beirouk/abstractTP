package EtablissementEnseignement;
import java.util.ArrayList;

abstract public class Person  {
	
	public String nom;
	public String prenom;
	public String route;
	public String ville;
	public static int nbpersonnes;
	
	public Person(String nom, String prenom, String route, String ville) throws VilleException {
			

		verifierVille(ville);
			this.nom=nom;
			this.prenom=prenom;
			this.route=route;
			this.ville=ville;
			nbpersonnes++;

	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public static int getNbpersonnes() {
		return nbpersonnes;
	}

	public static void setNbpersonnes(int nbpersonnes) {
		Person.nbpersonnes = nbpersonnes;
	}
	
	
	public String toString() {
		return "le nom est : "+this.nom+" le prenom est : "+this.prenom+" la route est : "+this.route+ " la ville est : "+this.ville;
	}

	abstract public void ecrirePerson();
	
	public void verifierVille(String ville) throws VilleException{
		
		String test = ville; 
		ArrayList<String> villes = new ArrayList<String>();
		villes.add("kiffa");
		villes.add("atar");
		villes.add("nema");
		villes.add("aioun");
		villes.add("kaedi");
		villes.add("zouerate");
		if (villes.contains(test) == false) {
			throw new VilleException("la ville "+this.ville+" est pas dans la liste");
		}
		
		
		
		
	}
	
	public static void nbPersonnes() {
		System.out.println(" le nombre de personnes : "+nbpersonnes);
		System.out.println(" le nombre de etudiants : "+Etudiant.nombresetudiants());
		System.out.println(" le nombre de secr�taires : "+Secretaire.nombresecretaires());
		System.out.println(" le nombre de enseignants : "+Enseignant.nombrespersonnes());
	}
	
	public void ModifierPerson(String rue, String ville) throws VilleException {

		verifierVille(ville);
			this.route=rue;
			this.ville=ville;
			
	}
	
	
}
