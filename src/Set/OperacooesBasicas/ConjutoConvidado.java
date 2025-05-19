package Set.OperacooesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidado {
    //atributo     nome desse set (convidadoSet)
    private Set<Convidado> convidadoSet;

    public ConjutoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    //metodos
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }


    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjutoConvidado conjutoConvidado = new ConjutoConvidado();
        System.out.println("Existem "+ conjutoConvidado.contarConvidados() + " convidados dentro do set de convidados ");

        conjutoConvidado.adicionarConvidado("Convidado 1 " , 1234);
        conjutoConvidado.adicionarConvidado("Convidado 2 " , 1235);
        conjutoConvidado.adicionarConvidado("Convidado 3 " , 1235);
        conjutoConvidado.adicionarConvidado("Convidado 4 " , 1236);

        System.out.println("Existem "+ conjutoConvidado.contarConvidados() + " convidados dentro do set de convidados ");

        conjutoConvidado.exibirConvidados();
        conjutoConvidado.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem "+ conjutoConvidado.contarConvidados() + " dentro do set de convidados ");

        conjutoConvidado.exibirConvidados();
    }
}
