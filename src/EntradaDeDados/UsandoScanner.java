package EntradaDeDados;

import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {

        // TODO Ex: ler uma palavra apartir do teclado (String)
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        sc.close();


        // TODO Ex: ler um numero inteiro (inteiro)
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        sc.close();

        // TODO Ex: ler um numero inteiro (flutuante)
        double a;
        a = sc.nextDouble();
        System.out.println("Você digitou: " + a);

        sc.close();

        // TODO Ex: ler um char.
        char f;
        f = sc.next().charAt(0);
        System.out.println("Você digitou: " + f);

        sc.close();

        // TODO Ex: ler vários dados na mesma linha
        String c;
        int d;
        double g;

        c = sc.next();
        d = sc.nextInt();
        g = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);

        sc.close();

    }
}
