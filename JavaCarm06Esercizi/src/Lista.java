import java.util.Scanner;

public class Lista {

	/**
	 * Creo un array di oggetti di tipo Cittadino Non li creo di tipo
	 * Diplomatico perchè questo estende Cittanino che quindi include
	 * Diplomatico
	 */
	private Cittadino lista[];
	private int dim;

	/**
	 * Nel costruttore devo costruire la mia lista
	 */

	public Lista(int n) {
		dim = n;
		lista = new Cittadino[dim];
	}

	public void inserimento() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < dim; i++) {
			System.out.println("1. Cittadino\n2. Diplomatico");
			int scelta = s.nextInt();
			System.out.println("\nInserisci nome");
			String nome = s.next();
			System.out.println("\nInserisci cognome");
			String cognome = s.next();
			System.out.println("\nInserisci cittadinanza");
			String cittadinanza = s.next();
			System.out.println("\nInserisci codice fiscale");
			String codice = s.next();
			if (scelta == 2) {
				System.out.println("\nInserisci anno");
				int anno = s.nextInt();
				lista[i] = new Diplomatico(nome, cognome, cittadinanza, codice,
						anno);

			} else {
				lista[i] = new Cittadino(nome, cognome, cittadinanza, codice);
			}

		}
	}

	public void stampa() {
		for (int i = 0; i < dim; i++) {
			System.out.println(lista[i].toString());
		}
	}

	/**
	 * Algoritmo: il primo elemento è subito il nostro minimo Confronto tra
	 * tutti gli elementi successivi ed il nostro minimo
	 * 
	 */
	public void displomaticoPiuVecchio() {

		Diplomatico min = null;
		for (int i = 0; i < dim; i++){
			if (lista[i] instanceof Diplomatico) {
				 min = (Diplomatico) lista[i];
			}
		}
	
if(min!=null){
	

		for (int i = 1; i < dim; i++) {
			if (lista[i] instanceof Diplomatico) {
				if (((Diplomatico) lista[i]).getAnno() < min.getAnno())
					min = (Diplomatico) lista[i];

			}
		}
	
			System.out.println("Il diplomatico più vecchio è: "
					+ min.toString());
	

	}
else{
	System.out.println("Hain inserito il vettore vuoto");
}
	}

//	public void displomaticoPiuVecchio() {
//		Diplomatico min = (Diplomatico) lista[0];
//		for (int i = 1; i < dim; i++) {
//			if (lista[i] instanceof Diplomatico) {
//				if (((Diplomatico) lista[i]).getAnno() < min.getAnno())
//					min = (Diplomatico) lista[i];
//
//			}
//		}
//		if (dim == 0) {
//			System.out.println("Hai inserito un vettore vuoto");
//		} else {
//			System.out.println("Il diplomatico più vecchio è: "
//					+ min.toString());
//		}
//
//	}
	
	
	public void cittadinanzaUguale() {
		String c = lista[0].getCittadinanza();
		int conta=0;
		for (int i = 1; i < dim; i++) {
			if(lista[i] instanceof Cittadino && lista[i].getCittadinanza().contentEquals(c)){
				conta++;
			}

		}
System.out.println("Trovate "+conta+" corrispondenze.\n");
	}
}
