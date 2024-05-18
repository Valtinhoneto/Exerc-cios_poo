package exercicio2;

public class Triangulo {

    private int base;
    private int altura;


    public Triangulo() {
        this.base = base;
        this.altura = altura;

    }

    public double CalculaPerimetro(){
        double hipotenusa = Math.sqrt(base*base + altura*altura);
        return base + altura + hipotenusa;
    }

    public double CalculaArea(){
        return (base*altura)/2 ;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}

