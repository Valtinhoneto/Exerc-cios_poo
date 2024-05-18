package exercício7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        System.out.print("Digite o cumprimento da hipotenusa: ");
        for (int c=1; c<=num; c++) {
            if (hipotenusa(c)){
                System.out.println(c + "");

            }
        }

    }


    public static boolean hipotenusa (int c){
        for (int v=1; v<=c; v++){
            for (int b =v; b<c; b++){
                if (v*v +b*b == c*c){
                    return true;

                }
            }
        } return false;

    }
}
