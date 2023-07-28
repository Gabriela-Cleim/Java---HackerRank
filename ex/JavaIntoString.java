package ex;

import java.util.Scanner;

public class JavaIntoString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //recebe o inteiro
        String m = String.valueOf(n); //Converte o valor de n para string

        scanner.close();

        if (n == Integer.parseInt(m)) { //se n for igual ao valor de m (Integer.parseInt converte um valor para inteiro)
            System.out.println("Good Job");

        } else {
            System.out.println("Wrong answer");
        }

    }
}
