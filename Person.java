package EtablissementEnseignement;
import java.util.ArrayList;

abstract public class Person  {
	
	public String nom;
	public String prenom;
	public String route;
	public String ville;
	public static int nbpersonnes;
	
	public Person(String nom, String prenom, String route, String ville) throws VilleException {
			
		
		String test = ville; 
		ArrayList<String> villes = new ArrayList<String>();
		villes.add("kiffa");
		villes.add("atar");
		villes.add("nema");
		villes.add("aioun");
		villes.add("kaedi");
		villes.add("zouerate");
		
		if(villes.contains(test)) {
			this.nom=nom;
			this.prenom=prenom;
			this.route=route;
			this.ville=ville;
			nbpersonnes++;
			
			
		}
		else {
			throw new VilleException("la ville "+this.ville+" est pas dans la liste");
		}
		
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
	
	
	
	public static void nbPersonnes() {
		System.out.println(" le nombre de personnes : "+nbpersonnes);
		System.out.println(" le nombre de etudiants : "+Etudiant.nbetudiants);
		System.out.println(" le nombre de secrétaires : "+Secretaire.nbsecretaires);
		System.out.println(" le nombre de enseignants : "+Enseignant.nbenseignants);
	}
	
	public void ModifierPerson(String rue, String ville) throws VilleException {
		String test = ville; 
		ArrayList<String> villes = new ArrayList<String>();
		villes.add("kiffa");
		villes.add("atar");
		villes.add("nema");
		villes.add("aioun");
		villes.add("kaedi");
		villes.add("zouerate");
		
		if(villes.contains(test)) {
		
			this.route=rue;
			this.ville=ville;
			
			
			
		}
		else {
			throw new VilleException("la ville "+this.ville+" est pas dans la liste");
		}
	}
	
	


}
