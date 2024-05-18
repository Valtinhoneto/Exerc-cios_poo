package exercício5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        System.out.println("Digite o numero triangular: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        Validação validação = new Validação();
        validação.validação(x);

        if (Validação.validação(x)){

            System.out.println(x + "Esse numero é triangualr");

        }else {
            System.out.println("não é triangular");

        }
    }
}
