import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cliente fulano = new Cliente();

        fulano.setNome("Fulano");
        Conta contaCorrente = new ContaCorrente(fulano);
        Conta contaPoupanca = new ContaPoupanca(fulano);

        contaCorrente.depositar(100);
        contaCorrente.transfeir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}
