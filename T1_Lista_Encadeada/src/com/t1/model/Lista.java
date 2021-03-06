package com.t1.model;

public class Lista {

    private Lista prox;
    private Lista ant;
    private Contato contato;

    public Lista getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(Lista prox) {
        this.prox = prox;
    }

    /**
     * @return the ant
     */
    public Lista getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(Lista ant) {
        this.ant = ant;
    }

    public Lista(Contato contato, Lista prox, Lista ant) {

        this.contato = contato;
        this.prox = prox;
        this.ant = ant;
    }

    public Lista() {
        contato = new Contato();
        // TODO Auto-generated constructor stub
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

}
