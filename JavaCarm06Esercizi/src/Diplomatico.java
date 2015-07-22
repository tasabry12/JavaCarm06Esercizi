
public class Diplomatico extends Cittadino{

	private int anno;

	public Diplomatico(String nome, String cognome, String cittadinanza,
			String codiceFiscale, int anno) {
		super(nome, cognome, cittadinanza, codiceFiscale);
		this.anno = anno;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	/**
	 * super() -> Costruttore
	 * super.metodo() -> Metodo
	 * super.variabile -> Variabile
	 */
	
	@Override
	public String toString() {
		return super.toString()+"anno=" + anno + "\n";
	}

	public boolean piuVecchio(Diplomatico d){
		return this.anno<d.getAnno();
	}

}
