public class NutritionVisitor implements MenuVisitor {
    private int totalCalories = 0;

    @Override
    public void visitSalad(CheremshaSalad salad) {
        System.out.println(salad.getName() + " calories: "
                + salad.getCalories() + "kcal");

        totalCalories += salad.getCalories();
    }

    @Override
    public void visitSoup(CheremshaSoup soup) {
        System.out.println(soup.getName() + " calories: "
                + soup.getCalories() + "kcal");

        totalCalories += soup.getCalories();
    }

    @Override
    public void visitSauce(CheremshaSauce sauce) {
        System.out.println(sauce.getName() + " calories: "
                + sauce.getCalories() + "kcal");

        totalCalories += sauce.getCalories();
    }

    public void showTotal() {
        System.out.println("Total menu calories: "
                + totalCalories + "kcal");
    }
}