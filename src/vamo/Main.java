package vamo;

public class Main {
    public static void main(String[] args) {
        Mochila mochila = new Mochila();


        mochila.adicionar(new Item("caderno"));
        mochila.adicionar(new Item("estojo"));
        mochila.adicionar(new Item("pc"));

        mochila.mostrarItem();
    }
}