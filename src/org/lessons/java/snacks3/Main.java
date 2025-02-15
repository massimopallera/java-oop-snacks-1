package org.lessons.java.snacks3;

public class Main {
    public static void main(String[] args) {
        
        RegistroStudenti nuovoR = new RegistroStudenti();

        nuovoR.addStudente(new Studente("Giacomo", "Giacomo", "Losco CF"));
        nuovoR.addStudente(new Studente("Giacomo2", "Giacomo", "Losco CF"));
        nuovoR.addStudente(new Studente("Giacomo3", "Giacomo", "Losco CF"));

        nuovoR.printRegistro();

    }
}
