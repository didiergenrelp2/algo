package co.simplon.serie1;
import java.util.*;
import java.lang.Math;
/**
 * @author Utilisateur
 *
 */
public class Exercice1 {

	public static void main(String[] args) {

        System.out.println("Entrer un nombre");
        Scanner scan = new Scanner(System.in); 
		int i = scan.nextInt();
		System.out.println(calcul(i));
		/*System.out.println(calcul(0));
		System.out.println(calcul(5));*/
		scan.close();
	}
	/**
	 * Fonction retournant le signe
	 * @param i
	 * @return
	 */
        public static String calcul(int i) {
               String retourVisu;
               if(i<0){
            	   retourVisu = "Negatif";
               }
               else if (i==0){
            	   retourVisu ="Zéro";
               }
    
               else{
            retourVisu ="Positif";
               }
               return retourVisu;
        }

}

