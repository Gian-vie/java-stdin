package secao2;

public class Variaveis {

    public static void main(String[] args) {
        String nome = "Gian";
        int idade = 21;

        System.out.println("Meu nome é " + nome + " idade: " + idade);



        // tipos de variaveis primitivas por peso na memoria
        boolean trueOrFalse = true;
        // NUMERICAS ( _ é ignorado)
        // numericas inteiras
        byte numero1 = 127; // vai de -128 até 128
        short numero2 = 9999; // vai de -32.767 até 32.767
        int numero3 = 999999999; // vai de -2.147.483.647 até 2.147.483.647
        long numero4 = 9_999_999_999_999_999L; // vai de ->
        // -9.223.372.036.854.775.807 até 9.223.372.036.854.775.807 (L no final)
        // numericas fracionais
        float numero5 = 3.000_000_9F; // até 7 digitos decimais (tem q ter F no final)
        double number6 = 3.500_000_999_999_999D; // até 15 digitos decimais (pode ser usado um D no final)
        // texto
        char texto1 = 'a'; // armazena um unico caractere, letra, ou ASCII (tem q ser aspas simples)

        // ** String n é um tipo primitivo, é um obj, ou seja primeira letra tem q ser maiuscula

        

        /* operaçoes aritimeticas */ 

        // se pelo menos 1 dos numeros da operação for double, tera um retorno double,
        // senão o retorno é int independente do resultado

        System.out.println(10 / 3); // retornará 3
        System.out.println(10 / 3.0); // retornará 3.33


        /* TYPE CASTING */
        //tranformação de tipo


        //de valor menor para um maior ou de int para double, é automatico
        int num = 42;
        long numGrande = num;
        double numQuebrado = num;

        //no oposto é necessario declarar e pode haver perda de dados
        double numQuebrado2 = 9.94;
        int num2 = (int) numQuebrado2; // aredonda para baixo, ou seja 9




    }

}
