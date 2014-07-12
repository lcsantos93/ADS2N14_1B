package com.t1.model;

import com.t1.controller.Controller;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Controller controller = new Controller();
		Scanner entrada = new Scanner(System.in);

		Lista inicio = controller.lerArq();

		Lista fim = null;

		Lista aux;

		int op, numero, n, achou;
		do {
			System.out.println("MENU DE OPÇÕES");
			System.out.println("1 - Cadastrar novo Contato");
			System.out.println("2 - Listar Contatos");
			System.out.println("3 - Consultar a lista do fim ao inï¿½cio");
			System.out.println("4 - Remover da Agenda");
			System.out.println("5 - Excluir todos Contatos");
			System.out.println("6 - Sair");
			System.out.print("Opção: ");
			op = entrada.nextInt();
			switch (op) {
			case 1: {
				System.out.println("Informe o nome do Contato:");
				Lista novo = new Lista();
				String nome = entrada.next();

				System.out.println("Informe o Número");
				// Lista newnum = new Lista();
				Integer num = entrada.nextInt();

				Contato contato = new Contato(nome, num);
				novo.setContato(contato);
				controller.addContato(contato);

				if (inicio == null) {

					inicio = novo;
					fim = novo;

					novo.setProx(null);
					novo.setAnt(null);

				} else {

					novo.setProx(inicio);
					novo.setAnt(null);
					inicio.setAnt(novo);
					inicio = novo;

				}
				System.out.println("Contato armazenado com sucesso");
				break;
			}

			case 2: {
				if (inicio == null) {

					System.out.println("Lista vazia!!");
				} else {

					System.out.println("Consultando a lista do inicio ao fim");
					aux = inicio;
					while (aux != null) {
						System.out.println("_________________");
						System.out
								.println("Nome:" + aux.getContato().getNome());
						System.out.println("Numero:"
								+ aux.getContato().getNumero());
						aux = aux.getProx();
					}
				}
				break;
			}
			case 3: {
				if (inicio == null) {
					System.out.println("Lista vazia!!");
				} else {

					System.out.println("Consultando a lista do fim ao inicio");
					aux = fim;
					while (aux != null) {
						System.out.println(aux.getContato().getNumero());
						aux = aux.getAnt();
					}
				}
				break;
			}
			case 4: {
				if (inicio == null) {

					System.out.println("Lista vazia!!");
				} else {

					System.out.print("Digite o elemento a ser removido: ");
					numero = entrada.nextInt();

					aux = inicio;
					achou = 0;
					while (aux != null) {
						if (aux.getContato().getNumero() == numero) {

							achou = achou + 1;
							if (aux == inicio) {

								inicio = aux.getProx();
								if (inicio != null) {
									inicio.setAnt(null);
								}
								aux = inicio;
							} else if (aux == fim) {
								// o número é último da lista
								fim = fim.getAnt();
								fim.setProx(null);
								aux = null;
							} else {
								// o número está no meio da lista
								aux.getAnt().setProx(aux.getProx());
								aux.getProx().setAnt(aux.getAnt());
								aux = aux.getProx();
							}
						} else {
							aux = aux.getProx();
						}
					}
					if (achou == 0) {
						System.out.println("Número não encontrado");
					} else if (achou == 1) {
						System.out.println("Número removido 1 vez");
					} else {
						System.out.println("Numero removido " + achou
								+ " vezes");
					}
				}
				break;
			}

			case 5: {
				if (inicio == null) {
					// a lista está vazia
					System.out.println("Lista vazia!!");
				} else {
					// a lista esvaziada
					inicio = null;
					System.out.println("Lista esvaziada");
				}
				break;
			}

			case 6: {
				break;
			}

			default: {
				System.out.println("Opção Inválida");
			}

			}

		} while (op != 6);

	}
}
