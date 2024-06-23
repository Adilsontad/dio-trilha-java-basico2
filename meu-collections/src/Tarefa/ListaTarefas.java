package Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> TarefaList;

    public ListaTarefas() {
        this.TarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        TarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> TarefasParaRemover = new ArrayList<>();
        for(Tarefa t  : TarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                TarefasParaRemover.add(t);
            }
        }
        TarefaList.removeAll(TarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return TarefaList.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(TarefaList);
    }

public static void main(String[] args) {
    ListaTarefas listaTarefa = new ListaTarefas();
    System.out.println("o número total é; "+ listaTarefa.obterNumeroTotalTarefas());
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");
    System.out.println("o número total é; "+ listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.removerTarefa("Tarefa 2");
    System.out.println("o número total é; "+ listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricaoTarefas();
}

}
