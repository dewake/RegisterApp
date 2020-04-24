package models;

public class User {

    private String userName;
    private String password, mobile;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    public User(String userName, String password, String mobile) {
        this.userName = userName;
        this.password = password;
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return userName + "," + password + "," + mobile;
    }

}
