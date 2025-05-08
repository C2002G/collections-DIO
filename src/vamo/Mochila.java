package vamo;

import java.util.ArrayList;
import java.util.List;

public class Mochila {
    private List<Item> itens;

    public Mochila(){
        this.itens = new ArrayList<>();
    }

    public void adicionar(Item item){
        //ta eu declarei o Item como item? é serio q eu so mudei a caixa alta ?
        itens.add(item);
    }

    public void mostrarItem(){
        for (Item i: itens) { //esse Item i: itens não entendi
            System.out.println(i.getNome());
        }
    }
}
