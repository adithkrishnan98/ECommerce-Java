package users;
import store.Cart;
public class Customer extends User {
    private Cart cart;
    private String contact;
    @Override
    public Boolean verifyUser(){
        return true;
    }
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
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
    public void setContactNo(String contact){
        this.contact = contact;
    }
    public String getContactNo(){
        return contact;
    }
    public Customer(Cart cart) {
        this.cart = cart;
    }
    public Customer(String userId, String password, String loginStatus, String contact) {
        super(userId, password, loginStatus);
        this.contact = contact;
    }
    public Customer(String contact) {
        this.contact = contact;
    }
    public Customer(){
    }
}
