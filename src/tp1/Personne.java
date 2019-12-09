package tp1;

import java.util.UUID;

public class Personne {
	private UUID id = UUID.randomUUID();
	private String nom;
	private String prenom;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String toString() {
		return String.valueOf(id) + " : " +nom + " " + prenom;
	}
}
