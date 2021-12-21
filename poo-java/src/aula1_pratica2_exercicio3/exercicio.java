import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class exercicio {
    public static void main(String[] args) {
        Produto P1 = new Produto("arroz",10.99,2);
        Produto P2 = new Produto("feijao",14.49,1);
        Produto P3 = new Produto("tomate",9.99,5);
        Produto[] Produtos = new Produto[3];
        Produtos[0] = P1;
        Produtos[1] = P2;
        Produtos[2] = P3;

        double valorTotal = 0;

        for (Produto P:Produtos) {
            valorTotal +=  P.precoTotal();
        }
        System.out.println("o valor total da compra e: " + valorTotal );
    }
}
