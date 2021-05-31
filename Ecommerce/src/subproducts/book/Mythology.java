package subproducts.book;
import store.Product;
import subproducts.Subproducts;
import users.Seller;
public class Mythology extends Product implements Subproducts{
    private Product [] mythologyProducts;

    public Product[] getListOfProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Immortals of Meluha");
        product1.setCost("400");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Secret of the Nagas");
        product2.setCost("300");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Oath of the Vayuputras");
        product3.setCost("600");


        mythologyProducts = new Product [3];
        mythologyProducts[0] = product1;
        mythologyProducts[1] = product2;
        mythologyProducts[2] = product3;
        return mythologyProducts;
    }

    public void setListOfProducts(Product[] mythologyProducts) {
        this.mythologyProducts = mythologyProducts;
    }

    public Mythology(){

    }
    
    public Mythology(String productId, String cost, String productName, Seller seller, Product[] mythologyProducts) {
        super(productId, cost, productName, seller);
        this.mythologyProducts = mythologyProducts;
    }

    public Mythology(Product[] mythologyProducts) {
        this.mythologyProducts = mythologyProducts;
    }

    @Override
    public Product[] setListOfProducts() {
        return null;
    }

    
}
