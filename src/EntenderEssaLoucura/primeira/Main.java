package EntenderEssaLoucura.primeira;

public class Main {
    public static void main(String[] args) {
        var male = new Person();

        male.setName("csadad");
        male.setAge(23);

        var female = new Person();


        female.setAge(32);
        female.setName("fasdfgg");

        System.out.println(male.getName() + male.getAge());
        System.out.println(female.getName() + female.getAge());
    }

}
