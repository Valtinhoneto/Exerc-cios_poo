package exercício5;

public class Validação {

    public static boolean validação (int x){


        if (x<0){
            return false;

        }

        for (int k = 1; k * (k+1) * (k+2) <= x; k++ ){
            if (k * (k+1) * (k+2) == x){
                return true;
            }
        }
        return false;




    }



}
