package tp2;

import java.util.ArrayList;
import java.util.List;


public class Rayon<A extends ObjetAvecEtiquette> {
	private ArrayList<A> contenu = new ArrayList<>();
	public Rayon() {};
	public Rayon(ArrayList<A> p) {
		contenu.addAll(p);
	}
	public void addToRayon(A p) {
		if(!contenu.contains(p)) {
			this.contenu.add(p);
		}
	}
	public String listingContenu() {
		String listing="";
		for(A c : contenu)
			listing += c.etiquette();
		return listing;
	}
}
