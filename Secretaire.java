package EtablissementEnseignement;

public class Secretaire extends Person{

	private String numeroBureau;
	
	private static int nbsecretaires;

		public Secretaire(String nom, String prenom, String route, String ville, String numeroBureau) throws VilleException {
			super(nom,prenom,route,ville);
			this.numeroBureau=numeroBureau;
			nbsecretaires++;

		}
		

		public String getNumeroBureau() {
			return numeroBureau;
		}

		public void setNumeroBureau(String numeroBureau) {
			this.numeroBureau = numeroBureau;
		}

		public static int getNbsecretaires() {
			return nbsecretaires;
		}

		public static void setNbsecretaires(int nbsecretaires) {
			Secretaire.nbsecretaires = nbsecretaires;
		}

		public void ecrirePerson() {
			
			System.out.println("  le nom : "+this.nom);
			System.out.println("\n le prenom : "+this.prenom);
			System.out.println("\n la route est : "+this.route);
			System.out.println("\n la ville est : "+this.ville);
			System.out.println("\n le numero Bureau est : "+this.numeroBureau);
		}
		
		public String toString() {
			return " le nom est : "+this.nom+" le prenom est : "+this.prenom+" la route est : "+this.route+ 
					" la ville est : "+this.ville+ " le numero Bureau en cours"+this.numeroBureau;
		}
		public static int nombresecretaires() {
			return nbsecretaires;
		}
		
		
}
