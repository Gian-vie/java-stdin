package secao2;

import java.util.Scanner;

public class TeesteScaner {

    public static void main(String[] args) {
        

        // testando Scanner
        Scanner scaner = new Scanner(System.in);

        // mensagem pro usuario
        System.out.println("Digite seu nome");

        // imput pelo terminal
        String nome = scaner.nextLine();

        // impressão do valor 
        System.out.println("Olá " + nome + "!");
    
        // imput com int
        System.out.println("Qual a sua idade?");

        int idade = scaner.nextInt();

        System.out.println("Você tem " + idade + " anos.");


        //Problema do Nextline
        //ao usar o nextline apos um nextint ou nextdouble
        System.out.println("digite numero");
        
        int n = scaner.nextInt();

        scaner.nextLine(); // serve para interceptar o erro e fazer com que funcione

        System.out.println("Digite um texto");

        String txt = scaner.nextLine();

        System.out.println("numero: " + n + " e txt: " + txt);

        
        /* FECHAMENTO DO SCANNER para evitar memory leak (vazamento de memoria) */
        scaner.close();
    
    }


}