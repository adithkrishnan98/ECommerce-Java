package subproducts.clothes;
import store.Product;
import subproducts.Subproducts;
import users.Seller;
public class Kids extends Product implements Subproducts{
    private Product [] kidsProducts;

    public Product[] getListOfProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Blue Shorts");
        product1.setCost("200");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Brown T-Shirt");
        product2.setCost("300");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Red Shoes");
        product3.setCost("500");

        kidsProducts = new Product [3];
        kidsProducts[0] = product1;
        kidsProducts[1] = product2;
        kidsProducts[2] = product3;
        return kidsProducts;
    }

    public void setListOfProducts(Product[] kidsProducts) {
        this.kidsProducts = kidsProducts;
    }

    public Kids(){
        
    }
    public Kids(String productId, String cost, String productName, Seller seller, Product[] kidsProducts) {
        super(productId, cost, productName, seller);
        this.kidsProducts = kidsProducts;
    }

    public Kids(Product[] kidsProducts) {
        this.kidsProducts = kidsProducts;
    }

    @Override
    public Product[] setListOfProducts() {
        return null;
    }

    
}
