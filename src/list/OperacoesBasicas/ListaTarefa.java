package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();//criando uma lista de descrições para remover
        for(Tarefa t: tarefaList){ //atribuiu o t para tarefalist
            if(t.getDescricao().equalsIgnoreCase(descricao)){
               tarefasParaRemover.add(t);
            }
        }
       tarefaList.removeAll(tarefasParaRemover);
    }
}
