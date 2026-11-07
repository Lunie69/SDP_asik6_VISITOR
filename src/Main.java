import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menu = new ArrayList<>();

        menu.add(new CheremshaSalad("Fresh Cheremsha Salad", 1800, 250));
        menu.add(new CheremshaSoup("Cheremsha Soup", 2280, 180));
        menu.add(new CheremshaSauce("Cheremsha Sauce", 670, 67));

        System.out.println("PRICE ANALYSIS");

        PriceVisitor priceVisitor = new PriceVisitor();

        for (MenuItem item : menu) {
            item.accept(priceVisitor);
        }

        priceVisitor.showTotal();

        System.out.println("\nNUTRITION ANALYSIS");

        NutritionVisitor nutritionVisitor = new NutritionVisitor();

        for (MenuItem item : menu) {
            item.accept(nutritionVisitor);
        }

        nutritionVisitor.showTotal();
    }
}