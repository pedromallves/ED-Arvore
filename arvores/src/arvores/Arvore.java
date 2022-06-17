package arvores;

import java.util.Scanner;

public class Arvore {
	No raiz = null;

	public No getRaiz() {
		return raiz;
	}

	public void liberaMemoria(No raiz) {
		if (raiz == null || raiz.noFolha()) {
			return;
		}

		if (raiz.getDireito() != null) {
			liberaMemoria(raiz.getDireito());
			raiz.setDireito(null);
		}

		if (raiz.getEsquerdo() != null) {
			liberaMemoria(raiz.getEsquerdo());
			raiz.setEsquerdo(null);
		}

		this.raiz = null;
	}

	void calculaNivelNos(No raiz, int nivel) {
		if (raiz == null)
			return;

		raiz.setNivel(nivel);
		calculaNivelNos(raiz.getEsquerdo(), nivel + 1);
		calculaNivelNos(raiz.getDireito(), nivel + 1);
	}

	public void insereValor(No raiz, int valor, String pergunta) {
		if (this.raiz == null) {
			this.raiz = new No(valor, pergunta);
			return;
		}

		if (valor > raiz.getValor()) {
			if (raiz.getDireito() == null) {
				raiz.setDireito(new No(valor, pergunta));
				return;
			}

			insereValor(raiz.getDireito(), valor, pergunta);
		} else {
			if (raiz.getEsquerdo() == null) {
				raiz.setEsquerdo(new No(valor, pergunta));
				return;
			}

			insereValor(raiz.getEsquerdo(), valor, pergunta);
		}
	}

	public No removeNo(No no, int valor) {
		if (no == null)
			return no;
		if (valor > no.getValor())
			no.setDireito(removeNo(no.getDireito(), valor));
		else if (valor < no.getValor())
			no.setEsquerdo(removeNo(no.getEsquerdo(), valor));
		else {
			if (no.noFolha())
				no = null;
			else if (no.getDireito() != null) {
				no.setValor(sucessor(no));
				no.setDireito(removeNo(no.getDireito(), no.getValor()));
			} else {
				no.setValor(predecessor(no));
				no.setEsquerdo(removeNo(no.getEsquerdo(), no.getValor()));
			}
		}
		return no;
	}

	private int sucessor(No no) {
		no = no.getDireito();
		while (no.getEsquerdo() != null)
			no = no.getEsquerdo();
		return no.getValor();
	}

	private int predecessor(No no) {
		no = no.getEsquerdo();
		while (no.getDireito() != null)
			no = no.getDireito();
		return no.getValor();
	}

	public boolean buscaValor(No no, int valor) {
		boolean retornar = false;
		if (no != null) {
			if (no.getValor() == valor) {
				retornar = true;
			} else if (valor < no.getValor()) {
				retornar = buscaValor(no.getEsquerdo(), valor);
			} else {
				retornar = buscaValor(no.getDireito(), valor);
			}
		}
		return retornar;
	}
}
