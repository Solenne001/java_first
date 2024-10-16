package first_TP;

public class Bloc {
	String description;
	
	private Bloc(final String description){
		this.description= "ceci est une variable";
	}
	
	void afficherDescription() {
		System.out.println(this.description);
	}
}
