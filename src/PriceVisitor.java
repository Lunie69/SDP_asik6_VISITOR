public class PriceVisitor implements MenuVisitor {
    private double totalPrice = 0;

    @Override
    public void visitSalad(CheremshaSalad salad) {
        System.out.println(salad.getName() + " price: "
                + salad.getPrice() + "KZT");

        totalPrice += salad.getPrice();
    }

    @Override
    public void visitSoup(CheremshaSoup soup) {
        System.out.println(soup.getName() + "price: "
                + soup.getPrice() + "KZT");

        totalPrice += soup.getPrice();
    }

    @Override
    public void visitSauce(CheremshaSauce sauce) {
        System.out.println(sauce.getName() + "price: "
                + sauce.getPrice() + "KZT");

        totalPrice += sauce.getPrice();
    }

    public void showTotal() {
        System.out.println("Total menu price: "
                + totalPrice + "KZT");
    }
}