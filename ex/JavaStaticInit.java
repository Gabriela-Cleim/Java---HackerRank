package ex;

import java.util.Scanner;

public class JavaStaticInit {

    static int b; //cria a variavel e deixa ela visivel para todos da classe
    static int h;
    
    static{
        Scanner scanner = new Scanner(System.in);
        
        b = scanner.nextInt(); //aqui esta atribuindo o valor digitado no scanner
        h = scanner.nextInt();
        
        try{ //esse try vai verificar se esse if é true, ele vai criar essa exception com esse texto
            if(b <= 0 || h <= 0){ 
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception ex){ //aqui vai chamar a exception
            System.out.print(ex);
        }
    }
    public static void main(String[] args) {
        
        if(b > 0 && h > 0){ //se o if dentro do try nao for true, ele vai entrar nesse if e rodar ele trazendo o valor de b * h 
            System.out.println(b * h);
        }

    }
}
