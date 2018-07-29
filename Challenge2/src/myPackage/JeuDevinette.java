package myPackage;
import java.util.Scanner;
/*Au début, l'ordinateur propose un numéro dans l’échelle [1,1000]. Le choix est fait au hasard (random).
 * 
 * Ensuite, le programme demande à l'utilisateur de choisir et taper un numéro (entre 1 et 1000).
 *
 * L'utilisateur (nous) essaie de le devine.(+Limite le nombre de tentatives a  10 ).
 *
 * Une fois qu’on fasse une devinette, l'ordinateur répond si le numéro correspond ou s'il est plus petit ou plus grand que celui proposé. 
 * 
 * Le jeu continue, jusqu'à ce que le joueur trouve le numéro ou a utilise  toutes  ses  efforts acceptees .
 */

public class JeuDevinette {
//Au début, l'ordinateur propose un numéro dans l’échelle [1,1000]. Le choix est fait au hasard (random).
	int mNumber = (int)(Math.random()  * 999);

	public int tries = 10;
	public boolean gameOn = true;



	//Verification du nombre d'essais restant
	public boolean triesCounter() {
		if(tries < 1) {
			gameOn = false;
			System.out.println("Vous avez perdu ...");
		}
		return true;
	}
	
	

	public void partieEnCours() {
		System.out.println(mNumber);
		while(gameOn) {
			
			//Ensuite, le programme demande à l'utilisateur de choisir et taper un numéro (entre 1 et 1000).
			Scanner input = new Scanner(System.in);
			System.out.println("Veuillez taper un nombre entre 1 et 1000");
			int userNumber = input.nextInt();
			
			
			// L'utilisateur (nous) essaie de le devine.(+Limite le nombre de tentatives a  10 ).
			// Une fois qu’on fasse une devinette, l'ordinateur répond si le numéro correspond ou s'il est plus petit ou plus grand que celui proposé.
			
			if(userNumber > mNumber) {
				System.out.println("Votre nombre est plus grand que le nombre mystère !");
				tries = tries - 1;
				System.out.println("Il vous reste : " + tries + " essaie(s).");
			} else if(userNumber < mNumber) {
				System.out.println("Votre nombre est plus petit que le nombre mystère !");
				tries = tries - 1;
				System.out.println("Il vous reste : " + tries + " essaie(s).");
			} else if(userNumber == mNumber) {
				System.out.println("Félicitation");
				gameOn = false;
			}

			triesCounter();
			
			
			
			// Le jeu continue, jusqu'à ce que le joueur trouve le numéro ou a utilise  toutes  ses  efforts acceptees .
			
			//fin de la boucle gameOn
		}
		

		
	}
}



