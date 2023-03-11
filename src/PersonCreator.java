public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson",34,180,73.5);
        Person Person02 = new Person("Bob Thornley",25,171,68.2);

        System.out.println(Person01.getName() + ", " + Person01.getAge() + ", " + Person01.getHeight() + ", " + Person01.getWeight());
        System.out.println(Person02.getName() + ", " + Person02.getAge() + ", " + Person02.getHeight() + ", " + Person02.getWeight());

        Person Person03 = new Person("Charles Smith", 30,189,65.46);
        System.out.println("Name: " + Person03.getName() + ", Age: " + Person03.getAge() + ", Height: " + Person03.getHeight() + " cm " + ", Weight: " + Person03.getWeight() + " kg" );

        Person01.GrowOlder();
        System.out.println("Name: " + Person01.getName() + ", Age: " + Person01.getAge() + ", Height: " + Person01.getHeight() + " cm " + ", Weight: " + Person01.getWeight() + " kg" );

        Person02.GrowOlder();
        System.out.println("Name: " + Person02.getName() + ", Age: " + Person02.getAge() + ", Height: " + Person02.getHeight() + " cm " + ", Weight: " + Person02.getWeight() + " kg" );
    }
}
