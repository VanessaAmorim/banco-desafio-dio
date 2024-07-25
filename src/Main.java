//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Cliente elton = new Cliente();
        elton.setNome("elton");

        Conta cc = new ContaCorrente(elton);
        Conta poupanca = new ContaPoupanca(elton);

        cc.depositar(500);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}