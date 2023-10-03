package org.example;

public class Conta {

    private String numeroConta;
    private double valorConta;

    public Conta(String numeroConta, double valorConta) {
        this.numeroConta = numeroConta;
        this.valorConta = valorConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getValorConta() {
        return valorConta;
    }
}
