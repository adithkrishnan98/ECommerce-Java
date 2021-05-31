package subproducts.clothes;
import store.Product;
import subproducts.Subproducts;
import users.Seller;
public class Women extends Product implements Subproducts {
    private Product [] womenProducts;

    public Product[] getListOfProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Pink Skirt");
        product1.setCost("400");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Yellow CropTop");
        product2.setCost("600");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Black Jeans");
        product3.setCost("200");

        womenProducts = new Product [3];
        womenProducts[0] = product1;
        womenProducts[1] = product2;
        womenProducts[2] = product3;
        return womenProducts;
    }

    public void getListOfProducts(Product[] womenProducts) {
        this.womenProducts = womenProducts;
    }

    public Women(){
        
    }
    public Women(String productId, String cost, String productName, Seller seller, Product[] womenProducts) {
        super(productId, cost, productName, seller);
        this.womenProducts = womenProducts;
    }

    public Women(Product[] womenProducts) {
        this.womenProducts = womenProducts;
    }

    @Override
    public Product[] setListOfProducts() {
        return null;
    }

    
}
