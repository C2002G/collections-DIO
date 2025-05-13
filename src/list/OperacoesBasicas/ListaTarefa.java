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

    public int ObterNmrTarefas(){
        return tarefaList.size();
    }

    public void ObterDescricoees(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("o numero total de tarefas é " + listaTarefa.ObterNmrTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 5");
        System.out.println("o numero total de tarefas é " + listaTarefa.ObterNmrTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("o numero total de tarefas é " + listaTarefa.ObterNmrTarefas());

        listaTarefa.ObterDescricoees();
    }
}
