package myPackage;
/*Au d�but, l'ordinateur propose un num�ro dans l��chelle [1,1000]. Le choix est fait au hasard (random).
 * 
 * Ensuite, le programme demande � l'utilisateur de choisir et taper un num�ro (entre 1 et 1000).
 *
 * L'utilisateur (nous) essaie de le devine.(+Limite le nombre de tentatives a  10 ).
 *
 * Une fois qu�on fasse une devinette, l'ordinateur r�pond si le num�ro correspond ou s'il est plus petit ou plus grand que celui propos�. 
 * 
 * Le jeu continue, jusqu'� ce que le joueur trouve le num�ro ou a utilise  toutes  ses  efforts acceptees .
 */

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JeuDevinette Game1 = new JeuDevinette();
		
		Game1.gameOn();
		
	}

}
