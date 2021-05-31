package users;
public class Admin extends User {

    @Override
    public Boolean verifyUser() {
        return true;
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
    public String getCustomerContact(){
        Customer c = new Customer();
        c.setContactNo("+919898787678");
        String contact = c.getContactNo();
        return contact;
    }
    public String getSellerContact(){
        Seller s = new Seller();
        s.setContactNo("+918767856456");
        String contact = s.getContactNo();
        return contact;
    }
    public Admin(String userId, String password, String loginStatus) {
        super(userId, password, loginStatus);
    }
    public Admin(){
    }
}
