import java.util.Scanner;

/*
 * Definite la classe Cittadino i cui oggetti rappresentano cittadi. Ogni cittadino è caratterizzato da nome, cognome,
 * cittadinanza, codice fiscale, parametri di tipo String.
 * La classe Cittadino va inoltre estesa da una classe Diplomatico i cui oggetti rappresentano appartenenti a corpi 
 * diplomatici. Oltre ai pèarametri che caratterizzano un cittadino, un diplomatico deve possedere l'anno (tipo int) in cui
 * ha preso servizio presso il corpo di appartenenza.
 * La classe Diplomatico, oltre ovviamente al costruttore, deve anche avere:
 * - un metodo public boolean piuVecchio(Diplomatico d) che restituisce true se la presa di servizio del diplomatico che 
 *   invoca il metodo è anteriore a quella del diplomatico passato come argomento, flase altrimenti.
 *   
 * Sfruttando la gerarchia precedente, scrivete un programma, che operi come segue:
 * - legga un intero positivo che rappresenta la dimensione di un array entro cui inserire cittadini;
 * - riepia tale array con cittadini o diplomatici chiesti all'utente;
 * - stampi il diplomatico con la più vecchia presa di servizio (se non sono stati inseriti diplomatici, il programma deve 
 *   dare opportuna comunicazione);
 * - stampi il numero di cittadini non diplomatici la cui cittadinanza è identica a quella del primo elemento inserito nel
 *   vettore
 */

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Lista l;
		System.out.println("Indica quanti cittadini vuoi inserire: ");
		int numCittadini = s.nextInt();
		int scelta;

		// creo la lista
		l = new Lista(numCittadini);

		do {
			System.out.println("Scelta.\n" + "1. Inserisci elementi\n"
					+ "2. Cerca diplomatico più anziano\n"
					+ "3. Cerca cittadinanze uguali\n" + "4. Stampa elementi\n"
					+ "5. Esci\n");
			scelta = s.nextInt();
			switch (scelta) {
			case 1:
				l.inserimento();
				break;
			case 2:
				l.displomaticoPiuVecchio();
				break;
			case 3:
				l.cittadinanzaUguale();
				break;
			case 4:
				l.toString();
				break;
			}
		} while (scelta != 5);
	}
}
