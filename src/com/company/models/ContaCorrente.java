package com.company.models;

public class ContaCorrente extends Conta implements GravarImposto{

    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    @Override
    public double imposto(double porc){
      return 10.0;
    }

    @Override
    public void sacar(double valor){
        if(this.getSaldo() >= valor + valor*this.imposto(0.01)){
            this.setSaldo(getSaldo() - (valor + valor*this.imposto(0.01)));
            System.out.println("Valor sacado!");
        } else{
            System.out.println("está sem saldo!");
        }
    }

}
