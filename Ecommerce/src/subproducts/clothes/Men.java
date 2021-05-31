package subproducts.clothes;
import store.Product;
import subproducts.Subproducts;
import users.Seller;
public class Men extends Product implements Subproducts {
    private Product [] menProducts;

    public Product[] getListOfProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Red Checked Shirt");
        product1.setCost("100");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Blue Jeans");
        product2.setCost("200");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Brown Jacket");
        product3.setCost("500");


        menProducts = new Product [3];
        menProducts[0] = product1;
        menProducts[1] = product2;
        menProducts[2] = product3;
        return menProducts;
    }

    public void setListOfProducts(Product[] menProducts) {
        this.menProducts = menProducts;
    }

    public Men(){
        
    }
    public Men(String productId, String cost, String productName, Seller seller, Product[] menProducts) {
        super(productId, cost, productName, seller);
        this.menProducts = menProducts;
    }

    public Men(Product[] menProducts) {
        this.menProducts = menProducts;
    }

    @Override
    public Product[] setListOfProducts() {
        return null;
    }

    
}