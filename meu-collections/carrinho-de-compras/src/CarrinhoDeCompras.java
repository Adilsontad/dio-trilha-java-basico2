import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Item> ListaCompra;

    public CarrinhoDeCompras() {
        this.ListaCompra = new ArrayList<>();
    }
    public void adicionarItem(String descricao){
        ListaCompra.add(new Item(descricao));
    }
    public void removerItem(String descricao){
        List<Item> ItensParaRemover = new ArrayList<>();
        for(Item z  : ListaCompra){
            if(z.getDescricao().equalsIgnoreCase(descricao)){
                ItensParaRemover.add(z);
            }
        }
        ListaCompra.removeAll(ItensParaRemover);
    }
    public int obterNumeroTotalItens(){
        return ListaCompra.size();
    }
    public void obterDescricaoItens(){
        System.out.println(ListaCompra);
    }

public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    System.out.println("o número total é; "+ carrinho.obterNumeroTotalItens());
    carrinho.adicionarItem("leite 5,34 3 " );
    carrinho.adicionarItem("Tarefa 1");
    carrinho.adicionarItem("Tarefa 2");
    System.out.println("o número total é; "+ carrinho.obterNumeroTotalItens());

    carrinho.removerItem("Tarefa 2");
    System.out.println("o número total é; "+ carrinho.obterNumeroTotalItens());

    carrinho.obterDescricaoItens();

}
public void setListaCompra(List<Item> listaCompra) {
    ListaCompra = listaCompra;
}
}
