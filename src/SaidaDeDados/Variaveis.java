package SaidaDeDados;

import java.util.Locale;

public class Variaveis {

    public static void main(String[] args) {
        // declarando String
        String name = "Polly";
        System.out.println("Oi, me chamo " + name);

        // variavel com ponto flutuante
        double numberFlutuante = 10.48563;
        System.out.println(numberFlutuante);

        //imprimir formatado.
        //%n ou \n significa quebra de linha
        //%.2f mascara de formatação pra delimitar casas decimais.
        double numberDelimitado = 10.48563;
        System.out.printf("%.2f%n ", numberDelimitado);

        // imprimir com quatro casas decimais
        //%.4f
        double numberDelimitado2 = 10.48563;
        System.out.printf("%.4f%n ", numberDelimitado2);


        //retirando a virgula
        double numberDelimitado3 = 10.48563;
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n ", numberDelimitado3);

        //concatenando
        System.out.println("Resultado = " + numberDelimitado2 + " metros.");

        //concatenando com o printf imprimindo duas casas decimais
        System.out.printf("Resultado = %.2f metros%n" , numberDelimitado2);

        // marcadores para entrar variaveis
        //%f = flutuante
        //%d = inteiro
        //%s = texto
        //%n = quebra de linha

        String nome = "Poliana";
        int idade = 29;
        double renda = 1600.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}
