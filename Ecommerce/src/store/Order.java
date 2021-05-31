package store;
import users.Customer;
public class Order {
    private String orderId;
    private Customer user;
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Customer getUser() {
        return user;
    }
    public void setUser(Customer user) {
        this.user = user;
    }
    public Order(String orderId, Customer user) {
        this.orderId = orderId;
        this.user = user;
    }
    public Order(){
    }
}
