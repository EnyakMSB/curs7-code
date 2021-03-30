package ro.fasttrackit.curs7;

public class BottleMain {
    public static void main(String[] args) {
        Bottle myBottle=new Bottle(1000,644,false);

        System.out.println("Volumul sticlei : "+ myBottle.getCapacity());
        System.out.println("Cantitatea lichid existenta : " + myBottle.getAvailable());
        System.out.println("Cantitatea de lichid lipsa : " + myBottle.emptyCapacity());
        System.out.println("Cantitatea ramasa este mai mare ca si cea consumata? " + myBottle.moreThen());
        myBottle.openBottle();
        System.out.println("Sticla este deschisa? " + myBottle.isOpen());
        System.out.println("Cantitatea ramasa de lichid dupa consum valorii introduse este : " + myBottle.drinkLiquid(300));
    }
}
