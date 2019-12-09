package tp1;

import java.util.ArrayList;

import javax.swing.Box.Filler;

public class FileAttente<A> {
	private String nomFile;
	private static int nbElementsEntresTotal = 0;
	private ArrayList<A> contenu;
	public FileAttente(){contenu=new ArrayList<A>();}
	public void entre(A p){contenu.add(p); nbElementsEntresTotal++;}
	public A sort()
	{
		A p=null;
		if (!contenu.isEmpty())
		{p=contenu.get(0);
		contenu.remove(0);}
		return p;
	}
	public int nbElements(){return contenu.size();}
	public boolean estVide(){return contenu.isEmpty();}
	public String toString(){return ""+descriptionContenu();}
	private String descriptionContenu()
	{
		String resultat = "";
		for (A p:this.contenu)
			resultat += p + " ";
		return resultat;
	}
	public static int getNbElemEntresTotal() {
		return nbElementsEntresTotal;
	}
	public static <A> boolean containSame(FileAttente<A> fa1, FileAttente<A> fa2) {return fa2.equals(fa1);}
	public <A> boolean containSame(FileAttente<A> fa) {
		return this.equals(fa);
	}
	public <B> boolean containSameNumber(FileAttente<B> fab) {
		return this.nbElements() == fab.nbElements();
	}
	public static void main(String[] args) {
		FileAttente<Personne> fap = new FileAttente<>();
		fap.entre(new Personne("Mas", "Lucas"));
		disp(fap.toString());
		FileAttente<Rectangle> far = new FileAttente<>();
		far.entre(new Rectangle(800, 600));
		disp(far.toString());
		disp(String.format("Nombre entrés total : %s", FileAttente.getNbElemEntresTotal()));
		disp(String.valueOf(FileAttente.containSame(fap, fap)));
		FileAttente<Personne> fap1 = new FileAttente<>();
		disp(String.valueOf(FileAttente.containSame(fap, fap1)));
		disp(String.valueOf(fap.containSame(fap)));
		disp(String.valueOf(fap.containSame(fap1)));
		disp(str(fap.containSameNumber(fap)));
		FileAttente<Rectangle> far1 = new FileAttente<Rectangle>();
		disp(str(fap.containSameNumber(far)));
		disp(str(fap.containSameNumber(far1)));
	}

	public static void disp(String str) {
		System.out.println(str);
	}
	public static String str(Object o) {
		return String.valueOf(o);
	}
}
