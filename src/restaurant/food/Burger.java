package restaurant.food;

public class Burger extends Food {

    private double priceBig = 4.0;
    private double priceSmall = 2.0;

    public Burger(String size) {

        switch (size) {
            case "big":
                this.name = "Big Burger";
                this.price = priceBig;
                break;
            case "small":
                this.name = "Small Burger";
                this.price = priceSmall;
                break;
            default:
                this.name = "Unknown size burger";
                this.price = 0.0;
                break;
        }

    }


}
