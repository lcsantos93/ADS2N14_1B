package com.t1.model;

import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Lista inicio = null;

		Lista fim = null;

		Lista aux;

		Lista anterior;

		int op, numero, n, achou;
		do {
			System.out.println("\nMENU DE OP��ES\n");
			System.out.println("1 - Cadastrar novo Contato");
			System.out.println("2 - Inserir no fim da lista");
			System.out.println("3 - Listar Contatos");
			System.out.println("4 - Consultar a lista do fim ao in�cio");
			System.out.println("5 - Remover da Agenda");
			System.out.println("6 - Excluir todos Contatos");
			System.out.println("7 - Sair");
			System.out.print("Digite sua op��o: ");
			op = entrada.nextInt();
			if (op < 1 || op > 7) {
				System.out.println("Op��o inv�lida!!");
			} else {
				if (op == 1) {
					
					
				}
				if (op == 2) {
				System.out.println("Digite o n�mero a ser inserido no fim da lista: ");
				Lista novo = new Lista();
				novo.num = entrada.nextInt();
				if (inicio == null) {

					inicio = novo;
					fim = novo;
					novo.prox = null;
					novo.ant = null;
				} else {
					fim.prox = novo;
					novo.ant = fim;
					novo.prox = null;
					fim = novo;
				}
				System.out.println("N�mero inserido no fim da lista!!");
			}
			if (op == 3) {
				if (inicio == null) {
					System.out.println("Lista vazia!!");
				} else {

					System.out
							.println("\nConsultando a lista do in�cio ao fim\n");
					aux = inicio;
					while (aux != null) {
						System.out.print("\n_________________\n");
						System.out.print(aux.num + "\n ");
						System.out.printf(aux.nome + " ");
						aux = aux.prox;
					}
				}
			}
			if (op == 4) {
				if (inicio == null) {
					System.out.println("Lista vazia!!");
				} else {

					System.out
	.println("\nConsultando a lista do fim ao in�cio\n");
							aux = fim;
					while (aux != null) {
						System.out.print(aux.num + " ");
						aux = aux.ant;
					}
				}
			}
			if (op == 5) {
				if (inicio == null) {

					System.out.println("Lista vazia!!");
				} else {

					System.out.print("\nDigite o elemento a ser removido: ");
					numero = entrada.nextInt();

					aux = inicio;
					achou = 0;
					while (aux != null) {
						if (aux.num == numero) {

							achou = achou + 1;
							if (aux == inicio) {

								inicio = aux.prox;
								if (inicio != null) {
									inicio.ant = null;
								}
								aux = inicio;
							} else if (aux == fim) {
								// o n�mero � o �ltimo da lista
								fim = fim.ant;
								fim.prox = null;
								aux = null;
							} else {
								// o n�mero est� no meio da lista
								aux.ant.prox = aux.prox;
								aux.prox.ant = aux.ant;
								aux = aux.prox;
							}
						} else {
							aux = aux.prox;
						}
					}
					if (achou == 0) {
						System.out.println("N�mero n�o encontrado");
					} else if (achou == 1) {
						System.out.println("N�mero removido 1 vez");
					} else {
						System.out.println("Numero removido " + achou + " vezes");
					}
				}
			}

			if (op == 6) {
				if (inicio == null) {
					System.out.println("Lista vazia!!");
	} else {
					// a lista esvaziada
					inicio = null;
					System.out.println("Lista esvaziada");
				}
			}

		} while (op != 7);
	}
}