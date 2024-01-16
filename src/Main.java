
public class Main {
    public static void main(String[] args) {
        Person person =  new Person("Bob", "play");
        Programmer programmer = new Programmer("Anna", "coding","Google");
        Dancer dancer = new Dancer("Jony", "dancing", "Beatles");
        Singer singer = new Singer("Glory","singing","Caramel");

        System.out.println("---------Person Info-----------");
       person.learn();
       person.walk();
       person.eat();

        System.out.println("-----------Progrmmer-----------");
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();

        System.out.println("--------------Dancer-----------");
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        System.out.println("--------------Singer------------");
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singer();
        singer.playGuitar();

    }
}