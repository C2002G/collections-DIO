package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLiivros {
    private List<Livro> livroList;

    public CatalogoLiivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if (!livroList.isEmpty()){//Empty é vazio, ! (senao estiver vazia)
            for(Livro l : livroList){//declarando a variavel l como um buscador de objetos dentro da Lista de livros
                if(autor.equalsIgnoreCase(l.getAutor())){
                    livrosAutor.add(l);
                }
            }
            return livrosAutor;
        }else {
            throw new RuntimeException("Esta vazia a lista");
        }

    }

    public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPortTitulo = null;
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPortTitulo = l;
                    break;
                }
            }
        }
        return livroPortTitulo;
    }


    public static void main(String[] args) {
        CatalogoLiivros catalogoLiivros = new CatalogoLiivros();
        catalogoLiivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLiivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLiivros.adicionarLivro("Livro 2", "Autor 1", 2022);
        catalogoLiivros.adicionarLivro("Livro 3", "Autor 1", 2021);
        catalogoLiivros.adicionarLivro("Livro 4", "Autor 3", 2023);
        catalogoLiivros.adicionarLivro("Livro 5", "Autor 2", 2022);


        System.out.println(catalogoLiivros.pesquisaPorAutor("Autor 2"));
        //System.out.println(catalogoLiivros.pesquisarPorIntervaloAnos(2020 ,2022));
        //System.out.println(catalogoLiivros.pesquisarPorTitulo("Livro 2"));

    }
}
