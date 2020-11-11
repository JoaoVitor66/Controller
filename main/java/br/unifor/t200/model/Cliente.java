package br.unifor.t200.model;

import java.util.ArrayList;

public class Cliente {

        private  String cpf;
        private String nome;
        private String email;
        private String telefone;
        private  boolean devedor = false;
        private double saldoDevendo;
        private ArrayList<Conta> conta;

        public Cliente(String cpf, String nome,String email,String telefone){
            this.cpf = cpf;
            this.nome = nome;
            this.email=email;
            this.telefone=telefone;

        }


    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public boolean isDevedor() {
        return devedor;
    }

    public double getSaldoDevendo() {
        return saldoDevendo;
    }

    public ArrayList<Conta> getConta() {
        return conta;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }

    public void setSaldoDevendo(double saldoDevendo) {
        this.saldoDevendo = saldoDevendo;
    }

    public void setConta(ArrayList<Conta> conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", devedor=" + devedor +
                ", saldoDevendo=" + saldoDevendo +
                ", conta=" + conta +
                '}';
    }
}

