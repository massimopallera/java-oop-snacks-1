package org.lessons.java.snacks3;

public class RegistroStudenti {

    private Studente listaStudenti[] = new Studente[0];

    public void addStudente(Studente studente){

        Studente temp[] = new Studente[listaStudenti.length + 1];

        System.arraycopy(listaStudenti, 0, temp, 0, this.listaStudenti.length);
        temp[listaStudenti.length] = studente;

        this.listaStudenti = temp;
    }

    public void printRegistro(){
        for (int i = 0; i < this.listaStudenti.length; i++) {

                System.out.println(this.listaStudenti[i].getData());
        }
    }

}
