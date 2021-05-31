package subproducts.electronics;
import store.Product;
import subproducts.Subproducts;
import users.Seller;
public class TV extends Product implements Subproducts {
    private Product [] tv;

    public Product[] getListOfProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("OnePlus Y TV");
        product1.setCost("20000");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Sony Bravia 4k 55");
        product2.setCost("140000");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Samsung Galaxy TV");
        product3.setCost("90000");

        tv = new Product [3];
        tv[0] = product1;
        tv[1] = product2;
        tv[2] = product3;
        return tv;
    }

    public void setListOfProducts(Product[] tv) {
        this.tv = tv;
    }

    public TV(){

    }
    public TV(String productId, String cost, String productName, Seller seller, Product[] tv) {
        super(productId, cost, productName, seller);
        this.tv = tv;
    }

    public TV(Product[] tv) {
        this.tv = tv;
    }

    @Override
    public Product[] setListOfProducts() {
        return null;
    }

    
}
