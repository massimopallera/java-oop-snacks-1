package org.lessons.java.snacks2;

public class ContoBancario {

    String numeroConto;
    float saldo;

    ContoBancario(String numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public void depositaDenaro(float depositato){
        this.saldo += depositato;
    }
    public void prelevaDenaro(float preleva){
        this.saldo -= preleva;
    }
    public float getSaldo(){
        return this.saldo;
    }

}
