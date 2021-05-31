package subproducts.electronics;
import store.Product;
import subproducts.Subproducts;
import users.Seller;
public class Mobile extends Product implements Subproducts {
    private Product [] mobiles;

    public Product[] getListOfProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("OnePlus 7T");
        product1.setCost("30000");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Samsung Galaxy S21");
        product2.setCost("70000");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Apple IPhone 12 Pro");
        product3.setCost("80000");

        mobiles = new Product [3];
        mobiles[0] = product1;
        mobiles[1] = product2;
        mobiles[2] = product3;
        return mobiles;
    }

    public void setListOfProducts(Product[] mobiles) {
        this.mobiles = mobiles;
    }

    public Mobile(){
        
    }
    public Mobile(String productId, String cost, String productName, Seller seller, Product[] mobiles) {
        super(productId, cost, productName, seller);
        this.mobiles = mobiles;
    }

    public Mobile(Product[] mobiles) {
        this.mobiles = mobiles;
    }

    @Override
    public Product[] setListOfProducts() {
        return null;
    }

    
}
