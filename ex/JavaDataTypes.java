package ex;

import java.util.Scanner;

public class JavaDataTypes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int testCases = scanner.nextInt(); //Pede a quantidade de casos, quantas vezes esse cod tem q rodar
        
        for(int i = 0; i < testCases; i++){ //Inicia o looping, enquanto i for menor que a quantidade de casos, ele vai rodar o codigo dentro do for
            try{ //inicia o bloco do try catch
                long a = scanner.nextLong(); //usei um long por ser o maior e poder armazenar do menor ao maior dado
                System.out.println(a + " can be fitted in: ");
                
                if(a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE){ // if que vai verificar se o valor digitado cabe dentro de um byte, short, int e long
                    System.out.println("* byte");
                }
                if(a >= Short.MIN_VALUE && a <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(a >= Long.MIN_VALUE && a <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
                
            }catch(Exception exception){ //aqui é se tiver alguma exception no log, se os casos acima nao se enquadrar no que foi digitado
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    } 
}
