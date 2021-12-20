package aula1_pratica2_exercicio2;

import java.math.BigDecimal;

public class Empresa {

    String nome;
    BigDecimal valorInicial;
    Double taxaDeCrescimento;
    BigDecimal valorAtual;


    public Empresa(String nome, BigDecimal valorInicial, Double taxaDeCrescimento){
        this.nome = nome;
        this.valorInicial = valorInicial;
        this.taxaDeCrescimento = taxaDeCrescimento;
        this.valorAtual = valorInicial;
    }

    public void Incrementar(){
        //// Não mexa aqui!!!!!!!!!!!!
        this.valorAtual = this.valorAtual.add((this.valorAtual).multiply( new BigDecimal(  taxaDeCrescimento / 100)));

    }
    public String getValorAtualFormatado(){
        return String.format("$%,.2f", this.valorAtual.divide(new BigDecimal("1000000"))) + "m";
    }
}
