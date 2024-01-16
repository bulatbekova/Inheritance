public class Singer extends Person{
    private String bandName;
    public Singer() {
        super();
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    public void singer(){
        System.out.println(getName()+ " is singing");
    }
    public void playGuitar(){
        System.out.println(getName() + "is playing in guitar");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void learn() {
        super.learn();
    }
    public String toString() {
        return "SINGER{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", bandName= '" + bandName + '\'' +
                '}';
    }
}
