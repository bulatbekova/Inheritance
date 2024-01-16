public class Programmer extends Person{
    private String companyName;
    public Programmer() {
        super();
    }

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println(companyName + " name");
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
        return "PROGRAMMER{" +
                " name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", companyName= '" + companyName + '\'' +
                '}';
    }
}
