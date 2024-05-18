package exercicio2;

public class Verificacao {

    public void verificacao(int x) {
        String str = String.valueOf(x);

        for (int i = 0; i < str.length() - 1; i++) {
            char atual = str.charAt(i);
            char proximo = str.charAt(i + 1);

            if (atual == proximo) {
                System.out.println("O número contém dois dígitos consecutivos iguais.");
                return; // Encerra o método após encontrar a primeira ocorrência
            }
        }

        System.out.println("O número não contém dois dígitos consecutivos iguais.");
    }
}
