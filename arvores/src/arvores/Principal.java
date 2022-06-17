package arvores;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		montarArvore(arvore);
		Scanner ent = new Scanner(System.in);
		System.out.println(arvore.buscaValor(arvore.raiz, 28));
		arvore.removeNo(arvore.raiz, 28);
		arvore.imprimeArvore(arvore.raiz);
		System.out.println("Vamos come�ar!");
		arvore.percorrer(arvore.raiz, ent, false);
	}
	public static void montarArvore(Arvore ar) {
		No raiz = new No(12, "� um homem?");
        ar.raiz = raiz;
        ar.insereValor(raiz, 6, "Ela � um adulto?");
        ar.insereValor(raiz, 4, "Ela gosta do chaves?");
        ar.insereValor(raiz, 5, "Ela � a Paty?");
        ar.insereValor(raiz, 2, "Ela tem uma boneca?");
        ar.insereValor(raiz, 1, "Ela � a chiquinha?");
        ar.insereValor(raiz, 3, "Ela � a Pops?");
        ar.insereValor(raiz, 10, "Ela tem algum filho?");
        ar.insereValor(raiz, 11, "Ela � a dona Florinda?");
        ar.insereValor(raiz, 8, "Ela � jovem?");
        ar.insereValor(raiz, 7, "Ela � Clodilde?");
        ar.insereValor(raiz, 9, "Ela � A Gl�ria?");
        ar.insereValor(raiz, 20, "Ele � um adulto?");
        ar.insereValor(raiz, 16, "Ele tem muito dinheiro?");
        ar.insereValor(raiz, 14, "Ele mora em um barril?");
        ar.insereValor(raiz, 13, "Ele � o Chaves?");
        ar.insereValor(raiz, 15, "Ele � o Godinez?");
        ar.insereValor(raiz, 18, "Ele est� acima do peso?");
        ar.insereValor(raiz, 17, "Ele � o Quico?");
        ar.insereValor(raiz, 19, "Ele � o Nhonho?");
        ar.insereValor(raiz, 22, "Ele tem algum filho?");
        ar.insereValor(raiz, 21, "Ele � o Girafales?");
        ar.insereValor(raiz, 28, "Ele deve o aluguel?");
        ar.insereValor(raiz, 24, "Ele deve o aluguel?");
        ar.insereValor(raiz, 23, "Ele � o seu barriga?");
        ar.insereValor(raiz, 25, "Ele � o seu Madruga?");
	}
}