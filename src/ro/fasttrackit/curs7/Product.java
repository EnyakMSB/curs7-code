package ro.fasttrackit.curs7;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void printProduct() {
        System.out.println(getName() + " costa : " + getPrice() + " ron , in stoc in cantitatea de "
                + getQuantity() + ", in categoria " + getCategory());

    }

    boolean isCategory(String category) {
        if (this.category.equals(category)) {
            return true;
        } else {
            return false;
        }
    }

    boolean hasStock() {
        return quantity > 0;
    }

    String getName() {

        return name;
    }

    double getPrice() {

        return price < 0 ? 0 : price;
    }

    int getQuantity() {

        return quantity < 0 ? 0 : quantity;
    }

    String getCategory() {

        return category;
    }
}


