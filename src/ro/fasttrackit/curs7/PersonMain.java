package ro.fasttrackit.curs7;

public class PersonMain {
    public static void main(String[] args) {
        Person myPerson = new Person("Petronela", 27, true);

        System.out.print(myPerson.getName() + " , ");
        System.out.print(myPerson.getAge() + " , ");
        System.out.print(myPerson.getMarried());
        System.out.println(" ");

        Person mircea = new Person("Mircea", 17, true);
        Person claudia = new Person("Claudia", 19, false);
        Person ionel = new Person("Ionel", -33, true);

        mircea.printPerson();
        claudia.printPerson();
        ionel.printPerson();
    }
}
