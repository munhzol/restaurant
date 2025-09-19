package restaurant.food;

public class Topping {
    private String name;
    private double price;

    double priceOnion = 1.0;
    double priceCheese = 1.0;
    double priceBeef = 2.0;
    double priceTomata = 1.5;
        

    public Topping(String name) {

        switch(name) {
            case "onion":
                this.name = "Onion";
                this.price = priceOnion;
                break;
            case "cheese":
                this.name = "Cheese";
                this.price = priceCheese;
                break;
            case "beef":
                this.name = "Beef";
                this.price = priceBeef;
                break;
            case "tomata":
                this.name = "Tomata";
                this.price = priceTomata;
                break;
            default:
                this.name = "Unknown topping";
                this.price = 0.0;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
