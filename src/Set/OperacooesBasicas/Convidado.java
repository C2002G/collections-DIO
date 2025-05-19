package Set.OperacooesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    //construtor

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //gwttwr caso eu queira buscar info

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    //para fazer com q o CodigoConvite seja unico e não tenha duplicações (equals and hashcode)

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }


    //converter para o print sair formatado

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
