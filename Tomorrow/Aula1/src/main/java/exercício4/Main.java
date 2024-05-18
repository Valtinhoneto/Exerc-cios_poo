package exercício4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();
        System.out.print("Digite o valor de i: ");
        int i = sc.nextInt();
        System.out.print("Digite o valor de j: ");
        int j = sc.nextInt();

        Validação validação = new Validação();
        validação.validação(n, i, j);




        sc.close();


    }
}
