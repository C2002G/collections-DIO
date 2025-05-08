package estacionamento;

public class Main {
    public static void main(String[] args) {
        var carro1 = new Carro();
        var carro2 = new Carro();
        var carro3 = new Carro();

        carro1.setMarca("chevrolet");
        carro1.setAno(2002);
        carro2.setMarca("hb20");
        carro2.setAno(2021);
        carro3.setMarca("fiat");
        carro3.setAno(1999);

        System.out.println(carro1.getAno() +" "+ carro1.getMarca());
        System.out.println(carro2.getAno() +" "+ carro2.getMarca());
        System.out.println(carro3.getAno() +" "+ carro3.getMarca());



    }
}
