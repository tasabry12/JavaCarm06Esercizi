public class Cittadino {

	private String nome;
	private String cognome;
	private String cittadinanza;
	private String codiceFiscale;

	public Cittadino(String nome, String cognome, String cittadinanza,
			String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cittadinanza = cittadinanza;
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCittadinanza() {
		return cittadinanza;
	}

	public void setCittadinanza(String cittadinanza) {
		this.cittadinanza = cittadinanza;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
//		return "Cittadino [nome=" + nome + ", cognome=" + cognome
//				+ ", cittadinanza=" + cittadinanza + ", codiceFiscale="
//				+ codiceFiscale + "]";
	return "Cittadino: " + nome + ", cognome=" + cognome
		+ ", cittadinanza=" + cittadinanza + ", codiceFiscale="
	+ codiceFiscale;
		
	}

}
