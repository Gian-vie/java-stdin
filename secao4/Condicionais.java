package secao4;

import javax.sound.midi.SysexMessage;

public class Condicionais {
    /*
     * PROBLEMA NA COMPARAÇÂO DE STRING
     * 
     * O == compara memoria, e pode n retornar sempre o true mesmo as strings sendo
     * iguais
     * modo certo é usar o equal(); que compara o conteudo da string caractere por
     * caractere
     * ou equalsIgnoreCase() que ignora letras maisculas ou minusculas
     * 
     */
    public static void main(String[] args) {

        String str1 = "java";

        String str2 = new String("java");

        String str3 = "JAVA";

        // System.out.println(str1 == str2); // retorna False
        // System.out.println(str1.equals(str2)); //retorna true
        // System.out.println(str1.equals(str3)); //retorna false
        // System.out.println(str1.equalsIgnoreCase(str3)); // retorna true

        // if, else if, else (bem igual a javascript)
        if (str1 == str2) {
            System.err.println("n vai entrar");
        } else if (str1.equals(str3) && str1 == "java") {
            System.err.println("tbm n vai entrar");
        } else {
            System.err.println("entra aqui");
        }

        int diaDaSemana = 3;

        switch (diaDaSemana) {
            case 1:
                System.err.println("domingo");
                break;
            case 2:
                System.err.println("segunda");
                break;
            case 3:
                System.err.println("terça");
                break;
            case 4:
                System.err.println("quarta");
                break;
            case 5:
                System.err.println("quinta");
                break;
            case 6:
                System.err.println("sexta");
                break;
            case 7:
                System.err.println("sabado");
                break;

            default:
                break;
        }
    }
}
