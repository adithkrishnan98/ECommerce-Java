package users;
import store.Product;
public class Seller extends User {
    private Product [] productsListed;
    private Product [] updatedProductsListed;
    private String contact;
    @Override
    public Boolean verifyUser() {
        return true;
    }
    public Product[] getProductsListed() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Product-1");
        product1.setCost("100");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Product-2");
        product2.setCost("200");

        productsListed = new Product [2];
        productsListed[0] = product1;
        productsListed[1] = product2;
        return productsListed;
    }
    public void setProductsListed(Product[] productsListed) {
        this.productsListed = productsListed;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getContactNo(){
        return contact;
    }
    public void setContactNo(String contact){
        this.contact = contact;
    }
    public Product[] getUpdatedProductsListed() {
        return updatedProductsListed;
    }
    public void setUpdatedProductsListed(Product[] updatedProductsListed) {
        this.updatedProductsListed = updatedProductsListed;
    }
    public Seller(String userId, String password, String loginStatus, String contact, Product[] productsListed,Product[] updatedProductsListed) {
        super(userId, password, loginStatus);
        this.contact = contact;
        this.productsListed = productsListed;
        this.updatedProductsListed = updatedProductsListed;
    }
    public Seller(String contact) {
        this.contact = contact;
    }
    public Seller(){
    }
    
    
}
