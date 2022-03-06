package desafio.gft.java.banco1;

public class ContaPoupanca extends BancoSuper{


    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato Conta Poupança ====");
        infosExtrato();
    }


}
