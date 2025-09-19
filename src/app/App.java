package app;

import restaurant.Order;
import restaurant.food.Burger;
import restaurant.food.Drink;
import restaurant.food.Food;
import restaurant.food.Pizza;
import restaurant.food.Sub;
import restaurant.food.Topping;

public class App {
    public static void main(String[] args) throws Exception {

        Order order = new Order();

        Food burger1 = new Burger("big");
        Food pizza1 = new Pizza("medium");

        pizza1.addTopping(new Topping("onion"));
        pizza1.addTopping(new Topping("cheese"));
        pizza1.addTopping(new Topping("beef"));

        Food sub1 = new Sub("chicken");
        Food burger2 = new Burger("small");
        burger2.addTopping(new Topping("cheese"));

        Food drink1 = new Drink("coke");
        Food drink2 = new Drink("sprite");
        drink2.addTopping(new Topping("beef"));

        order.addItem(burger1);
        order.addItem(pizza1);
        order.addItem(sub1);
        order.addItem(burger2);
        order.addItem(drink1);
        order.addItem(drink2);

        order.displayOrder();

    }
}
