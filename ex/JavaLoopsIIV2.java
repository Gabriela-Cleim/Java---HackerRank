package ex;

import java.util.Scanner;

public class JavaLoopsIIV2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // vai pedir a entrada do numero inteiro

        System.out.println("Digite a quantidade de Querys: ");
        int q = in.nextInt(); // vai armazenar a quantidade de querys

        for (int i = 0; i < q; i++) { // vai iniciar o looping. i incia com 0, se i for menor q q(valor digitado pelo usuario), vai acrescentar 1 valor ao i e rodar oq esta dentro do for ate o i for igual ao q
            System.out.println("Digite o A: ");
            int a = in.nextInt(); // vai pedir pra digitar um valor e armazenar na variavel a
            System.out.println("Digite o B: ");
            int b = in.nextInt(); // vai pedir pra digitar um valor e armazenar na variavel b
            System.out.println("Digite o N: ");
            int n = in.nextInt(); // vai pedir pra digitar um valor e armazenar na variavel n

            double serie = 0;
            double termo = (a + b); // a + b pq o valor de A e B sempre se mantem o mesmo 

            for (int j = 0; j < n; j++) { // esse looping vai fazer o calculo matematico de cada query
                if (j == 0) { // se estiver no primeiro looping
                    serie = termo;
                    System.out.print((int) serie + " "); // 10
                } else {
                    serie = serie + Math.pow(2, j) * b;
                    System.out.print((int) serie + " ");
                }
            }
            System.out.println(" ");
        }
        in.close();
    }
}