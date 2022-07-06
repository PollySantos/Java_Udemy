package ProcessamentoDados;

import java.util.Scanner;

public class ProcessamentoDadosDois {

    public static void main(String[] args) {
        // TODO Ex1: ler texto até a quebra de linha nextLine.

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // TODO Ex2: ler texto até a quebra de linha pendente, a linha s2 foi consumida entao se resolve um nextline extra, (limpar buffer e leitura).

        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);

        int x;
        String S1, S2, S3;

        x = Sc.nextInt();
        Sc.nextLine();// fazer para ser consumida e n fica pendente
        S1 = Sc.nextLine(); // linha consumida.
        S2 = Sc.nextLine();
        S3 = Sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);

    }
}
