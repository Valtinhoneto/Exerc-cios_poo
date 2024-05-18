package exercicio2;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Verificacao verificacao = new Verificacao();

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        verificacao.verificacao(x);

    }
}


