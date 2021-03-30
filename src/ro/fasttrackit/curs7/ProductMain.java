package ro.fasttrackit.curs7;

public class ProductMain {
    public static void main(String[] args) {

        Product myProduct = new Product("Monitor", 999.99, 5, "Monitoare");

//       System.out.println(myProduct.getName());
//       System.out.println(myProduct.getPrice());
//       System.out.println(myProduct.getQuantity());
//       System.out.println(myProduct.getCategory());
        myProduct.printProduct();
        System.out.println(myProduct.hasStock());
        System.out.println(myProduct.isCategory("Monitoare"));

        Product monitor = new Product("Samsung", 899.99, 2, "Mouse");
        System.out.println("\n" + monitor.getName() + ", " + monitor.getPrice() + ", " + monitor.getQuantity() + ", "
                + monitor.hasStock() + ", " + monitor.isCategory("Monitoare"));

        Product mouse = new Product("Logitech", 23.50, 17, "Mouse");
        System.out.println(mouse.getName() + ", " + mouse.getPrice() + ", " + mouse.getQuantity() + ", "
                + mouse.hasStock() + ", " + mouse.isCategory("Mouse"));

        Product tastatura = new Product("Marvo", -999.99, -4, "SSD");
        System.out.println(tastatura.getName() + ", " + tastatura.getPrice() + ", " + tastatura.getQuantity() + ", "
                + tastatura.hasStock() + ", " + tastatura.isCategory("Tastaturi"));

    }
}
