package restaurant.food;

import java.util.ArrayList;

public class Food {
    protected String name;
    protected double price;

    private ArrayList<Topping> toppings = new ArrayList<>();

    public void displayInfo() {
        System.out.println(this.name + " - $" + this.price);

        if (toppings.size() > 0) {
            for (Topping topping : toppings) {
                System.out.println(" + " + topping.getName() + " - " + "$" + topping.getPrice());
            }
            System.out.println();
        }
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        this.price += topping.getPrice();
    }

}
