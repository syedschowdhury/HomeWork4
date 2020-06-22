package polymorphysm;

public class Test {
    public static void main(String[] args) {

        Person per = new Person();
        per.profile();

        per = new Student();
        per.profile();

        per = new Teacher();
        per.profile();

    }
}
