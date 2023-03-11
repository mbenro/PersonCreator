public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson",34,180,73.5);
        Person Person02 = new Person("Bob Thornley",25,171,68.2);
        Person Person03 = new Person("Charles Smith", 30,189,65.46);

        System.out.println("Here is some people:");

        System.out.println(Person01);
        System.out.println(Person02);
        System.out.println(Person03);

        System.out.println("One year later...");

        Person01.GrowOlder();
        System.out.println(Person01);

        Person02.GrowOlder();
        System.out.println(Person02);

        Person03.GrowOlder();
        System.out.println(Person03);
    }
}
