package users;
public abstract class User {
    String userId = " ";
    String password = " ";
    String loginStatus = " ";
    abstract Boolean verifyUser();
    public User(String userId, String password, String loginStatus) {
        this.userId = userId;
        this.password = password;
        this.loginStatus = loginStatus;
    }
    public User(){
    }
}
