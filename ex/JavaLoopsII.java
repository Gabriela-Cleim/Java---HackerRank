package ex;

import java.util.Scanner;

public class JavaLoopsII {
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in); //vai pedir a entrada do numero inteiro

        System.out.println("Digite o T: ");
        int t = in.nextInt(); //vai armazenar o valor digitado

        for (int i = 0; i < t; i++) { //vai iniciar o looping. i incia com 0, se i for menor q t(valor digitado pelo usuario), vai acrescentar 1 valor ao i e rodar oq esta dentro do for ate o i for igual ao t
            System.out.println("Digite o A: ");
            int a = in.nextInt(); //vai pedir pra digitar um valor e armazenar na variavel a
            System.out.println("Digite o B: ");
            int b = in.nextInt(); //vai pedir pra digitar um valor e armazenar na variavel b
            System.out.println("Digite o N: ");
            int n = in.nextInt(); //vai pedir pra digitar um valor e armazenar na variavel n

            int sum = 0;
            int mult = 1;
            int subtotal = 0;

            for (int j = 1; j <= n; j++) {
                int total = mult * b; // 5
                sum = total + subtotal; // 5
                System.out.print("Esta é a soma: " + (sum + a) + " "); //10
                mult = mult * 2; //2
                subtotal = sum; // 5
            }
            System.out.println(" ");
        }

        in.close();
    }
}