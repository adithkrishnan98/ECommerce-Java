package subproducts.book;
import store.Product;
import subproducts.Subproducts;
import users.Seller;
public class Fiction extends Product implements Subproducts {
    private Product [] fictionProducts;

    public Product[] getListOfProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Daisy's Adventure");
        product1.setCost("200");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Bob the Builder");
        product2.setCost("300");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Alice in Wonderland");
        product3.setCost("400");


        fictionProducts = new Product [3];
        fictionProducts[0] = product1;
        fictionProducts[1] = product2;
        fictionProducts[2] = product3;
        return fictionProducts;
    }

    public void setListOfProducts(Product[] fictionProducts) {
        this.fictionProducts = fictionProducts;
    }

    public Fiction(){

    }
    
    public Fiction(String productId, String cost, String productName, Seller seller, Product[] fictionProducts) {
        super(productId, cost, productName, seller);
        this.fictionProducts = fictionProducts;
    }

    public Fiction(Product[] fictionProducts) {
        this.fictionProducts = fictionProducts;
    }

    @Override
    public Product[] setListOfProducts() {
        return null;
    }

    
}
