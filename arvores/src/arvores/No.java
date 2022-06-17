package arvores;

public class No {
	private int valor;
	private String pergunta;
	private No esquerdo;
	private No direito;
	private int nivel;

	public int getNivel() {
		return nivel;
	}

	public boolean noFolha() {
		return (direito == null && esquerdo == null);
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	No(int valor, String pergunta) {
		this.valor = valor;
		this.pergunta = pergunta;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}

	public No getDireito() {
		return direito;
	}

	public void setDireito(No direito) {
		this.direito = direito;
	}

	public void finalize() {
		System.out.println("LIBERADO");
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
}
