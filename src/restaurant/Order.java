package restaurant;

import java.util.ArrayList;
import restaurant.food.Food;

public class Order {
    private double totalPrice = 0.0;

    private ArrayList<Food> items = new ArrayList<>();

    public void addItem(Food item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    public void displayOrder() {
        System.out.println("----------------------");
        System.out.println("Order Summary:");
        System.out.println("----------------------");
        for (Food item : items) {
            item.displayInfo();
        }

        System.out.println("----------------------");
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("----------------------");

    }

}
