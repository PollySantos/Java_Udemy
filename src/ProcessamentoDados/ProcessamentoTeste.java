package ProcessamentoDados;

@SuppressWarnings("unused")

public class ProcessamentoTeste {

    public static void main(String[] args) {

        // TODO Casting: Conversão explicita de tipos de dados ( int, double...)

        // TODO exemplo 1
        int x = 5;
        int y = 2 * x;

        System.out.println(x);
        System.out.println(y);
        System.out.printf("%n");

        // TODO exemplo 2
        int p = 5;
        double t = 2 * x;

        System.out.println(p);
        System.out.println(t);
        System.out.printf("%n");

        // TODO exemplo 3
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);
        System.out.printf("%n");

        // TODO exemplo 4
        int a, g;
        double resultado;

        a = 5;
        g = 2;

        resultado = (double) a / g;

        System.out.println(resultado);
        System.out.printf("%n");

        // TODO exemplo 5
        double z;
        int e;

        z = 5.0;
        e = (int) z;

        System.out.println(z);

    }

}