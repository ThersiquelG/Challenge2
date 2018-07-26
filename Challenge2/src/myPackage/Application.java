package myPackage;
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

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JeuDevinette Game1 = new JeuDevinette();
		
		Game1.gameOn();
		
	}

}
