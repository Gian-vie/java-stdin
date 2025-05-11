package secao3;

import java.util.Scanner;

public class tabuada {
    
    public static void main(String[] args) {

        System.out.println("Digite um número");
        
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        System.out.println("Tabuada do " + num);

        for( int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        scanner.close();
    }

}
