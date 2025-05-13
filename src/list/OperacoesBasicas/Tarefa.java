package list.OperacoesBasicas;

public class Tarefa  {
    //atributo
    private String descricao;
    // construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    //Alt - Insert To string pa
    @Override
    public String toString() {
        return  descricao;
    }
}
