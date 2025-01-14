import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        Integer[] vetor = {5,3,2,4,7,1,0,6};

        for (int i=0; i < vetor.length - 1; i++) {
            for (int j=0; j < vetor.length - 1; j++) {
                if(vetor[j] > vetor[j+1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(vetor));
    }
}