package restaurant.food;

public class Sub extends Food {
    
    private double priceBeef = 6.0;
    private double priceChicken = 5.0;
    private double priceVeggie = 3.0;

    public Sub(String type) {

        switch (type) {
            case "beef":
                this.name = "Beef Sub";
                this.price = priceBeef;
                break;
            case "chicken":
                this.name = "Chicken Sub";
                this.price = priceChicken;
                break;
            case "veggie":
                this.name = "Veggie Sub";
                this.price = priceVeggie;
                break;
            default:
                this.name = "Unknown type sub";
                this.price = 0.0;
                break;
        }

    }

}
