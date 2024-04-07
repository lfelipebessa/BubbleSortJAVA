import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int tam;
        int numeros[] = new int[25];

        System.out.println("Informe o número de valores a serem gerados:");

        // abrir scanner
        Scanner sc = new Scanner(System.in);

        // recebe o valor digitado pelo usuário
        tam = sc.nextInt();

        // recebendo valores
        for (int i = 0; i < tam; i++) {
            System.out.println("Informe o " + (i + 1) + " valor:");
            numeros[i] = sc.nextInt();
        }

        // imprimindo o vetor original
        System.out.print("Vetor original: ");
        System.out.print("[ ");

        for (int j = 0; j < tam; j++) {
            System.out.print(numeros[j]);
            if (j < tam - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        // variavel temporaria para realizar a ordenacao
        int temp;
        // ordenando os vetores de maneira crescente(bubble sort)
        for (int k = 0; k < tam - 1; k++) {
            for (int l = 0; l < tam - 1; l++) {
                if (numeros[l] > numeros[l + 1]) {
                    temp = numeros[l];
                    numeros[l] = numeros[l + 1];
                    numeros[l + 1] = temp;
                }
            }
        }
        // printando valores ordenados
        System.out.print("Vetor ordenado: [ ");
        for (int m = 0; m < tam; m++) {
            System.out.print(numeros[m]);
            if (m < tam - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        sc.close();
    }
}
