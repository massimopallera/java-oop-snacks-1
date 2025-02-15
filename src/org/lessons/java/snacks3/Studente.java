package org.lessons.java.snacks3;

public class Studente {

    private String nome;
    private String cognome;
    private String codiceFiscale;

    Studente(String nome, String cognome, String codiceFiscale){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getData(){
        return this.nome + " " + this.cognome;
    }
    
}
