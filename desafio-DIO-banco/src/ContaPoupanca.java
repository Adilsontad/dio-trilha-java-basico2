public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente venilton) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("***Extrato conta poupança***");
        super.ImprimirInfosComuns();
    }

}
