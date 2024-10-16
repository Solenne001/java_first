package first_TP;

import java.util.Scanner;

public class affichage {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Entrez votre nom: ") ;
			String nom= sc.nextLine();
			
			System.out.print("Entrez votre prenom: ");
			String prenom= sc.nextLine();
			
			System.out.print("Entrez votre année de naissance : ");
			int annee= sc.nextInt();
			int anneeActuelle= 2024;
			int age = anneeActuelle - annee;
			
			System.out.print("Entrez votre sexe : ");
			char sexe= sc.next().charAt(0);
			String titre;
			if(sexe == 'M' || sexe == 'm') {
				titre= "Mr";
			}else if(sexe== 'F' || sexe == 'f'){
				titre= "Mme";
			}else {
				titre= "Error";
			}
			sc.nextLine();
			

			System.out.print("Entrez votre ville: ");
			String ville= sc.nextLine();
			
			System.out.print("Entrez votre pays: ");
			String pays= sc.nextLine();
			
			System.out.print("Entrez votre profession: ");
			String profession= sc.nextLine();
			
			
			System.out.printf("Vous êtes  " +titre+" " +nom  +" "  +prenom +" "+"agée de " +age +" " +"ans et vous habitez dans la ville de:  " +ville +"-" +pays +
				" "+"vous êtes de genre "+sexe+" "+ "avec une professions de " +profession);
		}
	}

}
