import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fatorial");

        Scanner in = new Scanner(System.in);
        int res = 0;
        System.out.println("Insira um valor: ");
        int valor = in.nextInt();

        for (int i=valor; i > 0; i--) {
            res = fatorial(valor);
        }

        System.out.println("Resultado fatorial: " + res);
    }

    private static int fatorial(Integer i) {
        if (i == 0) {
            return 1;
        } else {
            return i * fatorial(i-1);
        }
    }
}