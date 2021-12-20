import java.util.Collections;
import java.util.Vector;
import java.util.List;

public class pooJava {

        public static void main(String[] args) {

            /**
             * Objetivo
             Praticar arrays e projeção de dados.
             Exercício 1: Dado um vetor de 10 posições, preenchido pelos valores 52, 10, 85, 1324, 01, 13,
             62, 30, 12 e 127.
             Imprima no console:
             a) Sua ordenação crescente.
             b) Sua ordenação decrescente.
             */

            List<Integer> minhaLista = new Vector();

            minhaLista.add(52);
            minhaLista.add(10);
            minhaLista.add(85);
            minhaLista.add(1324);
            minhaLista.add(01);
            minhaLista.add(13);
            minhaLista.add(62);
            minhaLista.add(30);
            minhaLista.add(12);
            minhaLista.add(127);

            System.out.println("Lista em ordem crescente");
            Collections.sort(minhaLista);
            for (Integer num: minhaLista) {
                System.out.println(num);
            }
            System.out.println("\n");
            System.out.println("Lista em ordem decrescente");
            Collections.sort(minhaLista, Collections.reverseOrder());
            for (Integer num: minhaLista) {
                System.out.println(num);
            }
        }
    }
