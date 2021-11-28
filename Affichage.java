package EtablissementEnseignement;

public class Affichage {

	public Affichage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws VilleException {
		try {
		Etudiant e1 = new Etudiant("mohamed","beirouk","r7","kiffa","master");
//		Secretaire s1 = new Secretaire("mohamed","beirouk","r7","kaedi","master");
		e1.ecrirePerson();
//		s1.ecrirePerson();
		e1.ModifierPerson("r7", "kiffa");
		e1.ecrirePerson();

		
		}
		catch(VilleException e){
			
			System.out.println(" vous ne pouvez pas ajouter une ville non determiner");
		}
//		Person.nbPersonnes();
		System.out.println(" github test");

		
	}
}
