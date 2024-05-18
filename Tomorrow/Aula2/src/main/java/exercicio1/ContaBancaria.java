package exercicio1;

public class ContaBancaria {

    private String titular;
    private double saldo;
    private int conta;


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public ContaBancaria() {
        // Inicializa os atributos com valores padrão
        this.titular = "";
        this.saldo = 0.0;
        this.conta = 0;
    }

    public ContaBancaria(String titular, double saldo, int conta) {

        this.titular = titular;
        this.saldo = saldo;
        this.conta = conta;
    }


      public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

}

