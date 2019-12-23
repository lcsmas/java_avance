package tp2;

import java.util.ArrayList;

import tp1.Personne;

public class FileAttente2<A extends Personne> {
	private String nomFile;
	private static int nbElementsEntresTotal = 0;
	private ArrayList<A> contenu;

	public FileAttente2() {
		contenu = new ArrayList<A>();
	}
	public void entre(A a)
	{
		if (a.isInvite()) {
			contenu.add(a);
			nbElementsEntresTotal++;
		}
		else System.out.println("non invite");
	}
	public A sort() {
		A p = null;
		if (!contenu.isEmpty()) {
			p = contenu.get(0);
			contenu.remove(0);
		}
		return p;
	}
	public void moveFirstTo(FileAttente2<? super A> target) {
		A a = this.sort();
		if(a != null) {
			target.entre(a);
		}
	}
	public void getFirstFrom(FileAttente2<? extends A> source) {
		A a = source.sort();
		if(a != null) {
			this.entre(a);
		}
	}
	public String toString() {
		String str = "";
		for(A a : contenu) {
			str += a.toString() + "\n";
		}
		return str;
	}
}
