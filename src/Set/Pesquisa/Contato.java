package Set.Pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;

    private int numero;

    //contrutor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //não repetir nome
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    //to string
    @Override
    public String toString() {
        return "{" + nome + numero+ "}";

    }
}
