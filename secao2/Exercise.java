package secao2;

public class Exercise {
    /*
     * Criando Constantes
     * Neste exercício, você vai praticar a criação de constantes em Java.
     * Constantes são variáveis cujo valor não pode ser alterado após a sua
     * inicialização. Em Java, elas são definidas usando a palavra-chave final.
     * 
     * Seu objetivo será criar três constantes que representem informações
     * imutáveis. Aqui estão os valores que você deve armazenar:
     * 
     * O valor de PI (3.14159).
     * 
     * O número máximo de tentativas de login permitido (5).
     * 
     * O nome da aplicação ("MeuApp").
     * 
     * Você deverá declarar e inicializar essas constantes na classe Constantes e
     * garantir que os valores não possam ser modificados.
     */


     /*
      * 
      Em Java, para criar uma constante, use a palavra-chave final e declare a constante como static se for compartilhada por todas as instâncias da classe. Certifique-se de que os nomes das constantes sejam escritos em letras maiúsculas separadas por sublinhados, uma convenção comum para constantes.
      */
    final static double PI = 3.14159;
    final static int MAX_LOGIN_ATTEMPTS = 5;
    final static String APP_NAME = "MeuApp";

}
