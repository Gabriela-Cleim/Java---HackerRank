package ex;

import java.util.Scanner;

public class JavaEndOffile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //cria o scanner
        int i = 1; //int q vai ser utilizado para contar os itens da lista
        while (scanner.hasNext()) { //enquanto o scanner tiver itens ele roda o que estiver dentro do while
            System.out.println(i + " " + scanner.nextLine()); //printa o numero do item e a iem da scanner
            i++; //acescenta mais um numero
        }
        scanner.close();
    }
}
