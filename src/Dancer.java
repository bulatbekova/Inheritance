public class Dancer extends Person {
    private String groupName;

    @Override
    public void eat() {
        super.eat();
    }

    public Dancer() {
        super();
    }
    @Override
    public void walk() {
        super.walk();
    }
    public void dancing (){
        System.out.println(groupName + " Dancer");
    }
    @Override
    public void learn() {
        super.learn();
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }



    public String toString() {
        return "DANCER{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", groupName= '" + groupName + '\'' +
                '}';
    }
}
