package desafio.gft.java.banco1;

public abstract class BancoSuper implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected String nomeBanco;
    protected String cliente;
    protected int numeroConta;
    protected int agencia;
    protected double saldo;



    public BancoSuper() {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;

    }

    protected void infosExtrato() {
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numeroConta);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, BancoSuper contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public String getNomeBanco() {
        return nomeBanco;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
