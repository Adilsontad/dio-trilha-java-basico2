package Tarefa;
public class Tarefa {

    public static void main(String[] args) throws Exception{
        
    }
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    

}
