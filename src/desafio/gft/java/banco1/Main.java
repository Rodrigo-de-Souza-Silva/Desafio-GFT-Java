package desafio.gft.java.banco1;

public class Main {

    public static void main(String[] args) {
        BancoSuper cc = new ContaCorrente();
        BancoSuper poupanca = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(90, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}