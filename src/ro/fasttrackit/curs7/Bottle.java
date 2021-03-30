package ro.fasttrackit.curs7;

public class Bottle {
    private int capacity;
    private int available;
    private boolean open;

    Bottle(int capacity, int available, boolean open) {
        this.capacity = capacity;
        this.available = available;
        this.open = false;
    }

    boolean moreThen() {
        return capacity / 2 < available;
    }

    public int drinkLiquid(int drink) {
        if (this.getAvailable() > 0) {
            int newAvailable = this.getAvailable() - drink;
            if (newAvailable > 0) {
                return newAvailable;
            } else {
                return 0;

            }
        } else {
            System.out.println("Sticla este goala deja!");
            return 0;
        }
    }

    int emptyCapacity() {
        if (this.available <= this.capacity) {
            int empty = this.capacity - getAvailable();
            return empty;
        } else {
            return 0;
        }
    }

    int getCapacity() {
        if (capacity < 1) {
            System.out.println("Capacitatea sticlei trebuie sa fie mai mare ca 1");
        } else {
            return capacity;
        }
        return 0;
    }

    int getAvailable() {
        if (this.available < 0) {
            return 0;
        } else {
            return available;
        }
    }

    public boolean openBottle() {
        if (!open) {
            this.open = true;
        }
        return true;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClosed() {
        return open = false;
    }
}
