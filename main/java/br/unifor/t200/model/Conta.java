package br.unifor.t200.model;

import java.util.ArrayList;

public class Conta {


    private double valor;
    private String data;
    private ArrayList<Produtos> carrinho;

    public Conta(double valor, String data, ArrayList<Produtos> carrinho) {
        this.valor = valor;
        this.data = data;
        this.carrinho = carrinho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }



    public ArrayList<Produtos> getCarrinho() {
        return carrinho;
    }


}
