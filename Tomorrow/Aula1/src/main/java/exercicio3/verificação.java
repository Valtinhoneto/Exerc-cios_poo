package exercicio3;

public class verificação {


    public void verificação (int x){


        String str = String.valueOf(x);
        char vc = str.charAt(0);
        char vc2 = str.charAt(str.length()-1);

        if (vc == vc2){
            System.out.println("1igual ao ultimo");;
        }else {

            System.out.println("Não tem igual ao ultimo");
            ;
        }


    }
 }

