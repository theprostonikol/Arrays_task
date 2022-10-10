public class Order {
   String [] products;

   public void getOrder(String[] getProducts) {
       products = getProducts;
   }
   public void showProducts() {
       for (int i = 0; i < products.length; i++) {
           System.out.println("№" + i + " : " + products[i]);
       }
   }

}
