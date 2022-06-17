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
		System.out.println("Vamos começar!");
		arvore.percorrer(arvore.raiz, ent, false);
	}
	public static void montarArvore(Arvore ar) {
		No raiz = new No(12, "É um homem?");
        ar.raiz = raiz;
        ar.insereValor(raiz, 6, "Ela é um adulto?");
        ar.insereValor(raiz, 4, "Ela gosta do chaves?");
        ar.insereValor(raiz, 5, "Ela é a Paty?");
        ar.insereValor(raiz, 2, "Ela tem uma boneca?");
        ar.insereValor(raiz, 1, "Ela é a chiquinha?");
        ar.insereValor(raiz, 3, "Ela é a Pops?");
        ar.insereValor(raiz, 10, "Ela tem algum filho?");
        ar.insereValor(raiz, 11, "Ela é a dona Florinda?");
        ar.insereValor(raiz, 8, "Ela é jovem?");
        ar.insereValor(raiz, 7, "Ela é Clodilde?");
        ar.insereValor(raiz, 9, "Ela é A Glória?");
        ar.insereValor(raiz, 20, "Ele é um adulto?");
        ar.insereValor(raiz, 16, "Ele tem muito dinheiro?");
        ar.insereValor(raiz, 14, "Ele mora em um barril?");
        ar.insereValor(raiz, 13, "Ele é o Chaves?");
        ar.insereValor(raiz, 15, "Ele é o Godinez?");
        ar.insereValor(raiz, 18, "Ele está acima do peso?");
        ar.insereValor(raiz, 17, "Ele é o Quico?");
        ar.insereValor(raiz, 19, "Ele é o Nhonho?");
        ar.insereValor(raiz, 22, "Ele tem algum filho?");
        ar.insereValor(raiz, 21, "Ele é o Girafales?");
        ar.insereValor(raiz, 28, "Ele deve o aluguel?");
        ar.insereValor(raiz, 24, "Ele deve o aluguel?");
        ar.insereValor(raiz, 23, "Ele é o seu barriga?");
        ar.insereValor(raiz, 25, "Ele é o seu Madruga?");
	}
}