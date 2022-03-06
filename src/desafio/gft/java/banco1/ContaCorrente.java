package desafio.gft.java.banco1;

public class ContaCorrente extends BancoSuper{


    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato Conta Corrente ====");
        infosExtrato();
    }
}
