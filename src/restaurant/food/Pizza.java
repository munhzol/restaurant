package restaurant.food;

public class Pizza extends Food {

    private double priceBig = 15.0;
    private double priceMedium = 10.0;
    private double priceSmall = 5.0;

    public Pizza(String size) {

        switch (size) {
            case "big":
                this.name = "Big Pizza";
                this.price = priceBig;
                break;
            case "medium":
                this.name = "Medium Pizza";
                this.price = priceMedium;
                break;
            case "small":
                this.name = "Small Pizza";
                this.price = priceSmall;
                break;
            default:
                this.name = "Unknown size pizza";
                this.price = 0.0;
                break;
        }

    }

    public String getName() {
        return "Pizza: " + this.name;
    }


}
