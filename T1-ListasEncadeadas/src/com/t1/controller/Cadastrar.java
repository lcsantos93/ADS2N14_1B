package com.t1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.t1.model.Contato;
import com.t1.model.Lista;



public class Cadastrar {

	Scanner entrada = new Scanner(System.in);

	Lista inicio = null;

	Lista fim = null;

	Lista aux;

	Lista anterior;

	int op, numero, n, achou;
	
	 public void cadastrarContato  (String nome, Integer num){
		
		Contato contato = new Contato(nome, num);
		Lista novo = new Lista();
		novo.nome = entrada.next();

		System.out.println("Informe o Número");
		// Lista newnum = new Lista();
		novo.num = entrada.nextInt();

		if (inicio == null) {

			inicio = novo;
			fim = novo;

			novo.prox = null;
			novo.ant = null;

			// inicio = newnum;
			// fim = newnum;

			// newnum.prox = null;
			// newnum.ant = null;

		} else {

			novo.prox = inicio;
			inicio.ant = novo;
			novo.ant = null;
			inicio = novo;
			// newnum.prox = inicio;
			// inicio.ant = newnum;
			// newnum.ant = null;

		}
		System.out
				.println("Contato já inserido no início da lista!!");
	 }
	 public void salvarArquivo() 
	
	 { 
		FileWriter arq;
		try {
			arq = new FileWriter("C:\\Users\\Lucas\\Desktop\\contatos.txt",true);

			PrintWriter gravarArq = new PrintWriter(arq);

		
			{
				gravarArq.printf(novo.num + "|" + novo.nome);

			}
		
			arq.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Contato armazenado com sucesso em: C:\\Users\\Lucas\\Desktop\\contatos.txt");
	}

}

	 
	 
	 
	
	

