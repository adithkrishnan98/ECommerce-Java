package subproducts.electronics;
import store.Product;
import subproducts.Subproducts;
import users.Seller;
public class Laptop extends Product implements Subproducts {
    private Product [] laptops;

    public Product[] getListOfProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Mackbook Pro 13inch ");
        product1.setCost("100000");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Dell Inspiron 400");
        product2.setCost("65000");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Microsoft Surface Laptop 4");
        product3.setCost("90000");

        laptops = new Product [3];
        laptops[0] = product1;
        laptops[1] = product2;
        laptops[2] = product3;
        return laptops;
    }

    public void setListOfProducts(Product[] laptops) {
        this.laptops = laptops;
    }

    public Laptop(){
        
    }
    public Laptop(String productId, String cost, String productName, Seller seller, Product[] laptops) {
        super(productId, cost, productName, seller);
        this.laptops = laptops;
    }

    public Laptop(Product[] laptops) {
        this.laptops = laptops;
    }

    @Override
    public Product[] setListOfProducts() {
        return null;
    }

    
}
