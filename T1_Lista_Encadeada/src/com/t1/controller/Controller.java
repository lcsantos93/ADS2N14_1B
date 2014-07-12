package com.t1.controller;

import com.t1.model.Contato;
import com.t1.model.Lista;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {

    private FileWriter arq;

    public Controller() {
        try {
            if (!new File("contatos.txt").exists()) {
                System.out.println("Arquivo não encontrado!! Criando Arquivo...");
                new File("contatos.txt").createNewFile();
            }
            arq = new FileWriter("contatos.txt", true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void addContato(Contato contato) {
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.println(contato.getNumero() + "|" + contato.getNome());
    }

    public Lista lerArq() throws FileNotFoundException, IOException {
        Lista lista = new Lista();
        FileInputStream stream = new FileInputStream("contatos.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        while (linha != null) {
            lista.setAnt(lista);
            lista.setProx(null);
            Contato c = new Contato();
            String numero = linha.substring(0, linha.indexOf('|'));
            String nome = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
            c.setNome(nome);
            c.setNumero(Integer.parseInt(numero));
            lista.setContato(c);
            linha = br.readLine();
        }

        return lista;
    }

}
