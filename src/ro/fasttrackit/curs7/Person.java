package ro.fasttrackit.curs7;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public void printPerson() {
        System.out.println(getName() + ", " + getAge() + " ani " + " este casatorit? " + getMarried());
    }

    /*
        public boolean LegalAge() {
            if (this.age < 18) {
                return false;
            }
            return true;
        }
    */
    String getName() {

        return name;
    }

    int getAge() {

        return age < 0 ? 0 : age;
    }

    boolean getMarried() {
        return married;
    }
}
