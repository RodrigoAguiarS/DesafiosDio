/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
 */
package br.com.rodrigo;

import java.io.IOException;
import java.util.Scanner;

public class ParOuÍmpar {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String sinal = " ";
        String oddEven = " ";
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int number = leitor.nextInt();
            if (number != 0){
                if (number < 0){
                    sinal = "NEGATIVE";
                }
                if (number > 0){
                    sinal = "POSITIVE";
                }
                if (number % 2 == 0){
                    oddEven = "EVEN";
                }
                if (number % 2 != 0){
                    oddEven = "ODD";
                }
                System.out.println(oddEven + " " + sinal);
            }
            else{
                System.out.println("NULL");
            }
        }
    }
}
