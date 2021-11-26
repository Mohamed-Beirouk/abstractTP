package EtablissementEnseignement;

class Etudiant extends Person{
	public String diplome;
	
	static int nbetudiants;

		public Etudiant(String nom, String prenom, String route, String ville, String diplome) throws VilleException {
			super(nom,prenom,route,ville);
			this.diplome=diplome;
			nbetudiants++;
		}

		public String getDiplome() {
			return diplome;
		}

		public void setDiplome(String diplome) {
			this.diplome = diplome;
		}

		public static int getNbetudiants() {
			return nbetudiants;
		}

		public static void setNbetudiants(int nbetudiants) {
			Etudiant.nbetudiants = nbetudiants;
		}

	
	public void ecrirePerson() {
		
		System.out.println("  le nom : "+this.nom);
		System.out.println("\n le prenom : "+this.prenom);
		System.out.println("\n la route est : "+this.route);
		System.out.println("\n la ville est : "+this.ville);
		System.out.println("\n lediplome est : "+this.diplome);
	}
	
	public String toString() {
		return " le nom est : "+this.nom+" le prenom est : "+this.prenom+" la route est : "+this.route+ 
				" la ville est : "+this.ville+ " le diplome en cours"+this.diplome;
	}



}
