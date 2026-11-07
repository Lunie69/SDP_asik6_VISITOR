public class CheremshaSoup implements MenuItem {
    private String name;
    private double price;
    private int calories;

    public CheremshaSoup(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public void accept(MenuVisitor visitor) {
        visitor.visitSoup(this);
    }
}