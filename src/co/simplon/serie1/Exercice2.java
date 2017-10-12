package co.simplon.serie1;
import java.util.*;
import java.lang.Math;


public class Exercice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer une note");
		
		int note = scan.nextInt();
		
		//int note;
		System.out.println(donneUnCommentaire(note));
		
	}
	public static String donneUnCommentaire(int note) {
		String commentaire;
		if ((note > 20) || (note < 0)) {
			commentaire = "erreur";
		}
		else if   (note < 5) {
			commentaire = "null";
		}
		else if (note < 10) {
			commentaire  = "refaire";
		}
		else if  (note < 13) {
			commentaire = "passable";
		}
		else if  (note < 15) {
			commentaire = "bien";
		}
		else {
			commentaire = "très bien";
		}
		return commentaire;
	}
}

