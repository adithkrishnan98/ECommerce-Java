package store;
import users.Seller;
public class Product {
    private String productId;
    private String cost;
    private String productName;
    private Seller seller;
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getCost() {
        return cost;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Seller getSeller() {
        return seller;
    }
    public void setSeller(Seller seller) {
        this.seller = seller;
    }
    public Product(String productId, String cost, String productName, Seller seller) {
        this.productId = productId;
        this.cost = cost;
        this.productName = productName;
        this.seller = seller;
    }
    public Product(){
    }
}
