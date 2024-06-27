public class Item {
    String nome;
    int quantidade;
    Double preco;
    public Item(String descricao) {
        //TODO Auto-generated constructor stub
    }
    public Item(String nome2, double preco2, int quantidade2) {
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Item [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public Double getPreco() {
        return preco;
    }
    public String getDescricao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescricao'");
    }

}
