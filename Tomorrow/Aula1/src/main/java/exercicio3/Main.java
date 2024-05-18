package exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        verificação verificação = new verificação();
        int x = sc.nextInt();

        verificação.verificação(x);
    }
}
