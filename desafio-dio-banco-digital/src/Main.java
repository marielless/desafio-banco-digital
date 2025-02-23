public class Main {
    public static void main(String[] args) {
        Cliente marielle = new Cliente();
        marielle.setNome("Marielle");

        Conta cc = new ContaCorrente(marielle);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(marielle);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
