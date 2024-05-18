package exercicio3;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto() {

    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade inválida para diminuir.");
        }

    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("A quantidade para aumentar deve ser positiva.");
        }

    }

     public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidade);

}
}



