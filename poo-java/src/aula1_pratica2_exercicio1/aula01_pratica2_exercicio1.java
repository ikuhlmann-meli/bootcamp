package aula1_pratica2_exercicio1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
import java.util.List;

public class aula01_pratica2_exercicio1 {

        public static void main(String[] args) {

            /**
             Objetivo
             Praticar arrays e projeção de dados.
             Exercício 1: Dado um vetor de 10 posições, preenchido pelos valores 52, 10, 85, 1324, 01, 13,
             62, 30, 12 e 127.
             Imprima no console:
             a) Sua ordenação crescente.
             b) Sua ordenação decrescente.
             */

            Integer[] minhaLista = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

            List<Integer> meuArray = Arrays.asList(minhaLista);

            System.out.println("Lista em ordem crescente");
            Collections.sort(meuArray);
            for (Integer num: meuArray) {
                System.out.println(num);
            }
            System.out.println("\n");
            System.out.println("Lista em ordem decrescente");
            Collections.sort(meuArray, Collections.reverseOrder());
            for (Integer num: meuArray) {
                System.out.println(num);
            }
        }
    }
