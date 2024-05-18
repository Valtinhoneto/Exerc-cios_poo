package exercício4;

import java.util.Set;
import java.util.TreeSet;

public class Validação{

    public void validação(int n ,int i, int j){

        Set <Integer> multiplos = new TreeSet();
        int count = 0;
        int num = 0;

        while (count < n){

            if (num % i == 0 || num % j == 0){
                multiplos.add(num);
                count++;
            }
            num++;

        }

        for (int mult: multiplos){
            System.out.println(mult + "");
        }

    }


}

