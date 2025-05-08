package EntenderEssaLoucura.primeira;

public class Person {

    private String name;

    private int age;

    public String getName() {
        return name;
    }
    //criei o metodo/ setname com string variavel name(escrito em branco)
    public void setName(String name) {
        //thisname é o name declarado anteriormente q é atribuido ao name branco q é o name do Set
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
