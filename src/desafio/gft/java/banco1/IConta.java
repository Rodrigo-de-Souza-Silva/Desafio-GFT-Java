package desafio.gft.java.banco1;

public interface IConta {

        void sacar(double valor);

        void depositar(double valor);

        void transferir(double valor, BancoSuper contaDestino);

        void imprimirExtrato();

}
