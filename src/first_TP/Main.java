package first_TP;

//import java.util.Arrays;
//import java.util.List;

public class Main {

	public static void main(String[] args) {
		Bloc unBloc = new Bloc("Ceci est le premier bloc"); //déclaration et instanciations
		unBloc.afficherDescription();
		
		Bloc secondBloc = new Bloc("Ceci est le second bloc");
		secondBloc.afficherDescription();
 
		/*List<String> nomDesLangages = Arrays.asList("java", "php", "javascript","C#");
		for(String nomDunLangage: nomDesLangages) {
			String resultat= nomDunLangage.toUpperCase();
			System.out.println(resultat);
		}*/
		
		
		//int num;
		//num = 15;(
		//num = 5;
		
		//final int immuable = 20;
		
		//int nbre1 = 2;
		//int nbre2 = 5;
		//int nbretotal = nbre1 + nbre2;
		
		/*String langage = "Java";
		String phrase = langage + " est un langage de programmation.";
		System.out.println(phrase);*/
		
		//String Hello = "Marty ! ";
		//affichage("Martys");
		//System.out.println(Hello);
		//int somme= Main.addition(5, 8);
		//System.out.println(somme);
		//Main.Commentemeteo("aaaaa");
		
		/*System.out.println(CategorieFilm("star wars"));
		System.out.println(CategorieFilm("Cendrillon"));
		System.out.println(CategorieFilm("petite sirène"));
		System.out.println(CategorieFilm("indiana jones"));
		System.out.println(CategorieFilm("blanche"));*/

		
	}
	
	/*public static int addition( final int entier1, final int entier2) {
		return entier1 + entier2;
	}*/
	
	/*public static void decompte(final int valeur) {
		if(valeur >=0) {
			System.out.println(valeur);
			decompte(valeur - 1);
		}
	}*/
	/*public static void affichage(final String texte) {
		System.out.println("Bonjour " + texte);
	}*/
	/*public static void Commentemeteo(final String meteo) {
		switch(meteo){
		case "soleil" ->System.out.println("Beau temps");	
		case "nuage" ->System.out.println("Nuageux");
		case "pluie" ->System.out.println("Mauvais temps");
		default -> System.out.println("Je ne sais pas");
		}
	}*/
	
	/*public static String CategorieFilm(final String film) {
		var resultat= switch(film){
		case "star wars" ->"Fictions d'onctions";
		case "Cendrillon", "petite sirène" -> "Disney";
		case "indiana jones" ->{
			String categorie= "aventure";
			yield categorie;
		}
		default -> "Inconnu";
		};
		return resultat;
	}*/
}
