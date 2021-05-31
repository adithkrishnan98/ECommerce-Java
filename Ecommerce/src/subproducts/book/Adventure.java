package subproducts.book;
import store.Product;
import subproducts.Subproducts;
import users.Seller;
public class Adventure extends Product implements Subproducts {
    private Product [] adventureProducts;

    public Product[] getListOfProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("The Secret Seven");
        product1.setCost("400");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("The Famous Five");
        product2.setCost("500");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Treasure Island");
        product3.setCost("200");


        adventureProducts = new Product [3];
        adventureProducts[0] = product1;
        adventureProducts[1] = product2;
        adventureProducts[2] = product3;
        return adventureProducts;
    }

    public void setListOfProducts(Product[] adventureProducts) {
        this.adventureProducts = adventureProducts;
    }

    public Adventure(){

    }
    
    public Adventure(String productId, String cost, String productName, Seller seller, Product[] adventureProducts) {
        super(productId, cost, productName, seller);
        this.adventureProducts = adventureProducts;
    }

    public Adventure(Product[] adventureProducts) {
        this.adventureProducts = adventureProducts;
    }

    @Override
    public Product[] setListOfProducts() {
        return null;
    }
}
