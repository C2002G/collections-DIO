package Map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> novoDicionario;

    public Dicionario() {
        this.novoDicionario = new HashMap<>();
    }
/*
    adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
    exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
    pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
    */

    public void adicionarPalavra(String palavra, String definicao){
        novoDicionario.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if(!novoDicionario.isEmpty()){
            novoDicionario.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(novoDicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraEscolida = null;
        if (!novoDicionario.isEmpty()){
            palavraEscolida = novoDicionario.get(palavra);
            
        }
        return palavraEscolida;
    }


    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("amor", "Minha linda");
        dicionario.adicionarPalavra("loucura", "Gremio");
        dicionario.adicionarPalavra("gataiada", "Ivi , Floki e Skol");
        dicionario.adicionarPalavra("procastinação", "Dificil de lutar contra");


        dicionario.removerPalavra("procastinação");

        dicionario.exibirPalavras();
    }


}
