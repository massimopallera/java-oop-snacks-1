package org.lessons.java.snacks;

public class Studente {
    private String nome, cognome; 
    private int eta;

    Studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getData(){
        return nome + " " + cognome + ", " + eta + " anni";
    }
}
