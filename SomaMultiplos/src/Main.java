import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Soma dos multiplos de 3 ou 5");

        Scanner in = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int valor = in.nextInt();

        Integer resultado = somaMultiplos(valor);

        System.out.println("Valor final: " + resultado);
    }

    public static Integer somaMultiplos(Integer valor) {
        int acumulador = 0;
        for (int i=0; i < valor; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                acumulador += i;
            }
        }
        return acumulador;
    }
}