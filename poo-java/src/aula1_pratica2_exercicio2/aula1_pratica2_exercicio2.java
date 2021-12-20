package aula1_pratica2_exercicio2;

import java.math.BigDecimal;

public class aula1_pratica2_exercicio2 {

    public static void main(String[] args) {
        /**
         * Exercício 2: Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em
         * R$ 1,13 milhão e possui uma média de crescimento anual de 148%. Uma concorrente do ramo,
         * “Empresa Y”, é avaliada em R$ 18,4 milhões e com sua média de crescimento anual em 32%.
         * Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a
         * empresa X ultrapasse a empresa Y em seu valor de mercado.
         */

        Integer anoAtual = 2021;

        Empresa empresaX = new Empresa("Empresa X", new BigDecimal("1130000"), 148d);

        Empresa empresaY = new Empresa("Empresa Y",  new BigDecimal("18400000"), 32d);

        empresaY.Incrementar();
        String valor = String.format("$%,.2f", empresaY.valorAtual.divide(new BigDecimal("1000000"))) + "m";
        System.out.println(valor);

        while (empresaY.valorAtual.compareTo(empresaX.valorAtual) == 1){
            System.out.println(empresaX.nome + " - 01/01/" + anoAtual + " - Valor da empresa: " + empresaX.getValorAtualFormatado());
            System.out.println(empresaY.nome + " - 01/01/" + anoAtual + " - Valor da empresa: " + empresaY.getValorAtualFormatado());
            empresaY.Incrementar();
            empresaX.Incrementar();
            anoAtual++;
        }
    }
}
