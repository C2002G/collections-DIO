package records;

public class Main {
    public static void main(String[] args) {
        //record cria um construtor mais simples
       var person = new Person("claudio", 2008);
        System.out.println(person);
        System.out.println(person.ano());
    }
}
