public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente venilton) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("***Extrato conta corrente***");
        super.ImprimirInfosComuns();
    }

   

}

