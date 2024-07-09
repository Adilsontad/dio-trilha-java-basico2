public class ContaCorrente extends Conta {

    @Override
    public void ImprimirExtrato() {
        System.out.println("***Extrato conta corrente***");
        super.ImprimirInfosComuns();
    }

   

}

