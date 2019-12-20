package tp3;

@Refactorable (
		nomRefactoring = RefactoringName.extractClass,
		isPresentInEclipse = true)
public class Personne {

	public Personne() {
	}

	public Personne(String nom, int age, int numrue, String nomrue, String ville, int codepostale) {
		this.NomComplet = nom;
		this.Age = age;
		this.NumRue = numrue;
		this.NomRue = nomrue;
		this.Ville = ville;
		this.CodePostale = codepostale;
	}

	@Refactorable (
			nomRefactoring = RefactoringName.encapsulatedField,
			isPresentInEclipse = true)
	@Refactorable(
			nomRefactoring = RefactoringName.rename,
			isPresentInEclipse = true)
	public String NomComplet;
	@Refactorable (
			nomRefactoring = RefactoringName.encapsulatedField,
			isPresentInEclipse = true)
	@Refactorable(
			nomRefactoring = RefactoringName.rename,
			isPresentInEclipse = true)
	public int Age;
	@Refactorable (
			nomRefactoring = RefactoringName.encapsulatedField,
			isPresentInEclipse = true)
	@Refactorable(
			nomRefactoring = RefactoringName.rename,
			isPresentInEclipse = true)
	public int NumRue;
	@Refactorable (
			nomRefactoring = RefactoringName.encapsulatedField,
			isPresentInEclipse = true)
	@Refactorable(
			nomRefactoring = RefactoringName.rename,
			isPresentInEclipse = true)
	public String NomRue;
	@Refactorable (
			nomRefactoring = RefactoringName.encapsulatedField,
			isPresentInEclipse = true)
	@Refactorable(
			nomRefactoring = RefactoringName.rename,
			isPresentInEclipse = true)
	public String Ville;
	@Refactorable (
			nomRefactoring = RefactoringName.encapsulatedField,
			isPresentInEclipse = true)
	@Refactorable(
			nomRefactoring = RefactoringName.rename,
			isPresentInEclipse = true)
	public int CodePostale;

	public void AfficherAdresse() {
		System.out.println("Numero de rue : " + NumRue);
		System.out.println("Nom de la rue : " + NomRue);
		System.out.println("Nom de la ville : " + Ville);
		System.out.println("CodePostale : " + CodePostale);
	}
}
