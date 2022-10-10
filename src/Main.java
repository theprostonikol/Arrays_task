public class Main {
    public static void main(String[] args) {
        String[] newProducts = {"Milk", "Butter","Water","Chocolate"};

        Order order = new Order();

        order.getOrder(newProducts);
        order.showProducts();
    }
}