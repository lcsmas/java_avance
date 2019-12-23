package tp2;

import tools.Tools;
import tp1.*;

public class Main {

	public static void main(String[] args) {
		Rayon<Produit> rP = new Rayon<>();
		Produit p1 = new Produit(); p1.setEtiquette("Produit 1");
		Produit p2 = new Produit();	p2.setEtiquette("Produit 1");
		Produit p3 = new Produit();	p3.setEtiquette("Produit 1");
		rP.addToRayon(p1);
		rP.addToRayon(p2);
		rP.addToRayon(p3);
		Rayon<Livre> rL = new Rayon<>();
		Livre l1 = new Livre(); l1.setEtiquette("Livre 1");
		Livre l2 = new Livre(); l2.setEtiquette("Livre 2");
		Livre l3 = new Livre(); l3.setEtiquette("Livre 1");
		rL.addToRayon(l1); 
		rL.addToRayon(l2);
		rL.addToRayon(l3);
		Tools.disp(rP.listingContenu());
		Tools.disp(rL.listingContenu());
		
		//FileAttente<Personne> fp = new FileAttente<Adulte>(); //1		
		//FileAttente<Adulte> fa = new FileAttente<Personne>(); //2
		// Nous ne pouvons pas écrire ces instructions parceque nous devons utiliser la syntaxe joker
		
		FileAttente2<Enfant> f1 = new FileAttente2<>();
		f1.entre(new Enfant("Romy", "Pierson"));
		Tools.disp("f1 :" +f1.toString());//Avant déplacement
		FileAttente2<Adulte> f2 = new FileAttente2<>();
		f2.entre(new Adulte("Lucas", "Mas"));
		f2.entre(new Adulte("Corinne", "Mas"));
		Tools.disp("f2 :" +f2.toString());
		FileAttente2<Personne> f3 = new FileAttente2<>();
		Tools.disp("f3 :" +f3.toString()); 
		f1.moveFirstTo(f3); // Test question 7
		f2.moveFirstTo(f3); 
		f3.getFirstFrom(f2); // Test question 8
		Tools.disp("f3 :" +f3.toString()); //Après déplacement
		Tools.disp("f1 :" +f1.toString());
		Tools.disp("f2 :" +f2.toString());
		
		
		
	}

}
