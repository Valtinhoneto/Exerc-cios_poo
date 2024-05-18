package exercício6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro n:");
        int n = sc.nextInt();

        System.out.println("Digite " + n + " números inteiros positivos:");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Fatoriais dos números fornecidos:");

        for (int i = 0; i < n; i++) {
            System.out.print(Validação.validação(a[i]) + " ");
        }

        sc.close();
    }
}
