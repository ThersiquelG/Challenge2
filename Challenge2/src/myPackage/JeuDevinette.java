package myPackage;
import java.util.Scanner;

public class JeuDevinette {
	//l'ordinateur propose un numéro dans l’échelle [1,1000]. Le choix est fait au hasard (random).
	public int randomNumber () {
		int randomNumber = (int) ( (Math.random() * 1000 +1));
		return randomNumber;
	}




	//demande à l'utilisateur de choisir et taper un numéro (entre 1 et 1000).

	public int userNumber() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Tapez un nombre entre 1 et 1000");
		int userNumber = userInput.nextInt();
		return userNumber;
	}



	//répond si le numéro correspond ou s'il est plus petit ou plus grand que celui proposé.

	public boolean isRandomNumberFound(int randomNumber, int userNumber) {
		if(userNumber > randomNumber) {
			System.out.println("Votre nombre est plus grand que le nombre secret. :(");
			return false;
		} else if (userNumber < randomNumber) {
			System.out.println("Votre nombre est plus petit que le nombre secret :(");
			return false;
		} else {
			System.out.println("Bravo ! Vous avez trouver :)");
			return true;
		}
	}




	//Le jeu continue, jusqu'à ce que le joueur trouve le numéro ou a utilise  toutes  ses  efforts acceptees .

	public void gameOn() {
		int nbEfforts = 10;

		int nombreAtrouver = randomNumber() ;

		while(nbEfforts > 0 && isRandomNumberFound(randomNumber(),userNumber()) == false ) {
			nbEfforts--;
		} System.out.println("Le nombre à trouver était :" + randomNumber());



	}
}
