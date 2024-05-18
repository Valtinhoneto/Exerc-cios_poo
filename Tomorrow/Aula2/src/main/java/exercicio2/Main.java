package exercicio2;

public class Main {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();

        triangulo.setBase(3);
        triangulo.setAltura(4);

        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Área: " + triangulo.CalculaArea());
        System.out.println("Perímetro: " + triangulo.CalculaPerimetro());
        System.out.println();
    }
}