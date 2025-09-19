package restaurant.food;

public class Drink extends Food {

    double priceCola = 8.0;
    double priceSprite = 8.0;
    double priceFanta = 8.5;

    double priceTea = 5.0;
        

    public Drink(String name) {

        switch(name) {
            case "coke":
                this.name = "Cola";
                this.price = priceCola;
                break;
            case "sprite":
                this.name = "Sprite";
                this.price = priceSprite;
                break;
            case "fanta":
                this.name = "Fanta";
                this.price = priceFanta;
                break;
            case "tea":
                this.name = "Tea";
                this.price = priceTea;
                break;
            default:
                this.name = "Unknown drink";
                this.price = 0.0;
                break;
        }
    }

    @Override
    public void addTopping(Topping topping) {
        System.out.println("You cannot add toppings to a drink.");
    }

}
